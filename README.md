# java-utils

To call from artifactory use code bellow

code are same on `groovy` and `kotlin-dsl`

```groovy
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/fish895623/java-utils/")
        credentials {
            username = "fish895623"
            password = "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"
        }
    }
    mavenCentral()
}
```
