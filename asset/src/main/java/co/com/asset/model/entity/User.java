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
@Table(name = "user")
public class User {

	@Id
	private Long id;
	private String userName;
	private String password;
	private LocalDate insertionDateTime;
	private LocalDate updateDateTime;
	
	@Column(name = "status_id")
	private int statusId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private StatusType statusType;
	
	@Column(name = "person_id")
	private Long personId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Person person;
}
