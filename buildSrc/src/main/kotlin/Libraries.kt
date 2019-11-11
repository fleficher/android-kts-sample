object Libraries {

    object Kotlin {
        private const val version = "1.3.50" // Don't forget to update the version in buildSrc too !

        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
    }


    object Androidx {
        const val appcompat = "androidx.appcompat:appcompat:1.1.0"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"

        object Ktx {
            const val core = "androidx.core:core-ktx:1.1.0"
        }
    }

    object TestLibraries {
        const val junit = "junit:junit:4.12"
    }

    object AndroidTestLibraries {
        const val runner = "androidx.test:runner:1.2.0"

        object Espresso {
            private const val version = "3.2.0"

            const val core = "androidx.test.espresso:espresso-core:$version"
        }
    }
}
