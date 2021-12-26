package com.alexbt.mongodb;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class Launcher {

	public static void main(String[] args) {
	    //System.setProperty("os.arch", "x86_64");
		SpringApplication.run(Launcher.class, args);
	}
}