package co.com.asset.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "identification_type")
public class IdentificationType {

	@Id
	private Integer id;
	private String name;
	private String abbreviation;
	
}
