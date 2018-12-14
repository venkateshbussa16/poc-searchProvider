package com.deloitte.poc.searchprovider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.poc.searchprovider.bean.Provider;
import com.deloitte.poc.searchprovider.service.SearchProviderService;

@RestController
@RequestMapping("/provider")
public class SearchProviderController {

	@Autowired
	private SearchProviderService searchProviderService;

	@GetMapping("/search/{searchKey}/{searchType}")
	public ResponseEntity<Object> searchProvider(@PathVariable String searchKey, @PathVariable String searchType) {

		List<Provider> providersList = searchProviderService.getProvidersSearch(searchKey, searchType);
		if (providersList != null)

			return new ResponseEntity<Object>(providersList, HttpStatus.FOUND);
		else
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
	}

}
