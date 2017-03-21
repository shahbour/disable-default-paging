package com.shahbour;

import com.shahbour.domain.Customer;
import com.shahbour.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DisableDefaultPagingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DisableDefaultPagingApplication.class, args);
	}


	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void run(String... strings) throws Exception {
		customerRepository.save(new Customer(1,"Ali","Male"));
		customerRepository.save(new Customer(2,"Movses","Male"));
		customerRepository.save(new Customer(3,"Chadi","Male"));
	}
}
