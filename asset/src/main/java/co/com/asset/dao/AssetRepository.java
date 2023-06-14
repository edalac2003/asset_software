package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.Asset;

public interface AssetRepository extends CrudRepository<Asset, Long> {

}
