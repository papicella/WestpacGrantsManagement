package com.ibm.bluemix.westpac.hackathon.controllers;

import com.ibm.bluemix.westpac.hackathon.domain.Grantpayment;
import com.ibm.bluemix.westpac.hackathon.repositories.JpaGrantpaymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pas on 11/07/15.
 */
@RestController
public class GrantpaymentRest
{
    private static final Logger logger = LoggerFactory.getLogger(GrantRest.class);
    private JpaGrantpaymentRepository repository;

    @Autowired
    public GrantpaymentRest(JpaGrantpaymentRepository repository)
    {
        this.repository = repository;
    }

    @RequestMapping(value = "/viewpayments", method = RequestMethod.GET)
    public List<Grantpayment> viewGrant(@RequestParam(value="grantid", required=true) String grantid)
    {
        List<Grantpayment> payments = repository.findByGrantid(grantid);

        return payments;
    }
}
