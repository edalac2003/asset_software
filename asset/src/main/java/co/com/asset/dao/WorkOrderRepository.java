package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.WorkOrder;

public interface WorkOrderRepository extends CrudRepository<WorkOrder, Long> {

}
