plugins {
  id("com.android.application")
}

android {
  namespace = "com.example.logging"
  compileSdk = 37

  defaultConfig {
    applicationId = "com.example.logging"
    minSdk = 23
    targetSdk = 34
    versionCode = 1
    versionName = "1.0"
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
}

dependencies {
  implementation("com.jakewharton.timber:timber:5.0.1")
}
