package com.fudamentos.springboot.fundamentos;

import com.fudamentos.springboot.fundamentos.controller.CommandDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private CommandDependency commandDependency;

	//Constructor
	// @Autowired no es obligatorio cuando hay un solo constructor.
	public FundamentosApplication(@Qualifier("ComandImplement") CommandDependency commandDependency){
		this.commandDependency = commandDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		commandDependency.saludar();
	}
}
