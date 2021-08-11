package com.toggl.komposable.buildsrc

object Versions {
    const val ktlint = "0.38.1"
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0"
    const val gradleVersionsPlugin = "com.github.ben-manes:gradle-versions-plugin:0.36.0"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:2.7"
    // fixes warning thrown by SLF4J
    const val slf4j = "org.slf4j:slf4j-simple:1.7.26"

    object Test {
        const val kotestVersion = "4.2.3"

        const val junit4 = "junit:junit:4.13"
        const val robolectric = "org.robolectric:robolectric:4.5.1"
        const val junit5Plugin = "de.mannodermaus.gradle.plugins:android-junit5:1.7.1.1"
        const val kotestMatchers = "io.kotest:kotest-assertions-core-jvm:${kotestVersion}"
        const val kotestProperties = "io.kotest:kotest-property-jvm:${kotestVersion}"
        const val mockk = "io.mockk:mockk:1.12.0"
        const val mockkAndroid = "io.mockk:mockk-android:1.10.0"
        const val assertJ = "org.assertj:assertj-core:3.17.1"

        object Jupiter {
            private const val version = "5.7.1"
            // (Required) Writing and executing Unit Tests on the JUnit5 Platform
            const val api = "org.junit.jupiter:junit-jupiter-api:$version"
            const val engine = "org.junit.jupiter:junit-jupiter-engine:$version"
            // (Optional) If you need "Parameterized Tests"
            const val params = "org.junit.jupiter:junit-jupiter-params:$version"
        }
    }

    object Google {
        const val material = "com.google.android.material:material:1.3.0-beta01"
    }

    object Kotlin {
        const val version = "1.5.21"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"

        object Test {
            const val kotlinTest = "org.jetbrains.kotlin:kotlin-test:$version"
            const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:$version"
            const val kotlinTestJunit = "org.jetbrains.kotlin:kotlin-test-junit5:$version"
        }
    }

    object Coroutines {
        private const val version = "1.5.1"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"

        object Test {
            const val kotlinCoroutineTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
        }
    }

    object AndroidX {

        object Activity {
            const val version = "1.3.0"
            const val activityKtx = "androidx.activity:activity-ktx:$version"
            const val activityCompose = "androidx.activity:activity-compose:$version"
        }

        const val appcompat = "androidx.appcompat:appcompat:1.3.0"
        const val coreKtx = "androidx.core:core-ktx:1.6.0"

        object Compose {
            const val version = "1.0.1"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val compiler = "androidx.compose.compiler:compiler:$version"
            const val animation = "androidx.compose.animation:animation:$version"

            object UI {
                const val core = "androidx.compose.ui:ui:$version"
                const val tooling = "androidx.compose.ui:ui-tooling:$version"
                const val viewbinding = "androidx.compose.ui:ui-viewbinding:$version"
                const val junit = "androidx.compose.ui:ui-test-junit4:$version"
                const val testManifest = "androidx.compose.ui:ui-test-manifest:$version"
            }

            object Material {
                const val core = "androidx.compose.material:material:$version"
                const val ripple = "androidx.compose.material:material-ripple"
                const val icons = "androidx.compose.material:material-icons-extended:$version"
            }

            object Foundation {
                const val layout = "androidx.compose.foundation:foundation-layout:$version"
                const val core = "androidx.compose.foundation:foundation:$version"
            }
        }

        object Test {
            private const val version = "1.3.0"
            const val core = "androidx.test:core:$version"
            const val runner = "androidx.test:runner:$version"
            const val rules = "androidx.test:rules:$version"
            const val junit = "androidx.test.ext:junit:1.1.1"
            const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
        }

        object Lifecycle {
            private const val version = "2.4.0-alpha01"
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val ktx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:$version"
            const val compiler = "androidx.lifecycle:lifecycle-compiler:$version"
            const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
        }

        object Navigation {
            private const val version = "2.3.5"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val ui = "androidx.navigation:navigation-ui-ktx:$version"
        }
    }
}