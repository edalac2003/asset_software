package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
