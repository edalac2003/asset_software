package co.com.asset.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "work_order")
public class WorkOrder {

	@Id
	private Long id;
	
	@Column(name = "status_type_id")
	private int StatusTypeId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private StatusType statusType;
	
	private LocalDate assigmentDateTime;
	
	@Column(name = "maintenance_request_id")
	private Long maintenanceRequestId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private MaintenanceRequest maintenanceRequest;
	
	private String technicianAssigned;

}
