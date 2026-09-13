plugins {
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.spring.dependency.management)
}

dependencies {
    implementation(project(":liquid-api"))
    implementation(project(":liquid-core"))
    implementation(project(":liquid-jooq"))

    implementation(libs.spring.boot.starter.webmvc)
    implementation(libs.spring.boot.starter.security)
    implementation(libs.spring.boot.starter.security.oauth2.client)
    implementation(libs.spring.boot.starter.validation)
    implementation(libs.spring.boot.starter.flyway)
    implementation(libs.spring.boot.starter.jooq)
    implementation(libs.flyway.database.postgresql)
    implementation(libs.kotlin.reflect)
    implementation(libs.jackson.module.kotlin)

    developmentOnly(libs.spring.boot.devtools)
    developmentOnly(libs.spring.boot.docker.compose)
    runtimeOnly(libs.postgresql)

    testImplementation(libs.spring.boot.starter.flyway.test)
    testImplementation(libs.spring.boot.starter.jooq.test)
    testImplementation(libs.spring.boot.starter.security.oauth2.client.test)
    testImplementation(libs.spring.boot.starter.security.test)
    testImplementation(libs.spring.boot.starter.webmvc.test)
    testImplementation(libs.kotlin.test.junit5)
    testRuntimeOnly(libs.junit.platform.launcher)
    testImplementation(kotlin("test"))
}
