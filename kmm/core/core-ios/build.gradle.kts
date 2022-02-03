plugins {
    kotlin("multiplatform")
}

version = "1.0"

kotlin {
    // Revert to just ios() when gradle plugin can properly resolve it
    ios()

    version = "1.1"

    sourceSets["commonMain"].dependencies {
        implementation(Deps.stately)
        implementation(Deps.Coroutines.common)
        implementation(Deps.koinCore)
        implementation(Deps.kermit)
    }

    sourceSets["commonTest"].dependencies {
    }

    sourceSets["iosMain"].dependencies {
    }
}

