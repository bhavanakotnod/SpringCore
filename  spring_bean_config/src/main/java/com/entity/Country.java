package com.entity;

import org.springframework.beans.factory.annotation.Value;

public class Country {
	@Value("+91")
	String c_id;
	@Value("IND")
	String c_name;
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	@Override
	public String toString() {
		return "Country [c_id=" + c_id + ", c_name=" + c_name + "]";
	}
	
	

}
