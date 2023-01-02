plugins {
	`kotlin-dsl`
	id("com.gradle.plugin-publish") version "1.1.0"
}

group = "com.biron"
version = "1.0.1"


repositories {
	mavenCentral()
}

pluginBundle {
	website = "https://github.com/Biron-BI/gradle-utils"
	vcsUrl = website
	tags = listOf("dependencies", "dependency", "version")
}

gradlePlugin {
	plugins {
		create("gradle-utils") {
			id = "com.biron.gradle-utils"
			displayName = "Biron gradle utils"
			description = "Provide a small utility function to extract dependency version from gradle properties based on an extra key"
			implementationClass = "com.biron.gradleUtils.BironUtilsPlugin"
		}
	}
}
