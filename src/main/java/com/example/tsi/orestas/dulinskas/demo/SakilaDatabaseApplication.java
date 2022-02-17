package com.example.tsi.orestas.dulinskas.demo;

import com.amazonaws.services.secretsmanager.model.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
	@Autowired
	private ActorRepository actorRepository;

	private String save="save";

	public SakilaDatabaseApplication(FilmRepository filmRepository,
									 CustomerRepository customerRepository,
									 ReviewRepository reviewRepository,
									 ActorRepository actorRepository){
		this.filmRepository=filmRepository;
		this.customerRepository=customerRepository;
		this.reviewRepository=reviewRepository;
		this.actorRepository=actorRepository;
	}
	//TEST--
	public static void main(String[] args) {SpringApplication.run(SakilaDatabaseApplication.class, args);}

	@GetMapping("/AllFilms")
	public @ResponseBody
	Iterable<Film>getAllFilms(){
		return filmRepository.findAll();
	}
	//TEST--
	@GetMapping("/Film/{film_id}")
	public @ResponseBody
	Optional<Film> getFilmById(@PathVariable int film_id){
		return filmRepository.findById(film_id);
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

	@GetMapping("/AllActors")
	public @ResponseBody
	Iterable<Actor>getAllActor(){
		return actorRepository.findAll();
	}

	@PostMapping("/AddReviews")
	public @ResponseBody
	String addReviews(@RequestParam int film_film_id, int customer_customer_id, String customer_review){
		Review addReviews=new Review(customer_review, film_film_id, customer_customer_id);
		reviewRepository.save(addReviews);
		return save;
	}

	@DeleteMapping("/RemoveReviews/{review_id}")
	public @ResponseBody String removeReviewByID(@PathVariable int review_id){
		reviewRepository.deleteById(review_id);
		return "The review has been deleted";
	}
	//TEST--
	@PutMapping("/UpdateReviews/{review_id}")
	public @ResponseBody
	String updateReview(@PathVariable int review_id, @RequestParam String customer_review){
		Review updateReview = reviewRepository.findById(review_id).orElseThrow(() ->new ResourceNotFoundException("Review id not found"));
		updateReview.setCustomer_review(customer_review);
//		final Review updatedReview = reviewRepository.save(updateReview);
		return save;
	}
}
