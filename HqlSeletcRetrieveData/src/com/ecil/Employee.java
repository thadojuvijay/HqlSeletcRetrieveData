package com.ecil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMP_TBLE",schema="BMS")
public class Employee
{
	
	@Id
	@SequenceGenerator(name="EMP_SEQ",sequenceName="EMP_SEQ",allocationSize=1)
	@GeneratedValue(generator="EMP_SEQ",strategy=GenerationType.SEQUENCE)
	@Column(name="ENO")
private Integer employeeNumber;
	@Column(name="NAME")
private String employeeName;
	@Column(name="SALARY")
private Double employeeSalary;
	
	
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}
	
	
	
	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}
	
	
	
	