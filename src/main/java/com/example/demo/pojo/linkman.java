package com.example.demo.pojo;

public class linkman {
    //联系人Id
    private int investorId;
    //联系人名称
    private String lmNmae;
    //联系人电话
    private String lmPhone;
    //联系人电子邮件
    private String lmEmail;
    //备注
    private String lmRemake;

    public int getInverstorId() {
        return investorId;
    }

    public void setInverstorId(int inverstorId) {
        this.investorId = inverstorId;
    }

    public String getLmNmae() {
        return lmNmae;
    }

    public void setLmNmae(String lmNmae) {
        this.lmNmae = lmNmae;
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

    public linkman() {
    }

    public linkman(int inverstorId, String lmNmae, String lmPhone, String lmEmail, String lmRemake) {
        this.investorId = inverstorId;
        this.lmNmae = lmNmae;
        this.lmPhone = lmPhone;
        this.lmEmail = lmEmail;
        this.lmRemake = lmRemake;
    }

    @Override
    public String toString() {
        return "linkman{" +
                "inverstorId=" + investorId +
                ", lmNmae='" + lmNmae + '\'' +
                ", lmPhone='" + lmPhone + '\'' +
                ", lmEmail='" + lmEmail + '\'' +
                ", lmRemake='" + lmRemake + '\'' +
                '}';
    }
}
