package com.config;

import com.config.annotation.EnableOracleConfigServer;
import com.config.data.entities.ApplicationEntity;
import com.config.data.entities.PropertyEntity;
import com.config.data.repository.ApplicationRepository;
import com.config.data.repository.PropertyRepository;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@EnableOracleConfigServer
@EnableAutoConfiguration
public class ConfigServer{

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }

}
