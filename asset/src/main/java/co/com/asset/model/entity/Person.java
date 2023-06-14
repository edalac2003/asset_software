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
@Table(name = "person")
public class Person {

	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private String genre;
	
	@Column(name = "identification_type")
	private int identificationTypeId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private IdentificationType identificationType;
	
	private String identificationNumber;
	
	@Column(name = "city_id")
	private int cityId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private City city;
	
	private Boolean active;
	
}
