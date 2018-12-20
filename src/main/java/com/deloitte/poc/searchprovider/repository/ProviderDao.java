package com.deloitte.poc.searchprovider.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deloitte.poc.searchprovider.bean.Provider;

@Component
public class ProviderDao {

	@Autowired
	private ProviderRepository providerRepository;

	public List<Provider> getProvidersById(String providerId){
		return providerRepository.findByProviderId(providerId);
	}
	
	public List<Provider> getProvidersByPfin(String pfin){
		return providerRepository.findByPfin(pfin);
	}
	
	public List<Provider> getProvidersByLicence(String licence){
		return providerRepository.findByLicense(licence);
	}

	public Provider save(Provider provider) {
		return providerRepository.save(provider);
	}

}
