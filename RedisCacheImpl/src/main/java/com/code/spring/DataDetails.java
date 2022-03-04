package com.code.spring;

import java.io.Serializable;

public class DataDetails implements Serializable{
	
	private static final long serialVersionUID = 5462223600l;

	private String name;
	private Collision collisionDetails;
	private String code;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collision getCollisionDetails() {
		return collisionDetails;
	}
	public void setCollisionDetails(Collision collisionDetails) {
		this.collisionDetails = collisionDetails;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	

}
