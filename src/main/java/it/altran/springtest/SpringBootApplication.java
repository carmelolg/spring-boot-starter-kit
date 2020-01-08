package it.altran.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import it.altran.springtest.config.ApplicationProperties;

@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableConfigurationProperties
public class SpringBootApplication implements CommandLineRunner {

	@Autowired
	private ApplicationProperties config;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(" ---------------------------------------------------- ");
		System.out.println(" -- ");
		System.out.println(" --   Environment: " + config.getEnvironment());
		System.out.println(" --   App name: " + config.getName());
		System.out.println(" --   Rest API available at: " + config.getUrl() + ":" + String.valueOf(config.getPort()));
		System.out.println(" -- ");
		System.out.println(" ---------------------------------------------------- ");
	}
}
