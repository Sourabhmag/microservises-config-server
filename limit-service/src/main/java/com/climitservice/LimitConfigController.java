package com.climitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigController {
	@Autowired
	private Config config;
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitFromConfiguration() {
		return new LimitConfiguration(config.getMaximum(), config.getMinimum());
	}
}
