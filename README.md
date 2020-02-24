# Open-Feedback Android SDK

An Android client for Open-Feeedback https://github.com/HugoGresse/open-feedback:

![screenshot](docs/screenshot.png)

The SDK exposes a regular View and a Composable if you want to try [compose](https://developer.android.com/jetpack/compose). Please consult the [sample-app](sample-app/src/main/java/io/openfeedback/android/sample/MainActivity.kt) for usage.

# Installation

The SDK is available on bintray and soon jcenter:

```
repositories {
    jcenter()
    // Remove when the SDK reaches jcenter, hopefully soon
    maven {
        url = uri("https://dl.bintray.com/openfeedback/Android/")
    }
}

dependencies {
    implementation("io.openfeedback:feedback-android-sdk-ui:0.0.1")
}
```

# Limitations and TODO

The SDK is still very young and misses some features, most notably comments. Feedbacks welcome.