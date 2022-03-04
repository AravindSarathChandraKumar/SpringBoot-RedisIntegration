package com.code.spring;

import java.io.Serializable;

public class Collision  implements Serializable{
	
	private static final long serialVersionUID = 5462223600l;
	private String collisionCode;
	private String publicCode;
	private Exposure exposureDetails;
	public String getCollisionCode() {
		return collisionCode;
	}
	public void setCollisionCode(String collisionCode) {
		this.collisionCode = collisionCode;
	}
	public String getPublicCode() {
		return publicCode;
	}
	public void setPublicCode(String publicCode) {
		this.publicCode = publicCode;
	}
	public Exposure getExposureDetails() {
		return exposureDetails;
	}
	public void setExposureDetails(Exposure exposureDetails) {
		this.exposureDetails = exposureDetails;
	}
	
	

}
