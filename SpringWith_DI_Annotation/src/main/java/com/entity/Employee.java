package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("101")
	private int Emp_id;
	@Value("Raghu")
	private String emp_name;
	@Value("Pune")
	private String city;
	@Autowired
	private  Country con;
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Country getCon() {
		return con;
	}
	public void setCon(Country con) {
		this.con = con;
	}
	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", emp_name=" + emp_name + ", city=" + city + ", con=" + con + "]";
	}

}
