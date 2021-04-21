plugins {
    id("java")
    id("org.springframework.boot")
}

group = "com.example.myproduct"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.4.5")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:2.4.5")
}
