package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigurationProperties(SampleProperties.class)
public class SpringEnvPlaygroundApplication implements CommandLineRunner {

    private final SampleProperties sampleProperties;

    private final Environment environment;

    public SpringEnvPlaygroundApplication(SampleProperties sampleProperties, Environment environment) {
        this.sampleProperties = sampleProperties;
        this.environment = environment;
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringEnvPlaygroundApplication.class);
        app.run();
    }

    public void run(String... args) throws Exception {
        System.out.println("hello");
        System.out.println("using environment: " + sampleProperties.getEnvironment());
        System.out.println("name: " + sampleProperties.getName());
        System.out.println("sftp-name: " + sampleProperties.getSftpName());
        System.out.println("enabled:" + sampleProperties.isEnabled());
        System.out.println("servers: " + sampleProperties.getServers());
        System.out.println("from Environment Variable: " + environment.getProperty("sample.username"));
    }
}
