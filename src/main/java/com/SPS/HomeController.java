package com.SPS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	   // private SpyGirl spyGirl = new SpyGirl(); // TIGHTLY COUPLED! igy nem mukodik a dependency injection!
	   @Autowired
	 private SpyGirl spyGirl;
	   // loosely coupled -> ha szukseg van az objektumra a spring keszit belole egyet a SpyGirl class SCOPE janak megfeleloen

	    @RequestMapping("/")
	    public String index(){
	        return spyGirl.sayIt();
	    }
}
