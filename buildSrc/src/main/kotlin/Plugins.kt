import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

fun PluginDependenciesSpec.androidApp(): PluginDependencySpec =
    id("com.android.application")

fun PluginDependenciesSpec.androidLibrary(): PluginDependencySpec =
    id("com.android.library")

fun PluginDependenciesSpec.kotlinAndroid(): PluginDependencySpec =
    id("org.jetbrains.kotlin.android")

fun PluginDependenciesSpec.kotlinAndroidExt(): PluginDependencySpec =
    id("org.jetbrains.kotlin.android.extensions")

fun PluginDependenciesSpec.dependencyUpdates(): PluginDependencySpec =
    id("com.github.ben-manes.versions").version("0.24.0")

fun PluginDependenciesSpec.ktlint(includeVersion: Boolean = true): PluginDependencySpec =
    id("org.jlleitschuh.gradle.ktlint").also { if (includeVersion) it.version("8.2.0") }

fun PluginDependenciesSpec.detekt(includeVersion: Boolean = true): PluginDependencySpec =
    id("io.gitlab.arturbosch.detekt").also { if (includeVersion) it.version("1.1.1") }
