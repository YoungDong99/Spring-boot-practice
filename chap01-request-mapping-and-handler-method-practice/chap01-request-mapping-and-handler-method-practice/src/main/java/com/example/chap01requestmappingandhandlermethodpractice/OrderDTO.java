package com.example.chap01requestmappingandhandlermethodpractice;

import java.util.Date;

public class OrderDTO {
    private String name;
    private String quantity;
    private String orderer;
    private String address;
    private String phone;
    private Date date;

    public OrderDTO() {
    }

    public OrderDTO(String name, String quantity, String orderer, String address, String phone, Date date) {
        this.name = name;
        this.quantity = quantity;
        this.orderer = orderer;
        this.address = address;
        this.phone = phone;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOrderer() {
        return orderer;
    }

    public void setOrderer(String orderer) {
        this.orderer = orderer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "name='" + name + '\'' +
                ", quantity='" + quantity + '\'' +
                ", orderer='" + orderer + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
