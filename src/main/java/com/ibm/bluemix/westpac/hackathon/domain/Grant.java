package com.ibm.bluemix.westpac.hackathon.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Grant
{
    public Grant()
    {
    }

    @Id
    @Column(length=40)
    @GeneratedValue(generator="randomId")
    @GenericGenerator(name="randomId", strategy="com.ibm.bluemix.westpac.hackathon.domain.RandomIdGenerator")
    private String grantid;

    private String grantname;
    private String grantdescription;
    private int providerid;
    private String providername;
    private int recipientid;
    private String recipientname;
    private Date dateopened;
    private Date dateappclosed;
    private Date dateawarded;
    private int grantvalue;
    private String grantawarded;
    private String paymenttype;
    private int numberofpayments;

    public String getGrantid() {
        return grantid;
    }

    public void setGrantid(String grantid) {
        this.grantid = grantid;
    }

    public String getGrantname() {
        return grantname;
    }

    public void setGrantname(String grantname) {
        this.grantname = grantname;
    }

    public String getGrantdescription() {
        return grantdescription;
    }

    public void setGrantdescription(String grantdescription) {
        this.grantdescription = grantdescription;
    }

    public int getProviderid() {
        return providerid;
    }

    public void setProviderid(int providerid) {
        this.providerid = providerid;
    }

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername;
    }

    public int getRecipientid() {
        return recipientid;
    }

    public void setRecipientid(int recipientid) {
        this.recipientid = recipientid;
    }

    public String getRecipientname() {
        return recipientname;
    }

    public void setRecipientname(String recipientname) {
        this.recipientname = recipientname;
    }

    public Date getDateopened() {
        return dateopened;
    }

    public void setDateopened(Date dateopened) {
        this.dateopened = dateopened;
    }

    public Date getDateappclosed() {
        return dateappclosed;
    }

    public void setDateappclosed(Date dateappclosed) {
        this.dateappclosed = dateappclosed;
    }

    public Date getDateawarded() {
        return dateawarded;
    }

    public void setDateawarded(Date dateawarded) {
        this.dateawarded = dateawarded;
    }

    public int getGrantvalue() {
        return grantvalue;
    }

    public void setGrantvalue(int grantvalue) {
        this.grantvalue = grantvalue;
    }

    public String getGrantawarded() {
        return grantawarded;
    }

    public void setGrantawarded(String grantawarded) {
        this.grantawarded = grantawarded;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public int getNumberofpayments() {
        return numberofpayments;
    }

    public void setNumberofpayments(int numberofpayments) {
        this.numberofpayments = numberofpayments;
    }

    @Override
    public String toString() {
        return "Grant{" +
                "grantid='" + grantid + '\'' +
                ", grantname='" + grantname + '\'' +
                ", grantdescription='" + grantdescription + '\'' +
                ", providerid=" + providerid +
                ", providername='" + providername + '\'' +
                ", recipientid=" + recipientid +
                ", recipientname='" + recipientname + '\'' +
                ", dateopened=" + dateopened +
                ", dateappclosed=" + dateappclosed +
                ", dateawarded=" + dateawarded +
                ", grantvalue=" + grantvalue +
                ", grantawarded='" + grantawarded + '\'' +
                ", paymenttype='" + paymenttype + '\'' +
                ", numberofpayments=" + numberofpayments +
                '}';
    }
}
