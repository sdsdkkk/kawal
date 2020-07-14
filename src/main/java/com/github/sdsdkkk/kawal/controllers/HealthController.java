package com.github.sdsdkkk.kawal.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.sdsdkkk.kawal.responses.StatusResponse;

@RestController
public class HealthController {

	@GetMapping("/health")
	public StatusResponse index() {
		return new StatusResponse("OK", null);
	}

}