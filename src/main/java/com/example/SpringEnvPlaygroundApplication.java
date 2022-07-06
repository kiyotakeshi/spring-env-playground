package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SampleProperties.class)
public class SpringEnvPlaygroundApplication implements CommandLineRunner {

    private final SampleProperties sampleProperties;

    public SpringEnvPlaygroundApplication(SampleProperties sampleProperties) {
        this.sampleProperties = sampleProperties;
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
    }
}
