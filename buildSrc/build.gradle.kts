plugins {
    `kotlin-dsl`
}

val kotlinVersion = "1.3.50"

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.android.tools.build:gradle:3.5.3")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

    implementation("com.squareup.okhttp3:okhttp:4.3.1")
}
