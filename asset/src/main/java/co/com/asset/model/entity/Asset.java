package co.com.asset.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "asset")
public class Asset {

	@Id
	private Long id;
	private String code;
	private Double purchaseValue;
	private Boolean status;
	
	@Column(name = "category_id")
	private int categoryId;
	
	@ManyToOne()
	@JoinColumn(insertable = false, updatable = false)
	private Category category;
	
	private LocalDate purchaseDate;
	private String usefullLifetime;
	private String responsible;
	private String location;
	
	@Column(name = "asset_type_id")
	private Long assetTypeId;
	
	@ManyToOne()
	@JoinColumn(insertable = false, updatable = false)
	private AssetType assetType;
	
}
