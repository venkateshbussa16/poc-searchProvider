package com.deloitte.poc.searchprovider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.poc.searchprovider.bean.Provider;
import com.deloitte.poc.searchprovider.repository.SearchProviderDao;

@Service
public class SearchProviderService {
	
	@Autowired
	private SearchProviderDao searchProviderDao;
	
	public List<Provider> getProvidersSearch(String searchKey,String searchType){
		if(searchType.equals("P")) {
			return searchProviderDao.getProvidersById(searchKey);
		}else if(searchType.equals("N")) {
			return searchProviderDao.getProvidersByName(searchKey);
		}else if(searchType.equals("S")) {
			return searchProviderDao.getProvidersBySsn(searchKey);
		}else {
			return null;
		}
	}
	
}