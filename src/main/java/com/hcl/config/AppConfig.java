package com.hcl.config;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration //replace your spring.xml file
@ComponentScan("com.hcl") //basePackage
public class AppConfig {

}
