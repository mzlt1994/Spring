package com.icbc.entities;

public class Shop {
    private String id;
    private String name;
    private Double allMoney;

    public Shop() {
        super();
    }

    public Shop(String id, String name, Double allMoney) {
        this.id = id;
        this.name = name;
        this.allMoney = allMoney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(Double allMoney) {
        this.allMoney = allMoney;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", allMoney=" + allMoney +
                '}';
    }
}
