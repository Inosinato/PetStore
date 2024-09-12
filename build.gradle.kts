plugins {
    id("java")
    id("idea")
    id("net.serenity-bdd.serenity-gradle-plugin") version "4.1.14"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // Serenity BDD
    implementation("net.serenity-bdd:serenity-core:4.2.0")
    implementation("net.serenity-bdd:serenity-junit:4.2.0")
    implementation("net.serenity-bdd:serenity-screenplay:4.2.0")
    implementation("net.serenity-bdd:serenity-rest-assured:4.2.0")

    //Cucumber
//    implementation("net.serenity-bdd:serenity-cucumber:4.1.10")
    implementation ("net.serenity-bdd:serenity-cucumber6:2.4.34")

    //Selenium Java
    implementation ("org.seleniumhq.selenium:selenium-java:4.9.1")

    //Rest Assured
    implementation ("io.rest-assured:rest-assured:5.3.0")

    //TestNG
    testImplementation ("org.testng:testng:7.10.0")
    testImplementation("io.cucumber:cucumber-testng:7.15.0")
    testImplementation ("io.cucumber:cucumber-java:6.10.4")

    compileOnly ("org.projectlombok:lombok:1.18.30")
    annotationProcessor ("org.projectlombok:lombok:1.18.30")

    implementation ("com.fasterxml.jackson.core:jackson-core:2.17.1")
    implementation ("com.fasterxml.jackson.core:jackson-databind:2.17.1")

}

tasks.test {
    useTestNG()
    testLogging {
        events ("passed", "skipped", "failed")
    }
}