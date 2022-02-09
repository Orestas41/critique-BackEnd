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

	public SakilaDatabaseApplication(LanguageRepository languageRepository, FilmRepository filmRepository){
		this.languageRepository=languageRepository;
		this.filmRepository=filmRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaDatabaseApplication.class, args);
	}

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


}
