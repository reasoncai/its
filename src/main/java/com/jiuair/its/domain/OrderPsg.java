package com.jiuair.its.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class OrderPsg implements Serializable {
    private String psgId;

    private String orderId;

    private String psgType;

    private String psgName;

    private String psgFirstName;

    private String psgLastName;

    private String psgMidName;

    private String psgIdType;

    private String psgIdNo;

    private Date psgBirthdy;

    private String psgPartner;

    private String psgMobilePhone;

    private BigDecimal farePrice;

    private BigDecimal fareTax;

    private String fareEi;

    private String fareComment;

    private BigDecimal baggageweifth;

    private String paystatus;

    private String payseqno;

    private String dcsstatus;

    private String restatus;

    private Date dateCreated;

    private String whoCreated;

    private Date dateModified;

    private String whoModified;

    private String email;

    private String sex;

    private String ffpNo;

    private String ticketNo;

    private BigDecimal fareCn;

    private BigDecimal fareYq;

    private String bank;

    private String bankno;

    private String ticketNo1;

    private BigDecimal farePrice1;

    private BigDecimal fareTax1;

    private BigDecimal fareYq1;

    private String bankP;

    private static final long serialVersionUID = 1L;

    public String getPsgId() {
        return psgId;
    }

    public void setPsgId(String psgId) {
        this.psgId = psgId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPsgType() {
        return psgType;
    }

    public void setPsgType(String psgType) {
        this.psgType = psgType;
    }

    public String getPsgName() {
        return psgName;
    }

    public void setPsgName(String psgName) {
        this.psgName = psgName;
    }

    public String getPsgFirstName() {
        return psgFirstName;
    }

    public void setPsgFirstName(String psgFirstName) {
        this.psgFirstName = psgFirstName;
    }

    public String getPsgLastName() {
        return psgLastName;
    }

    public void setPsgLastName(String psgLastName) {
        this.psgLastName = psgLastName;
    }

    public String getPsgMidName() {
        return psgMidName;
    }

    public void setPsgMidName(String psgMidName) {
        this.psgMidName = psgMidName;
    }

    public String getPsgIdType() {
        return psgIdType;
    }

    public void setPsgIdType(String psgIdType) {
        this.psgIdType = psgIdType;
    }

    public String getPsgIdNo() {
        return psgIdNo;
    }

    public void setPsgIdNo(String psgIdNo) {
        this.psgIdNo = psgIdNo;
    }

    public Date getPsgBirthdy() {
        return psgBirthdy;
    }

    public void setPsgBirthdy(Date psgBirthdy) {
        this.psgBirthdy = psgBirthdy;
    }

    public String getPsgPartner() {
        return psgPartner;
    }

    public void setPsgPartner(String psgPartner) {
        this.psgPartner = psgPartner;
    }

    public String getPsgMobilePhone() {
        return psgMobilePhone;
    }

    public void setPsgMobilePhone(String psgMobilePhone) {
        this.psgMobilePhone = psgMobilePhone;
    }

    public BigDecimal getFarePrice() {
        return farePrice;
    }

    public void setFarePrice(BigDecimal farePrice) {
        this.farePrice = farePrice;
    }

    public BigDecimal getFareTax() {
        return fareTax;
    }

    public void setFareTax(BigDecimal fareTax) {
        this.fareTax = fareTax;
    }

    public String getFareEi() {
        return fareEi;
    }

    public void setFareEi(String fareEi) {
        this.fareEi = fareEi;
    }

    public String getFareComment() {
        return fareComment;
    }

    public void setFareComment(String fareComment) {
        this.fareComment = fareComment;
    }

    public BigDecimal getBaggageweifth() {
        return baggageweifth;
    }

    public void setBaggageweifth(BigDecimal baggageweifth) {
        this.baggageweifth = baggageweifth;
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    public String getPayseqno() {
        return payseqno;
    }

    public void setPayseqno(String payseqno) {
        this.payseqno = payseqno;
    }

    public String getDcsstatus() {
        return dcsstatus;
    }

    public void setDcsstatus(String dcsstatus) {
        this.dcsstatus = dcsstatus;
    }

    public String getRestatus() {
        return restatus;
    }

    public void setRestatus(String restatus) {
        this.restatus = restatus;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getWhoCreated() {
        return whoCreated;
    }

    public void setWhoCreated(String whoCreated) {
        this.whoCreated = whoCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getWhoModified() {
        return whoModified;
    }

    public void setWhoModified(String whoModified) {
        this.whoModified = whoModified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFfpNo() {
        return ffpNo;
    }

    public void setFfpNo(String ffpNo) {
        this.ffpNo = ffpNo;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public BigDecimal getFareCn() {
        return fareCn;
    }

    public void setFareCn(BigDecimal fareCn) {
        this.fareCn = fareCn;
    }

    public BigDecimal getFareYq() {
        return fareYq;
    }

    public void setFareYq(BigDecimal fareYq) {
        this.fareYq = fareYq;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    public String getTicketNo1() {
        return ticketNo1;
    }

    public void setTicketNo1(String ticketNo1) {
        this.ticketNo1 = ticketNo1;
    }

    public BigDecimal getFarePrice1() {
        return farePrice1;
    }

    public void setFarePrice1(BigDecimal farePrice1) {
        this.farePrice1 = farePrice1;
    }

    public BigDecimal getFareTax1() {
        return fareTax1;
    }

    public void setFareTax1(BigDecimal fareTax1) {
        this.fareTax1 = fareTax1;
    }

    public BigDecimal getFareYq1() {
        return fareYq1;
    }

    public void setFareYq1(BigDecimal fareYq1) {
        this.fareYq1 = fareYq1;
    }

    public String getBankP() {
        return bankP;
    }

    public void setBankP(String bankP) {
        this.bankP = bankP;
    }
}