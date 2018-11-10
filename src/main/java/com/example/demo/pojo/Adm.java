package com.example.demo.pojo;

public class Adm {
    private int admId;
    private  String admName;
    private  String admPhone;

    public int getAdmId() {
        return admId;
    }

    public void setAdmId(int admId) {
        this.admId = admId;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName;
    }

    public String getAdmPhone() {
        return admPhone;
    }

    public void setAdmPhone(String admPhone) {
        this.admPhone = admPhone;
    }

    public Adm() {
    }

    public Adm(int admId, String admName, String admPhone) {
        this.admId = admId;
        this.admName = admName;
        this.admPhone = admPhone;
    }

    @Override
    public String toString() {
        return "Adm{" +
                "admId=" + admId +
                ", admName='" + admName + '\'' +
                ", admPhone='" + admPhone + '\'' +
                '}';
    }
}
