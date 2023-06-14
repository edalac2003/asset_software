package co.com.asset.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "category")
public class Category {

	@Id
	private int id;
	private String name;
	private String description;
}
