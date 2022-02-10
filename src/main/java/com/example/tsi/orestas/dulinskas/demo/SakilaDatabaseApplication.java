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
	private FilmRepository filmRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ReviewRepository reviewRepository;

	private String save="save";

	public SakilaDatabaseApplication(FilmRepository filmRepository,
									 CustomerRepository customerRepository,
									 ReviewRepository reviewRepository){
		this.filmRepository=filmRepository;
		this.customerRepository=customerRepository;
		this.reviewRepository=reviewRepository;
	}

	public static void main(String[] args) {SpringApplication.run(SakilaDatabaseApplication.class, args);}

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
	String addReviews(@RequestParam int film_film_id, int customer_customer_id, String review){
		Review addReviews=new Review(review, film_film_id, customer_customer_id);
		reviewRepository.save(addReviews);
		return save;
	}

}
