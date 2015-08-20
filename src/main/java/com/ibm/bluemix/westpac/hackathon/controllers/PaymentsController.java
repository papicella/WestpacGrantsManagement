package com.ibm.bluemix.westpac.hackathon.controllers;

import com.ibm.bluemix.westpac.hackathon.domain.Grantpayment;
import com.ibm.bluemix.westpac.hackathon.domain.Westpacgrant;
import com.ibm.bluemix.westpac.hackathon.repositories.JpaGrantRepository;
import com.ibm.bluemix.westpac.hackathon.repositories.JpaGrantpaymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PaymentsController
{
    private static final Logger logger = LoggerFactory.getLogger(PaymentsController.class);

    private JpaGrantRepository grantRepository;
    private JpaGrantpaymentRepository paymentRepository;

    @Autowired
    public PaymentsController(JpaGrantRepository grantRepository, JpaGrantpaymentRepository paymentRepository)
    {
        this.grantRepository = grantRepository;
        this.paymentRepository = paymentRepository;
    }

    @RequestMapping(value = "/payments", method = RequestMethod.GET)
    public String welcome(Model model)
    {
        model.addAttribute("grantscount", grantRepository.findAll().size());
        model.addAttribute("grants", grantRepository.findAll());

        return "payments";
    }

    @RequestMapping(value="/searchGrants", method = RequestMethod.POST)
    public String searchGrants(@RequestParam(value="inputSearch") String id, Model model)
    {
        List<Westpacgrant> grants = new ArrayList();
        grants = grantRepository.findByRecipientId(Integer.parseInt(id));

        model.addAttribute("grants", grants);
        model.addAttribute("grantscount", grants.size());

        return "payments";
    }

    @RequestMapping(value="/viewGrantPayments", method = RequestMethod.GET)
    public String searchPayments(@RequestParam(value="grantid") String grantid, Model model)
    {
        List<Grantpayment> payments = new ArrayList();
        payments = paymentRepository.findByGrantid(grantid);
        model.addAttribute("grant", grantRepository.findOne(grantid));
        model.addAttribute("grantpayments", payments);
        model.addAttribute("grantpaymentcount", payments.size());

        return "grantpayments";
    }
}
