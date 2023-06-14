package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.City;

public interface CityRepository extends CrudRepository<City, Integer> {

}
