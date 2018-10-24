package com.config.data.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.config.data.repository")
@ComponentScan("com.config.data")
@EntityScan("com.config.data.entities")
public class PropertyConfigurtion {
}
