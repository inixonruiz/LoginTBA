plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    //Added the Google services Gradle plugin
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.logintba"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.logintba"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    //Imported the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:32.4.0"))
    //Added the dependencies for Firebase products you want to use
    implementation("com.google.firebase:firebase-analytics-ktx")
    //Added the dependency for the Firebase Authentication library
    implementation("com.google.firebase:firebase-auth-ktx")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}