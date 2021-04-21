plugins {
    id("com.example.java-library")
}

dependencies {
    api("com.example.myproduct:release")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.11.3")
}
