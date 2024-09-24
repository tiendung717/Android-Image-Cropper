plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlin.parcelize)
    alias(libs.plugins.ksp)
}

val buildSdkVersion: Int by rootProject.extra
val composeCompilerVersion: String by rootProject.extra
val minimumSdkVersion: Int by rootProject.extra

android {
    namespace = "com.canhub.cropper"
    compileSdk = buildSdkVersion

    defaultConfig {
        minSdk = minimumSdkVersion
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    // AndroidX
    implementation(libs.bundles.androidx)
//    implementation(libs.androidx.exifinterface)
//    implementation(libs.kotlinx.coroutines.android)
//    implementation(libs.kotlinx.coroutines.core)
}