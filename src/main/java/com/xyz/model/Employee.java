package com.xyz.model;

import java.math.BigDecimal;
import java.util.Date;

public class Employee extends Person{

    private int employeeId;

    private String position;

    private BigDecimal salary;

    private Date hireDate;

    public Employee(String firstName, String lastName, Address address, String phoneNumber, String email, int employeeId, String position, BigDecimal salary, Date hireDate) {
        super(firstName, lastName, address, phoneNumber, email);
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
