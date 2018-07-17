# Learn Gradle

| Command                       | Meaning                                                                           |
| ----------------------------- | --------------------------------------------------------------------------------- |
| GRADLE_OPTS                   | Gradle builds use the value of this environment variable (and also use JAVA_OPTS) |
| gradle -q \<command>          | -q switch disable the JVM info                                                    |
| gradle -q tasks --all         | List all available tasks for the project                                          |
| gradle init                   | Initialize a Gradle project (simply create the build.gradle file)                 |
| gradle wrapper                | Download the wrapper and create the necessary folders for it                      |
| gradle properties             | Print the project properties (for example root, build folder)                     |
| gradle dependencies           | Print the project dependencies                                                    |
| gradle projects               | Print sub-projects                                                                |
| gradle --status               | Status of Gradle daemon                                                           |
| gradle --stop                 | Stop all Gradle daemon                                                            |
| gradle -x test                | Skip tests                                                                        |
| gradle -m or gradle --dry-run | Print which task will be running but not executing them                           |
| gradle --profile              | Prints the execution time to an HTML table                                        |

```gradle
task helloWorld{
    println 'Hello World!'
}

task greet(group : "Dummies", description : "Greet the user.", dependsOn: helloWorld){
	println "Hi again!"
}
```

It can run by gradle helloWorld or simply gradle hello or gradle hW (if the task can be uniquely identified by name )
jar tvf /build/libs/app.jar

~/.gradle/wrapper/dists
