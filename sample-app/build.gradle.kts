plugins {
    id("io.openfeedback.plugins.app")
}

android {
    namespace = "io.openfeedback.android.sample"
    defaultConfig {
        versionCode = 1
        versionName = "1"
    }
}

dependencies {
    implementation(libs.androidx.core)
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("androidx.activity:activity-compose:1.7.0-alpha02")

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.material3)

    implementation(projects.openfeedbackM2)
    implementation(projects.openfeedbackM3)
}
