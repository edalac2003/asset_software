package co.com.asset.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

	@GetMapping("/{name}")
	public String sample(@PathVariable String name){
		return String.format("Saludos!!!  %s Hoy es un buen día para programar", name.toUpperCase());
	}
}
