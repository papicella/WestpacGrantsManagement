package com.ibm.bluemix.westpac.hackathon.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by pas on 10/07/15.
 */
@Entity
public class Grantpayment
{
    public Grantpayment()
    {
    }

    @Id
    @Column(length=40)
    @GeneratedValue(generator="randomId")
    @GenericGenerator(name="randomId", strategy="com.ibm.bluemix.westpac.hackathon.domain.RandomIdGenerator")
    private String grantpaymentid;

    @Column(length=40)
    private String grantid;

    private int paymentnumber;
    private int paymentamount;

    @Temporal(TemporalType.DATE)
    private Date duedate;

    @Temporal(TemporalType.DATE)
    private Date datepaid;

    private String criteriarequired;
    private String criteriamet;


    public String getGrantid() {
        return grantid;
    }

    public void setGrantid(String grantid) {
        this.grantid = grantid;
    }

    public int getPaymentnumber() {
        return paymentnumber;
    }

    public void setPaymentnumber(int paymentnumber) {
        this.paymentnumber = paymentnumber;
    }

    public int getPaymentamount() {
        return paymentamount;
    }

    public void setPaymentamount(int paymentamount) {
        this.paymentamount = paymentamount;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public Date getDatepaid() {
        return datepaid;
    }

    public void setDatepaid(Date datepaid) {
        this.datepaid = datepaid;
    }

    public String getCriteriarequired() {
        return criteriarequired;
    }

    public void setCriteriarequired(String criteriarequired) {
        this.criteriarequired = criteriarequired;
    }

    public String getCriteriamet() {
        return criteriamet;
    }

    public void setCriteriamet(String criteriamet) {
        this.criteriamet = criteriamet;
    }

    public String getGrantpaymentid() {
        return grantpaymentid;
    }

    public void setGrantpaymentid(String grantpaymentid) {
        this.grantpaymentid = grantpaymentid;
    }

    @Override
    public String toString() {
        return "Grantpayment{" +
                "grantpaymentid='" + grantpaymentid + '\'' +
                ", grantid='" + grantid + '\'' +
                ", paymentnumber=" + paymentnumber +
                ", paymentamount=" + paymentamount +
                ", duedate=" + duedate +
                ", datepaid=" + datepaid +
                ", criteriarequired='" + criteriarequired + '\'' +
                ", criteriamet='" + criteriamet + '\'' +
                '}';
    }
}
