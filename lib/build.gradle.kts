plugins {
  `java-library`
  `maven-publish`
}

group = "com.github.fish895623"
version = "1.0.3-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")

  // Must include
  api("org.apache.commons:commons-math3:3.6.1")

  implementation("com.google.guava:guava:30.1.1-jre")
}

publishing {
  repositories {
    maven {
      name = "Github"
      url = uri("https://maven.pkg.github.com/fish895623/java-utils/")
      credentials {
        username = project.findProperty("gpr.user") as String?
          ?: System.getenv("GITHUB_ACTOR")
        password = project.findProperty("gpr.key") as String?
          ?: System.getenv("GITHUB_TOKEN")
      }
    }
  }
  publications {
    register<MavenPublication>("gpr") {
      artifactId = "utils"
      from(components["java"])
    }
  }
}

tasks.named<Test>("test") {
  // Use JUnit Platform for unit tests.
  useJUnitPlatform()
}
