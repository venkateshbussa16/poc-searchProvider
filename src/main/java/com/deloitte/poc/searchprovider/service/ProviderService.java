package com.deloitte.poc.searchprovider.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.poc.searchprovider.bean.Provider;
import com.deloitte.poc.searchprovider.repository.ProviderDao;

@Service
public class ProviderService {

	@Autowired
	private ProviderDao providerDao;

	public List<Provider> getProvidersSearch(String searchKey, String searchType) {

		String searchKeyValue = searchKey.trim().toUpperCase();
		if (searchKey.equalsIgnoreCase("") || searchType.equalsIgnoreCase("")) {
			return null;
		}
		if (searchType.equalsIgnoreCase("PI")) {
			return providerDao.getProvidersById(searchKeyValue);
		} else if (searchType.equalsIgnoreCase("PF")) {
			return providerDao.getProvidersByPfin(searchKeyValue);
		} else if (searchType.equalsIgnoreCase("LI")) {
			return providerDao.getProvidersByLicence(searchKeyValue);
		} else {
			return null;
		}
	}

	public Provider registerProvider(Provider provider) {

		if (provider != null) {
			if ((provider.getSsn().trim().length() > 5) && (provider.getLicense().trim().length() > 5)) {
				return null;
			}
			Provider createProvider = new Provider();
			BeanUtils.copyProperties(provider, createProvider);
			String suffixOfSSN = provider.getSsn().trim().substring(0, 3).toUpperCase();
			String suffixOfLicense = provider.getLicense().trim().substring(0, 3).toUpperCase();
			String providerId = suffixOfSSN + suffixOfLicense;
			createProvider.setProviderID(providerId);
			return providerDao.save(createProvider);
		}
		return null;
	}

}