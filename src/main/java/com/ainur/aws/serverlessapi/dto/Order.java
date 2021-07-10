package com.ainur.aws.serverlessapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {

    private Integer id;

    private String intemName;

    private Integer quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntemName() {
        return intemName;
    }

    public void setIntemName(String intemName) {
        this.intemName = intemName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", intemName='" + intemName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
