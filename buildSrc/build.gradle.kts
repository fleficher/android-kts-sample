plugins {
    kotlin("jvm").version("1.3.61")
}

repositories {
    google()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.android.tools.build:gradle:3.5.3")

    implementation("com.squareup.okhttp3:okhttp:4.3.1")
}
