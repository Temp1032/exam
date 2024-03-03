package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		int a;
		int b;
		int add;
		int multi;
		int div;

		a = 5;
		b = 10;
		add = a+b;
		multi = a*b;
		div = a/b;

		System.out.println(a + " plus " + b + " est egale a : " + add)
		System.out.println(a + " multiplier par " + b + " est egale a : " + multi)
		System.out.println(a + " diviser par " + b + " est egale a : " + div)

	}

}
