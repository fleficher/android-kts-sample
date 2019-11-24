package configuration

import buildConfigString

sealed class BuildType(val secret: String) {

    object DebugBuildType : BuildType(secret = "sword")

    object ReleaseBuildType : BuildType(secret = "shield")

}

fun com.android.build.gradle.internal.dsl.BuildType.getConfiguration(): BuildType {
    return when (this.name) {
        "release" -> BuildType.DebugBuildType
        else -> BuildType.DebugBuildType
    }
}
