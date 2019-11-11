import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

fun BaseAppModuleExtension.useDefaultConfig() {
    compileSdkVersion(ProjectConfiguration.compileSdk)
    buildToolsVersion(ProjectConfiguration.buildTools)

    defaultConfig {
        minSdkVersion(ProjectConfiguration.minSdk)
        targetSdkVersion(ProjectConfiguration.targetSdk)

        applicationId = ProjectConfiguration.applicationId
        versionCode = ProjectConfiguration.versionCode
        versionName = ProjectConfiguration.versionName
        testInstrumentationRunner = ProjectConfiguration.testInstrumentationRunner
    }
}


fun BaseAppModuleExtension.useDefaultBuildTypes() = buildTypes {
    getByName("release") {
        isMinifyEnabled = true
        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
}
