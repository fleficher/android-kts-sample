import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

fun BaseAppModuleExtension.setAppConfig() {
    compileSdkVersion(ProjectConfiguration.compileSdk)
    buildToolsVersion(ProjectConfiguration.buildTools)

    defaultConfig {
        it.apply {
            minSdkVersion(ProjectConfiguration.minSdk)
            targetSdkVersion(ProjectConfiguration.targetSdk)

            applicationId = ProjectConfiguration.applicationId
            versionCode = ProjectConfiguration.versionCode
            versionName = ProjectConfiguration.versionName
            testInstrumentationRunner = ProjectConfiguration.testInstrumentationRunner
        }
    }
}

fun BaseExtension.setDefaultConfig() {
    compileSdkVersion(ProjectConfiguration.compileSdk)
    buildToolsVersion(ProjectConfiguration.buildTools)

    defaultConfig {
        it.minSdkVersion(ProjectConfiguration.minSdk)
        it.targetSdkVersion(ProjectConfiguration.targetSdk)

        it.testInstrumentationRunner = ProjectConfiguration.testInstrumentationRunner
    }
}

fun BaseExtension.useDefaultBuildTypes() = buildTypes {
    it.getByName("release") {
        it.isMinifyEnabled = true
        it.proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
}
