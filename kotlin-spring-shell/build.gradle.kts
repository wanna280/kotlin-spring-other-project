dependencies {
    implementation("com.wanna.spring:kotlin-spring-core:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-beans:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-context:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-aop:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-web:$kotlinSpringFrameworkVersion")

    compileOnly("com.wanna.spring:kotlin-spring-jcl:$kotlinSpringFrameworkVersion")

    implementation("com.wanna.spring:kotlin-spring-boot:$kotlinSpringBootVersion")
    implementation("com.wanna.spring:kotlin-spring-boot-autoconfigure:$kotlinSpringBootVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}