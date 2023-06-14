package co.com.asset.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "property")
public class Property {

	@Id
	private Long id;
	private String name;
	private String description;
}
