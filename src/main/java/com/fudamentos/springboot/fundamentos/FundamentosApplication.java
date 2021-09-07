package com.fudamentos.springboot.fundamentos;

import com.fudamentos.springboot.fundamentos.controller.CommandDependency;
import com.fudamentos.springboot.fundamentos.controller.ComponentImplement;
import com.fudamentos.springboot.fundamentos.controller.ComponentTwoImplement;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FundamentosApplication  {

	private CommandDependency commandDependency;
	//private ComponentTwoImplement componentTwoImplement;
	//private ComponentImplement componentImplement;

	//Constructor
	// @Autowired no es obligatorio cuando hay un solo constructor.
	/*public FundamentosApplication( @Qualifier("componentImplement") CommandDependency commandDependency){
		this.commandDependency = commandDependency;
	}*/
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	/*
	@Override
	public void run(String... args)  {
		commandDependency.saludar();
	}*/

}
