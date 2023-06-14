package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
