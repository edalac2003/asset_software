package co.com.asset.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "asset_type")
public class AssetType {

	@Id
	private Long id;
	private String name;
}
