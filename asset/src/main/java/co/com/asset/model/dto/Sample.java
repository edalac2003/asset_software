package co.com.asset.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Sample {

	private int id;
	private String firstName;
	private String lastName;
	private String genre;
}
