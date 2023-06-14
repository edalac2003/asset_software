package co.com.asset.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "contact_type")
public class ContactType {

	@Id
	private Integer id;
	private String name;
	
}
