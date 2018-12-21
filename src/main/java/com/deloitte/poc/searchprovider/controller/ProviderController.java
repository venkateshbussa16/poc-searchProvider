package com.deloitte.poc.searchprovider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.poc.searchprovider.bean.Provider;
import com.deloitte.poc.searchprovider.service.ProviderService;

@CrossOrigin
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
				return new ResponseEntity<Object>(providersList, HttpStatus.OK);
			}
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}

		else
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
	}

	@PostMapping(value = "/createProvider")
	public ResponseEntity<Provider> registerProvider(@RequestBody Provider provider) {
		Provider savedRecord = providerService.registerProvider(provider);
		if (savedRecord != null) {
			return new ResponseEntity<Provider>(savedRecord, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Provider>(HttpStatus.EXPECTATION_FAILED);
		}
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable String id) {
		if (id != null) {
			try {
				providerService.deleteProvider(Long.parseLong(id));
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
