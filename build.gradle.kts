plugins {
    id("org.gradle.presentation.asciidoctor")
}

presentation {
    githubUserName.set("jjohannes")
    githubRepoName.set("kkon-warm-up-2021")
}

dependencies {
    asciidoctor("org.asciidoctor:asciidoctorj-diagram:1.5.11")
}

tasks {
    asciidoctor {
        requires("asciidoctor-diagram")
    }
}