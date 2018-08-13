plugins {
    java
}

group = "com.chomnoue"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile("org.neo4j:neo4j-ogm-core:3.1.0")
    runtime ("org.neo4j:neo4j-ogm-embedded-driver:3.1.0")
    runtime("org.neo4j:neo4j:3.4.4")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
