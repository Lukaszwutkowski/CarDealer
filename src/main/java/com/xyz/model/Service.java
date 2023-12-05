package com.xyz.model;

import javax.xml.crypto.Data;
import java.math.BigDecimal;

public class Service {

    private int serviceId;

    private Car car;

    private Data serviceDate;

    private String description;

    private BigDecimal cost;

    public Service(int serviceId, Car car, Data serviceDate, String description, BigDecimal cost) {
        this.serviceId = serviceId;
        this.car = car;
        this.serviceDate = serviceDate;
        this.description = description;
        this.cost = cost;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Data getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Data serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
