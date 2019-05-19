package org.axela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class DubboProviderBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderBootstrap.class, args);
    }
}
