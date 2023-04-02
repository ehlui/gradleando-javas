
## Solving errors from Gradle

### Deamon errors
````sh
gradleando-01 (main) $ ./gradlew build

FAILURE: Build failed with an exception.

* What went wrong:
Gradle could not start your build.
> Could not create service of type FileHasher using BuildSessionServices.createFileHasher().
   > Cannot lock file hash cache (.../gradle-learning-dir/gradleando-01/.gradle/8.0.2/fileHashes) as it has already been locked by this process.

````

Solutions 

a. Stopping gradle
``gradle --stop``

b. Killing gradle deamon
1. `ps aux | grep gradle`
2. `kill -9 <PID>`


