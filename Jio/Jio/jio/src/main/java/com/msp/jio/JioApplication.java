/**
 * <h1>SpringBootApplication Class</h1>
 * This class is used to bootstrap and launch a Spring application from a 
 * Java main method. The application creates an appropriate ApplicationContext
 * instance and registers a CommandLinePropertySource that exposes cmd line 
 * arguments as Spring properties and loads all the singleton beans and triggers
 * cmd line beans.
 */
package com.msp.jio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.msp.jio.entity")
@ComponentScan(basePackageClasses = com.msp.jio.controller.JioController.class)
@ComponentScan(basePackageClasses = com.msp.jio.modelassembler.JioModelAssembler.class)
@EnableJpaRepositories("com.msp.jio.repository")
public class JioApplication {
	/**
	 * The main method for the msp.jio program
	 * @param args Not used
	 */
	public static void main(String[] args) {
		SpringApplication.run(JioApplication.class, args);
	}

}
