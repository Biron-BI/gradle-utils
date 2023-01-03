Provide a small utility function to extract dependency version from gradle properties based on an extra key.

## Usage
```kotlin
plugins {
	id("com.biron-analytics.gradle-utils") version "1.0.1"
}
```

## Example

in your `gradle.properties`
```properties
version.arrow=1.1.2
version.kotest=5.5.4
```

in your build.gradle.kts
```kotlin
import com.biron.gradleUtils.pv

dependencies {
	implementation(pv("io.arrow-kt:arrow-core", "arrow"))
	implementation(pv("io.arrow-kt:arrow-fx-coroutines", "arrow"))

	testImplementation(pv("io.kotest:kotest-runner-junit5", "kotest"))
	testImplementation(pv("io.kotest:kotest-assertions-core", "kotest"))
}
```
