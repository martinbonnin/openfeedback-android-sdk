package io.openfeedback.plugins

import com.android.build.gradle.LibraryExtension
import io.openfeedback.OpenFeedback
import io.openfeedback.extensions.configureAndroidCompose
import io.openfeedback.extensions.configureKotlinAndroid
import io.openfeedback.extensions.configureKotlinCompiler
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class ComposeLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target.pluginManager) {
            apply("com.android.library")
            apply("org.jetbrains.kotlin.android")
            apply("maven-publish")
            apply("signing")
        }

        target.extensions.create("openfeedback", OpenFeedback::class.java, target)
        target.extensions.configure<LibraryExtension> {
            configureKotlinAndroid()
            configureAndroidCompose(target)
            defaultConfig.targetSdk = 34
        }
        target.tasks.configureKotlinCompiler()
    }
}
