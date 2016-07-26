package sample.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication //spring boot, auto config, and external variables (use @Value)
@EnableConfigServer
@EnableAutoConfiguration
public class ConfigurationServer {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigurationServer.class, args);
	}

}
