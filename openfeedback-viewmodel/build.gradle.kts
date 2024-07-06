plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.multiplatform")
    id("org.jetbrains.kotlin.plugin.serialization")
}

library(
    namespace = "io.openfeedback.viewmodels",
    compose = true,
    publish = true,
) { kotlinMultiplatformExtension ->
    kotlinMultiplatformExtension.sourceSets {
        getByName("commonMain") {
            dependencies {
                implementation(projects.openfeedback)
                implementation(kotlinMultiplatformExtension.compose.runtime)
                // Not sure why this is needed 🤷
                implementation(libs.jetbrains.kotlin.stdlib)
                api(libs.androidx.lifecycle.viewmodel.compose)
                api(libs.vanniktech.multiplatform.locale)
            }
        }
    }
}