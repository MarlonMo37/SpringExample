package com.hcl.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("driver")
public class Driver {
	/*
	 * Autowired be be used in member variable, of the setterMethod and constructor
	 */
	@Autowired // HAS A equavalent to autowire="byType" in spring.xml
	private DrivingLicense license;

}
