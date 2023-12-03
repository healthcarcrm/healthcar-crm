group = "com.healthcar"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

plugins {
	java
	id("org.springframework.boot") version "3.1.4"
	id("io.spring.dependency-management") version "1.1.3"
	id("com.github.spotbugs") version "5.1.4"
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.liquibase:liquibase-core:4.24.0")
	compileOnly("org.projectlombok:lombok")
	implementation("org.postgresql:postgresql")
	annotationProcessor("org.projectlombok:lombok")
	
	//openapi
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")

	//metrics
	implementation("io.micrometer:micrometer-registry-prometheus:1.12.0")

	//test dependencies
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("com.h2database:h2:1.3.148")

	//spotbugs plugin dependencies
	spotbugsPlugins("com.h3xstream.findsecbugs:findsecbugs-plugin:1.12.0")
	spotbugsPlugins("com.mebigfatguy.sb-contrib:sb-contrib:7.4.7")
}

java {
	sourceCompatibility = JavaVersion.VERSION_17
	targetCompatibility = JavaVersion.VERSION_17
}

sourceSets {
	main {
		java {
			srcDir("src/main/java")
		}
		resources {
			srcDir("src/main/resources")
		}
	}
	test {
		java {
			srcDir("src/test/java")
		}
		resources {
			srcDir("src/test/resources")
		}
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<Copy>() {
	duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.spotbugsMain {
	reports.create("html") {
		required.set(true)
		outputLocation.set(file("${project.projectDir}/build/reports/spotbugs.html"))
		setStylesheet("fancy-hist.xsl")
	}
}