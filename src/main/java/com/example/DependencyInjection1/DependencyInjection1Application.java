package com.example.DependencyInjection1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjection1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjection1Application.class, args);
		
		// Test Controller
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
		
		// Test Component
		VehicleComponent component = (VehicleComponent) ctx.getBean("vehicleComponent");
		component.service();
		
		
	}

}
