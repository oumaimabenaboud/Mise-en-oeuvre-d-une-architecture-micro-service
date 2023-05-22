package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(null,"Oumaïma","benouma85@gmail.com"));
			customerRepository.save(new Customer(null,"Khalid","khalid@gmail.com"));
			customerRepository.save(new Customer(null,"Hassan","hassan@gmail.com"));
			customerRepository.findAll().forEach((c->{
				System.out.println((c.toString()));
			}));
		};
	}
}
