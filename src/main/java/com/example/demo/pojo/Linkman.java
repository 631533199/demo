package com.example.demo.pojo;

public class Linkman {
    //联系人Id
    private String investorId;
    //联系人名称
    private String lmNmae;
    //职位
    private String lmPost;
    //联系人电话
    private String lmPhone;
    //联系人电子邮件
    private String lmEmail;
    //备注
    private String lmRemake;

    public String getInvestorId() {
        return investorId;
    }

    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    public String getLmNmae() {
        return lmNmae;
    }

    public void setLmNmae(String lmNmae) {
        this.lmNmae = lmNmae;
    }

    public String getLmPost() {
        return lmPost;
    }

    public void setLmPost(String lmPost) {
        this.lmPost = lmPost;
    }

    public String getLmPhone() {
        return lmPhone;
    }

    public void setLmPhone(String lmPhone) {
        this.lmPhone = lmPhone;
    }

    public String getLmEmail() {
        return lmEmail;
    }

    public void setLmEmail(String lmEmail) {
        this.lmEmail = lmEmail;
    }

    public String getLmRemake() {
        return lmRemake;
    }

    public void setLmRemake(String lmRemake) {
        this.lmRemake = lmRemake;
    }

    public Linkman() {
    }

    public Linkman(String investorId, String lmNmae, String lmPost, String lmPhone, String lmEmail, String lmRemake) {
        this.investorId = investorId;
        this.lmNmae = lmNmae;
        this.lmPost = lmPost;
        this.lmPhone = lmPhone;
        this.lmEmail = lmEmail;
        this.lmRemake = lmRemake;
    }

    @Override
    public String toString() {
        return "Linkman{" +
                "investorId='" + investorId + '\'' +
                ", lmNmae='" + lmNmae + '\'' +
                ", lmPost='" + lmPost + '\'' +
                ", lmPhone='" + lmPhone + '\'' +
                ", lmEmail='" + lmEmail + '\'' +
                ", lmRemake='" + lmRemake + '\'' +
                '}';
    }
}
