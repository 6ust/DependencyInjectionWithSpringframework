package com.example.DependencyInjection1;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("carBean")
public class Car implements Vehicle {
	@Override
	public void start() {
		System.out.println("Carro andando");
	}

	@Override
	public void stop() {
		System.out.println("Carro parado");
	}
}
