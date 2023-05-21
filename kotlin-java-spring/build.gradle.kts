import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.jetbrains.kotlin.jvm") version "1.6.21"
//    kotlin-spring 관련 어노테이션에 대한 allOpen 처리
    kotlin("plugin.spring") version "1.6.21"
//    noarg 처리
    kotlin("plugin.jpa") version "1.6.21"
//    id("org.jetbrains.kotlin.plugin.allopen") version "1.6.21"
//    kotlin("plugin.noarg") version "1.6.21"
}

//allOpen {
//    annotations("org.springframework.boot.autoconfigure.SpringBootApplication," +
//            "org.springframework.transaction.annotation.Transactional")
//}

//noArg {
//    annotations("javax.persistence.Entity")
//}

group = "com.fastcampus"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("com.h2database:h2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}