package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.Property;

public interface PropertyRepository extends CrudRepository<Property, Long> {

}
