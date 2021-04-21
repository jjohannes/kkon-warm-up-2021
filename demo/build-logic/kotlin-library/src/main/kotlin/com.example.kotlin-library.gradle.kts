plugins {
    id("org.jetbrains.kotlin.jvm")
    id("java-library")
}

group = "com.example.myproduct"

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "11"
}

tasks.register<CountTask>("count") {
    filesToCount.from(tasks.compileKotlin)
    countTxt.set(layout.buildDirectory.file("reports/count.txt"))
}
