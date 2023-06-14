package co.com.asset.model.entity;

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
@Table(name = "city")
public class City {

	@Id
	private Integer id;
	private String name;
	
	@Column(name = "state_id")
	private int stateId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private State state;
}
