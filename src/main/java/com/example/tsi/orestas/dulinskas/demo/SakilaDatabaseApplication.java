package com.example.tsi.orestas.dulinskas.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

//https://localhost:8080/HomePage/All..
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
	@Autowired
	private ReviewRepository reviewRepository;

	private String save="save";
	private int film_id;

	public SakilaDatabaseApplication(LanguageRepository languageRepository,
									 FilmRepository filmRepository,
									 CustomerRepository customerRepository,
									 ReviewRepository reviewRepository){
		this.languageRepository=languageRepository;
		this.filmRepository=filmRepository;
		this.customerRepository=customerRepository;
		this.reviewRepository=reviewRepository;
	}

	public static void main(String[] args) {SpringApplication.run(SakilaDatabaseApplication.class, args);}

	@GetMapping("/AllLanguages")
	public @ResponseBody
	Iterable<Language>getAllLanguages(){
		return languageRepository.findAll();
	}

	@PostMapping("/AddLanguages")
	public @ResponseBody
	String addLanguage(@RequestParam String name){
		Language addLanguage=new Language(name);
		languageRepository.save(addLanguage);
		return save;
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

	@GetMapping("/AllReviews")
	public @ResponseBody
	Iterable<Review>getAllReview(){
		return reviewRepository.findAll();
	}

	@PostMapping("/AddReviews")
	public @ResponseBody
	String addReviews(@RequestParam int film_id, String review){
		Review addReviews=new Review(review, film_id);
		reviewRepository.save(addReviews);
		return save;
	}

//	@PostMapping("/AddReviews")
//	public @ResponseBody
//	String addReview(@RequestParam int film_id, String review, int customer_id){
//		Review addReview=new Review();
//		reviewRepository.save(addReview);
//		return save;
//	}
//	Review addReview(@Validated @RequestBody Review newReview) {
//		return reviewRepository.save(newReview);
//	}

}
