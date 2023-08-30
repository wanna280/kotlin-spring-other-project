dependencies {
    implementation("com.wanna.spring:kotlin-spring-core:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-beans:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-context:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-aop:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-web:$kotlinSpringFrameworkVersion")

    compileOnly("com.wanna.spring:kotlin-spring-jcl:$kotlinSpringFrameworkVersion")

    implementation("com.wanna.spring:kotlin-spring-boot:$kotlinSpringBootVersion")
    implementation("com.wanna.spring:kotlin-spring-boot-autoconfigure:$kotlinSpringBootVersion")

    implementation("org.mybatis:mybatis:$mybatisVersion")
    implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonDatabindVersion")  // jackson

    testImplementation("com.alibaba:druid:1.2.10")
    testImplementation("mysql:mysql-connector-java:8.0.29")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}