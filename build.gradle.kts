// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    dependencyUpdates()
    ktlint()
    detekt()
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}


task<tasks.PingUrlTask>("pingUrl") {
    url = "https://www.google.com"
}
