package com.code.spring;

import java.io.Serializable;

public class Exposure  implements Serializable{
	
	private static final long serialVersionUID = 5462223600l;
	private String exposureId;
	private String exposureCode;
	public String getExposureId() {
		return exposureId;
	}
	public void setExposureId(String exposureId) {
		this.exposureId = exposureId;
	}
	public String getExposureCode() {
		return exposureCode;
	}
	public void setExposureCode(String exposureCode) {
		this.exposureCode = exposureCode;
	}

}
