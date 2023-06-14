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
@Table(name = "asset_detail")
public class AssetDetail {

	@Id
	private Long id;
	
	@Column(name = "asset_id")
	private Long assetId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Asset asset;
	
	@Column(name = "property_id")
	private int propertyId;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Property property;
	
	private String value;
	
}
