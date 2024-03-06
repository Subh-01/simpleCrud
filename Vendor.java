package com.subham.restdemo;

public class Vendor {
    private String name;
    private Long id;
    private String address;

    public Vendor(String name, Long id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

//    public Vendor() {
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
