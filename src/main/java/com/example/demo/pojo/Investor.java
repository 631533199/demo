package com.example.demo.pojo;

import java.util.Date;

public class Investor {
    //资方ID
    private int investorId;
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
    private Date openingDate;
    //营业到期日
    private Date expirationDate;
    //合作开始日
    private Date startDate;
    //合作到期日
    private Date endDate;
    //电子邮件
    private String emaile;
    //注册资金(万美金)
    private String initialFunding;
    //法人
    private String legalPerson;
    //注册地址
    private String registeredAddress;

    public int getInvestorId() {
        return investorId;
    }

    public void setInvestorId(int investorId) {
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

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
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

    public Investor() {
    }

    public Investor(int investorId, String investorName, String investorShortName, String type, String documentType, String idNumber, Date openingDate, Date expirationDate, Date startDate, Date endDate, String emaile, String initialFunding, String legalPerson, String registeredAddress) {
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
