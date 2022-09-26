package org.training.etiya.microservice.nodeconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableConfigServer
//@EnableScheduling
public class NodeConfigurationApplication {

    @Scheduled(fixedDelay = 10_000, initialDelay = 10_000)
    public void method1(){
        System.out.println("schedule run");
    }

    public static void main(String[] args) {
        SpringApplication.run(NodeConfigurationApplication.class, args);
    }

}
