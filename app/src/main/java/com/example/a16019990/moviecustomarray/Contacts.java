package com.example.a16019990.moviecustomarray;

public class Contacts {
    private String name;
    private int countryCode;
    private int phoneNum;

    public Contacts(String name, int countryCode, int phoneNum) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}
