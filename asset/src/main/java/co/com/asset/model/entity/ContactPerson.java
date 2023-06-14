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
@Table(name = "contact_person")
public class ContactPerson {

	@Id
	private Long id;
	
	@Column(name = "contact_type_id")
	private int contactTypeId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private ContactType contactType;
	
	@Column(name = "person_id")
	private Long personId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Person person;
	
	private String value;
	private Boolean active;
	
}
