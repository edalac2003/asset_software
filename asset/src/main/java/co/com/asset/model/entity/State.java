package co.com.asset.model.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Entity
@Table(name = "state")
public class State {

	@Id
	private Integer id;
	private String name;
	@Column(name = "country_id")
	private Integer countryId;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Country country;

	@Transient
	private Set<City> cities = new HashSet<City>();
}
