package com.deloitte.poc.searchprovider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.poc.searchprovider.bean.Provider;
import com.deloitte.poc.searchprovider.service.ProviderService;

@RestController
@RequestMapping("/provider")
public class ProviderController {

	@Autowired
	private ProviderService providerService;

	@GetMapping("/search/{searchKey}/{searchType}")
	public ResponseEntity<Object> searchProvider(@PathVariable String searchKey, @PathVariable String searchType) {

		if (searchKey != null || searchType != null) {
			List<Provider> providersList = providerService.getProvidersSearch(searchKey.trim().toUpperCase(),
					searchType.trim().toUpperCase());
			if (providersList != null) {
				return new ResponseEntity<Object>(providersList, HttpStatus.FOUND);
			}
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}

		else
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
	}

	@PostMapping(value = "/createProvider")
	public ResponseEntity<Object> createProvider(@RequestBody Provider provider) {
		Provider savedRecord = providerService.registerProvider(provider);
		if (savedRecord != null) {
			System.out.println("created");
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			System.out.println("failed");
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
