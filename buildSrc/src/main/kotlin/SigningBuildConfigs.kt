import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project
import java.io.File
import java.io.FileInputStream
import java.lang.Exception
import java.util.*

fun BaseAppModuleExtension.setDefaultSigningConfigs(project: Project) = signingConfigs {
    it.getByName("debug") {
        it.storeFile = project.rootProject.file("debug-key.jks")
        it.storePassword = "android"
        it.keyAlias = "androiddebugkey"
        it.keyPassword = "android"
    }
    it.register("release") {
        val keystorePropertiesFile = project.rootProject.file("release.keystore.properties")
        if (!keystorePropertiesFile.exists()) {
            System.err.println("📜 Missing release.keystore.properties file for release signing")
        } else {
            val keystoreProperties = Properties().apply {
                load(FileInputStream(keystorePropertiesFile))
            }
            try {
                it.storeFile = File(keystoreProperties["storeFile"] as String)
                it.storePassword = keystoreProperties["storePassword"] as String
                it.keyAlias = keystoreProperties["keyAlias"] as String
                it.keyPassword = keystoreProperties["keyPassword"] as String
            } catch (e: Exception) {
                System.err.println("📜 release.keystore.properties file is malformed")
            }
        }
    }
}