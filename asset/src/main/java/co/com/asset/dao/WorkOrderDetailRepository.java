package co.com.asset.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.WorkOrderDetail;

public interface WorkOrderDetailRepository extends CrudRepository<WorkOrderDetail, Long> {

}
