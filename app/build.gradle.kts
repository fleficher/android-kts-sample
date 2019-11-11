plugins {
    androidApp()
    kotlinAndroid()
    kotlinAndroidExt()
    ktlint(includeVersion = false)
    detekt(includeVersion = false)
}

android {
    setDefaultSigningConfigs(project)
    useDefaultConfig()
    useDefaultBuildTypes()
}

dependencies {
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
