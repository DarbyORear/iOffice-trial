package com.iOfficeProject.trialproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.iOfficeProject.trialproject.APIclasses.WorkPlace;

@Controller
public class TrialProjectController {
	
@Value("${authToken}")
String CoWorkrAuthToken;

@Value("${userId}")
String CoWorkrUserId;

//NOTE: To start, I'm just going to try to access CoWorkr's WorkPlaces data.
@RequestMapping("/")
private ModelAndView showInfo() {
	ModelAndView mav = new ModelAndView("coworkr-data");
	
	// Create a rest template - This is for the UserFear - API
	RestTemplate restTemplate = new RestTemplate();


	// Set up headers.
	HttpHeaders headers = new HttpHeaders();
	headers.add("Accept", "application/json");
	headers.add("authToken", "authToken");
	headers.add("userId", "userId");
	//NOTE: Added the two headers above, not sure if that will work. The actual credentials are in 
		//config/application.properties file.
	
	//DO I NEED TO START A SESSION?
	
	// Set url - set more than one?? one url to login and one to retrieve info???
	//NOTE: This may just be the base url, may not be enough information
	String url = "https://internal-us.coworkr.co/api";

			
	// Make the Request.
			ResponseEntity<WorkPlace> response = restTemplate.exchange(url,
			HttpMethod.GET, new HttpEntity<>(headers),
			WorkPlace.class);
	
	// Extract body from response.
			WorkPlace result = response.getBody();
	
	//add the info to jsp
			mav.addObject("workPlace", result.getWorkPlace_Name());
	
	return mav;
}

}
