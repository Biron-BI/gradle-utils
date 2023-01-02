package com.biron.gradleUtils

import org.gradle.api.Plugin
import org.gradle.api.Project

class BironUtilsPlugin : Plugin<Project> {
	override fun apply(target: Project) {

	}
}

/**
 * append version number to dependencyNotation from a gradle property of form "version.$versionKey"
 */
fun Project.pv(dependencyNotation: String, versionKey: String): Any =
	"$dependencyNotation:${properties["version.$versionKey"]}"
