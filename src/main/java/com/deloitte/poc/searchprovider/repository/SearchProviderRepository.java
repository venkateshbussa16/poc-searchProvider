package com.deloitte.poc.searchprovider.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.poc.searchprovider.bean.Provider;

@Repository
public interface SearchProviderRepository extends CrudRepository<Provider, Integer>{

	@Query("select p from Provider p where p.fName like %:searchKey%")
	public List<Provider> getProviderByName(String searchKey);
}
