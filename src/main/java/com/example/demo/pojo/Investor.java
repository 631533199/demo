package com.example.demo.pojo;

import java.util.Date;

public class Investor {
    //资方ID
    private String investorId;
    //资方名称
    private String investorName;
    //资方简称
    private String investorShortName;
    //资方类型请选择
    //下拉选项：银行、金融机构、第三方
    private String type;
    //证件类型
    private String DocumentType;
    //证件号码
    private String idNumber;
    //营业起始日
    private String openingDate;
    //营业到期日
    private String expirationDate;
    //合作开始日
    private String startDate;
    //合作到期日
    private String endDate;
    //电子邮件
    private String emaile;
    //注册资金(万美金)
    private String initialFunding;
    //法人
    private String legalPerson;
    //注册地址
    private String registeredAddress;

    public String getInvestorId() {
        return investorId;
    }

    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public String getInvestorShortName() {
        return investorShortName;
    }

    public void setInvestorShortName(String investorShortName) {
        this.investorShortName = investorShortName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDocumentType() {
        return DocumentType;
    }

    public void setDocumentType(String documentType) {
        DocumentType = documentType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEmaile() {
        return emaile;
    }

    public void setEmaile(String emaile) {
        this.emaile = emaile;
    }

    public String getInitialFunding() {
        return initialFunding;
    }

    public void setInitialFunding(String initialFunding) {
        this.initialFunding = initialFunding;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public Investor( String investorId, String investorName, String investorShortName, String type, String documentType, String idNumber, String openingDate, String expirationDate, String startDate, String endDate, String emaile, String initialFunding, String legalPerson, String registeredAddress) {
        this.investorId = investorId;
        this.investorName = investorName;
        this.investorShortName = investorShortName;
        this.type = type;
        DocumentType = documentType;
        this.idNumber = idNumber;
        this.openingDate = openingDate;
        this.expirationDate = expirationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.emaile = emaile;
        this.initialFunding = initialFunding;
        this.legalPerson = legalPerson;
        this.registeredAddress = registeredAddress;
    }

    public Investor() {
    }

    @Override
    public String toString() {
        return "Investor{" +
                "investorId=" + investorId +
                ", investorName='" + investorName + '\'' +
                ", investorShortName='" + investorShortName + '\'' +
                ", type='" + type + '\'' +
                ", DocumentType='" + DocumentType + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", openingDate=" + openingDate +
                ", expirationDate=" + expirationDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", emaile='" + emaile + '\'' +
                ", initialFunding='" + initialFunding + '\'' +
                ", legalPerson='" + legalPerson + '\'' +
                ", registeredAddress='" + registeredAddress + '\'' +
                '}';
    }
}
