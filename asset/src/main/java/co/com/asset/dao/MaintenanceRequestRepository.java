package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.MaintenanceRequest;

public interface MaintenanceRequestRepository extends CrudRepository<MaintenanceRequest, Long> {

}
