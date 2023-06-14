package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.AssetType;

public interface AssetTypeRepository extends CrudRepository<AssetType, Long> {

}
