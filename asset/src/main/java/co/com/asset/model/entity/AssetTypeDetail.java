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
@Table(name = "asset_type_detail")
public class AssetTypeDetail {

	@Id
	private Long id;
	
	@Column(name = "asset_type_id")
	private Long assetTypeId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private AssetType assetType;
	
	@Column(name = "property_id")
	private Long propertyId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Property property;
}
