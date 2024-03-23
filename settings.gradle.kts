pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ru.mirea.Bykonya.Lesson2"
include(":app")
include(":app:activitylifecycle")
include(":app:multiactivity")
include(":app:intentfilter")
include(":app:toastapp")
include(":app:notificationapp")
include(":app:dialog")
