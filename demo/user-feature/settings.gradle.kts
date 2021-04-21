pluginManagement {
    includeBuild("../build-logic")
    repositories { gradlePluginPortal() }
}

dependencyResolutionManagement {
    includeBuild("../domain-model")
    repositories { mavenCentral() }
}

include("data", "ui")