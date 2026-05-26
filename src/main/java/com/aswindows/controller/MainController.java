package com.aswindows.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
		
	@GetMapping("about")
	public String getAboutUs() {
		return "about";
	}

	
	@GetMapping("bay-window")
	public String getbayWindow() {
		return "bay-window";
	}
	@GetMapping("casement-door")
	public String getcasementDoor() {
		return "casement-door";
	}
	@GetMapping("casement-window")
	public String getcasementWindow() {
		return "casement-window";
	}
	@GetMapping("gallery")
	public String getGallery() {	
		return "gallery";
	}
	@GetMapping("home")
	public String getHome() {
		return "home";
	}
	@GetMapping("lift-and-slide-door")
	public String getLiftAndSlideDoor() {
		return "lift-and-slide-door";
	}
	@GetMapping("slide-and-fold-door")
	public String getSlideAndFoldDoor() {
		return "slide-and-fold-door";
	}
	@GetMapping("sliding-door")
	public String getslidingDoor() {
		return "sliding-door";
	}
	@GetMapping("sliding-window")
	public String getslidingWindow() {
		return "sliding-window";
	}
	@GetMapping("contact")
	public String getContactUs() {
		return "contact";
	}
	@GetMapping("tilt-and-turn-window")
	public String getTiltAndTurn() {
		return "tilt-and-turn-window";
	}
	@GetMapping("privacy")
	public String getPrivacy() {
		return "privacy-policy";
	}
	@GetMapping("terms")
	public String getTerms() {
		return "term-conditions";
	}
}

