package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * The golden boy
 */
@ComponentScan("org.example")
@Configuration
@PropertySource("classpath:application.properties")
public class Config {

}
