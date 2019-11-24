import configuration.getConfiguration

plugins {
    androidApp()
    kotlinAndroid()
    kotlinAndroidExt()
    ktlint(includeVersion = false)
    detekt(includeVersion = false)
}

android {
    setDefaultSigningConfigs(project)
    setAppConfig()
    useDefaultBuildTypes()

    defaultConfig {
        buildConfigBoolean("ENABLE_CRASH_REPORTING", true)
    }

    buildTypes {
        getByName("debug") {
            val configuration = getConfiguration()
            manifestPlaceholders = mapOf("secret" to configuration.secret)
        }
        getByName("release") {
            val configuration = getConfiguration()
            manifestPlaceholders = mapOf("secret" to configuration.secret)
        }
    }
}

dependencies {
    implementation(project(Modules.library))

    implementation(Libraries.Kotlin.stdlib)
    implementation(Libraries.Androidx.appcompat)
    implementation(Libraries.Androidx.constraintlayout)
    implementation(Libraries.Androidx.Ktx.core)

    testImplementation(Libraries.TestLibraries.junit)
    androidTestImplementation(Libraries.AndroidTestLibraries.runner)
    androidTestImplementation(Libraries.AndroidTestLibraries.Espresso.core)
}

ktlint {
    android.set(true)
}
