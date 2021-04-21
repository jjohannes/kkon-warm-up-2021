pluginManagement {
    includeBuild("../build-logic")
    repositories { gradlePluginPortal() }
}

dependencyResolutionManagement {
    includeBuild("../user-feature")
    repositories { mavenCentral() }
}

include("app")