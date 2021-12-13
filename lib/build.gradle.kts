plugins {
  `java-library`
  `maven-publish`
}

group = "com.github.fish895623"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")

  // Must include
  api("org.apache.commons:commons-math3:3.6.1")

  implementation("com.google.guava:guava:30.1.1-jre")
}

publishing {
  repositories {
    maven {
      name = "Github"
      url = uri("https://maven.pkg.github.com/fish895623/java-utils")
      credentials {
        username = System.getenv("GITHUB_ACTOR")
        password = System.getenv("GITHUB_TOKEN")
      }
    }
  }
  publications {
    create<MavenPublication>("main") {
      from(components["java"])
    }
  }
}
