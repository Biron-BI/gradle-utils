val biron_foo = "ok"



allprojects {
	tasks.register("showRepos") {
		doLast {
			println("All repos:")
			println(repositories.map { it.name })
			println(biron_foo)
		}
	}
}

