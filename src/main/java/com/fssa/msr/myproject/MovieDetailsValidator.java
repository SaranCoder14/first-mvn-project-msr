package com.fssa.msr.myproject;

public class MovieDetailsValidator {

	public static boolean validate(Movie  movie)throws IllegalArgumentException {

		// check for nullity of the parameter
		if (movie == null) {
			throw new IllegalArgumentException("Argument is " + "NULL");
		}
		
		// Check for name, name should only have alphabets
		// For Simplicity, Check if name has length of 2.
		validateName(movie.title);
//        validateDuration(movie.duration);
		validateDirector(movie.director);
		validateActor(movie.actor);
//		validateReleaseDate(movie.releaseDate);
		validateLanguage(movie.language);
		validateFrame(movie.frame);
		validateDescription(movie.description);
//		validateMainImage(movie.mainImage);
		return true;
		
	}


	
	
 
    public static boolean validateName(String title)
		throws IllegalArgumentException {
	if (title == null || "".equals(title.trim()) || title.length() < 3) {
		throw new IllegalArgumentException(
				"Movie Name cannot be empty or null");
	}
	return true;
}
    
    
    public static boolean validateDirector(String director)
    		throws IllegalArgumentException {
    	if (director == null || "".equals(director.trim()) || director.length() < 3) {
    		throw new IllegalArgumentException(
    				"Director Name cannot be empty or null");
    	}
    	return true;
    }

    public static boolean validateActor(String actor)
    		throws IllegalArgumentException {
    	if (actor == null || "".equals(actor.trim()) || actor.length() < 3) {
    		throw new IllegalArgumentException("Actor Name cannot be empty or null");

    	    }
    	return true;
    }
    
    public static boolean validateLanguage(String language)
    		throws IllegalArgumentException {
    	if ( language == null || "".equals( language.trim()) ||  language.length() < 4) {
    		throw new IllegalArgumentException("Language cannot be empty or null");
    	    }
    	return true;
    }
    
    public static boolean validateFrame(String frame)
    		throws IllegalArgumentException {
    	if ( frame == null || "".equals( frame.trim()) ||  frame.length() <= 2) {
    		throw new IllegalArgumentException(" Description cannot" + "be empty or null");
    	    }
    	return true;
    }
    
    public static boolean validateDescription(String description)
    		throws IllegalArgumentException {
    	if ( description == null || "".equals( description.trim()) ||  description.length() < 20) {
    		throw new IllegalArgumentException(" Description cannot" + "be empty or null");
    	    }
    	return true;
    }
    
}

//public static boolean validateMainImage(String mainimage)
//		throws IllegalArgumentException {
//	if ( mainimage == null || "".equals( mainimage.trim()) ||  mainimage.length() < 20) {
//		throw new IllegalArgumentException(" Description cannot" + "be empty or null");
//	    }
//	return true;
//}
//}

//  public static boolean validateDuration(String duration)throws IllegalArgumentException {
//  	if (duration== null || "".equals(duration.trim()) || duration.length() < 3) {
//  		throw new IllegalArgumentException(
//  				"Movie Name cannot " + "be empty or null");
//  	}
//  	return true;
//  }
  
//  public static boolean validateReleaseDate(String releasedate)
//  		throws IllegalArgumentException {
//  	if ( releasedate == null || "".equals( releasedate.trim()) ||  releasedate.length() < 20) {
//  		throw new IllegalArgumentException(" Description cannot" + "be empty or null");
//  	    }
//  	return true;
//  }


    


    

