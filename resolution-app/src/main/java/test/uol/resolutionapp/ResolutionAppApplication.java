package test.uol.resolutionapp;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import test.uol.resolutionapp.persistence.repository.ResolutionRepository;

@SpringBootApplication
public class ResolutionAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResolutionAppApplication.class, args);
	}

	/*
		João
		Maria
		Zeca
		Mario
		Gustavo
		Camila
		Pedro
		Juliana
		Gisele
	*/
}
