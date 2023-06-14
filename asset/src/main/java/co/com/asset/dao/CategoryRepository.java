package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
