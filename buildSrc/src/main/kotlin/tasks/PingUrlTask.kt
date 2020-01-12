package tasks

import okhttp3.OkHttpClient
import okhttp3.Request
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

open class PingUrlTask : DefaultTask() {
    @Input
    lateinit var url: String

    @TaskAction
    fun updateTranslations() {
        println("Begin task")

        val request = Request.Builder()
            .url(url)
            .build()
        val client = OkHttpClient()
        val response = client.newCall(request).execute()
        if (response.isSuccessful) {
            println("🚀 Ping SUCCEED ✅︎")
        } else {
            println("🚀 Ping Failed !")
        }
    }
}
