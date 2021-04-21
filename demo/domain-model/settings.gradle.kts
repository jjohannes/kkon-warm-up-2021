pluginManagement {
    includeBuild("../build-logic")
    repositories { gradlePluginPortal() }
}

dependencyResolutionManagement {
    repositories { mavenCentral() }
}

include("release")
