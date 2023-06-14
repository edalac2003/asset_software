package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {

}
