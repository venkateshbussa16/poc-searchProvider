package com.deloitte.poc.searchprovider.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.deloitte.poc.searchprovider.bean.Provider;

@Component
public class SearchProviderDao {
	
	@Autowired
	private SearchProviderRepository repository;

	public List<Provider> getProvidersById(String searchKey){
		
		return null;
	}
	
	public List<Provider> getProvidersByName(String searchKey){
		
		return repository.getProviderByName(searchKey);
	}
	
	public List<Provider> getProvidersBySsn(String searchKey){
		
		return null;
	}
	
	
}
