plugins {
    androidLibrary()
    kotlinAndroid()
    ktlint(includeVersion = false)
    detekt(includeVersion = false)
}

android {
    setDefaultConfig()
    useDefaultBuildTypes()

    defaultConfig {
        versionCode = 1
        versionName = "1.0"
        consumerProguardFiles("proguard-rules.pro")
    }
}

dependencies {
    implementation(Libraries.Kotlin.stdlib)
    implementation(Libraries.Androidx.appcompat)
    implementation(Libraries.Androidx.Ktx.core)
}

ktlint {
    android.set(true)
}
