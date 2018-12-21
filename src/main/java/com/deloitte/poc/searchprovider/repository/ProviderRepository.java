package com.deloitte.poc.searchprovider.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.poc.searchprovider.bean.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {

	@Query("select p from Provider p where p.providerID = :providerId")
	public List<Provider> findByProviderId(String providerId);

	@Query("select p from Provider p where p.pfin =:pfin")
	public List<Provider> findByPfin(String pfin);

	@Query("select p from Provider p where p.license=:license")
	public List<Provider> findByLicense(String license);
}
