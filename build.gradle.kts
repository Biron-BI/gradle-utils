plugins {
	`kotlin-dsl`
	id("com.gradle.plugin-publish") version "1.1.0"
}

group = "com.biron-analytics"
version = "1.0.0"


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
			id = "com.biron-analytics"
			displayName = "Biron gradle utils"
			description = "Provide a small utility function to extract dependency version from gradle properties"
			implementationClass = "com.biron.gradleUtils.BironUtilsPlugin"
		}
	}
}

publishing {
	repositories {
		mavenLocal()
	}
}

