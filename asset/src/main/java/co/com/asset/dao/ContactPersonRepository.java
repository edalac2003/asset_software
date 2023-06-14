package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.ContactPerson;

public interface ContactPersonRepository extends CrudRepository<ContactPerson, Long> {

}
