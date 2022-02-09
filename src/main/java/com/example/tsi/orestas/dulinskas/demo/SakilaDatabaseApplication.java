package com.example.tsi.orestas.dulinskas.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

//https://localhost:8080/HomePage/AllLanguages
@SpringBootApplication
@RestController
@RequestMapping("/HomePage")
public class SakilaDatabaseApplication {


	@Autowired
	private LanguageRepository languageRepository;
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private CustomerRepository customerRepository;

	public SakilaDatabaseApplication(LanguageRepository languageRepository,
									 FilmRepository filmRepository,
									 CustomerRepository customerRepository){
		this.languageRepository=languageRepository;
		this.filmRepository=filmRepository;
		this.customerRepository=customerRepository;
	}

	public static void main(String[] args) {SpringApplication.run(SakilaDatabaseApplication.class, args);}

	@GetMapping("/AllLanguages")
	public @ResponseBody
	Iterable<Language>getAllLanguages(){
		return languageRepository.findAll();
	}

	@GetMapping("/AllFilms")
	public @ResponseBody
	Iterable<Film>getAllFilms(){
		return filmRepository.findAll();
	}

	@GetMapping("/AllCustomers")
	public @ResponseBody
	Iterable<Customer>getAllCustomers(){
		return customerRepository.findAll();
	}

}
