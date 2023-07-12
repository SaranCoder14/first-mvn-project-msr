package com.fssa.msr.myproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieDetailsTest {

	
	@Test
	public  void testValidName() {
//		Movie movie = getMovie();
		Assertions.assertTrue( MovieDetailsValidator.validateName("Peranmai"));
	}
	
	@Test
	public void testInvalidName() {
		try {
			MovieDetailsValidator.validateName(null);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Movie Name cannot be empty or null", ex.getMessage());
		}
	}
	
	@Test
	public  void testValidDirectorName() {
//		Movie movie = getMovie();
		Assertions.assertTrue( MovieDetailsValidator.validateDirector("Selvaragavan"));
	}
	
	@Test
	public void testInvalidDirectorName() {
		try {
			MovieDetailsValidator.validateDirector(null);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Director Name cannot be empty or null", ex.getMessage());
		}
	}
	@Test
	public  void testValidActorName() {
//		Movie movie = getMovie();
		Assertions.assertTrue( MovieDetailsValidator.validateActor("Dhanush"));
	}
	
	@Test
	public void testInvalidActorName() {
		try {
			MovieDetailsValidator.validateActor(null);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Actor Name cannot be empty or null", ex.getMessage());
		}
	}
	
	@Test
	public  void testValidLanguage() {
//		Movie movie = getMovie();
		Assertions.assertTrue( MovieDetailsValidator.validateLanguage("Dhanush"));
	}
	
	@Test
	public void testInvalidLanguage() {
		try {
			MovieDetailsValidator.validateLanguage(null);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Language cannot be empty or null", ex.getMessage());
		}
	}
//	
//	@Test
//	public  void testInvalidName() {
////		Movie movie = getMovie();
////		Assertions.assertTrue( MovieDetailsValidator.validateName("bjh"));
//
//	}
//	@Test
//	public void testInvalidNam() {
//		Movie movie= getMovie();
//		try {
//			movie.title = "CaptainMiller";
//			MovieDetailsValidator.validate(movie);
//			
//			movie.director = "Arun";
//			MovieDetailsValidator.validate(movie);
//			
//			movie.actor = "Dhanush";
//			MovieDetailsValidator.validate(movie);
//			
//			movie.language = "Tamil";
//			MovieDetailsValidator.validate(movie);
//			
//			movie.director = "2D";
//			MovieDetailsValidator.validate(movie);
//
//			movie.director = "This flim is a historical content during 1940s in brithish war.";
//			MovieDetailsValidator.validate(movie);
//			
//
//		} catch (IllegalArgumentException ex) {
//			Assertions.assertEquals("Name cannot be empty or null",ex.getMessage());
//			
//		}
//	}
//
//	public Movie getMovie() {
//		Movie movie = new Movie();
//		movie.title = "CaptainMiller";
//		movie.director = "Arun";
//		movie.actor= "Dhanush";
//		movie.language= "Tamil";
//		movie.frame = "2D";
//		movie.description= "This flim is a historical content during 1940s in brithish war.";
//		return movie;
//	}
}
