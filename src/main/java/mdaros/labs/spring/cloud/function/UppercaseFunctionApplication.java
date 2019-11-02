package mdaros.labs.spring.cloud.function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class UppercaseFunctionApplication {

	@Bean
	public Function<String, String> uppercase () {

		return value -> value.toUpperCase ();
	}

	public static void main ( String [] args ) {

		SpringApplication.run ( UppercaseFunctionApplication.class, args );
	}
}