package com.xyz.model;

import java.math.BigDecimal;
import java.util.Date;

public class Inventory {

    private int inventoryId;
    private Car car;
    private Address address;
    private Status status;
    private Date acquisitionDate;
    private BigDecimal acquisitionPrice;

    public Inventory(int inventoryId, Car car, Address address, Status status, Date acquisitionDate, BigDecimal acquisitionPrice) {
        this.inventoryId = inventoryId;
        this.car = car;
        this.address = address;
        this.status = status;
        this.acquisitionDate = acquisitionDate;
        this.acquisitionPrice = acquisitionPrice;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public BigDecimal getAcquisitionPrice() {
        return acquisitionPrice;
    }

    public void setAcquisitionPrice(BigDecimal acquisitionPrice) {
        this.acquisitionPrice = acquisitionPrice;
    }
}
