

dependencies {
    implementation("com.wanna.spring:kotlin-spring-core:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-beans:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-context:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-aop:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-web:$kotlinSpringFrameworkVersion")

    compileOnly("com.wanna.spring:kotlin-spring-jcl:$kotlinSpringFrameworkVersion")

    implementation("com.wanna.spring:kotlin-spring-boot:$kotlinSpringBootVersion")
    implementation("com.wanna.spring:kotlin-spring-boot-autoconfigure:$kotlinSpringBootVersion")

    implementation(project(":kotlin-nacos:kotlin-nacos-api"))

    implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonDatabindVersion")  // jackson
    implementation("org.slf4j:slf4j-api:$slf4jApiVersion")
    implementation("io.netty:netty-codec-http:$nettyVersion")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")


    // for test
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}