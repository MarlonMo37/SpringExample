package com.hcl.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("license") // register the bean with the spring container
public class DrivingLicense {
	private String licno = "ABC123";

}
