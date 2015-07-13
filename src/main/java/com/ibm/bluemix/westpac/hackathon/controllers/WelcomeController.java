package com.ibm.bluemix.westpac.hackathon.controllers;

import com.ibm.bluemix.westpac.hackathon.repositories.JpaGrantRepository;
import com.ibm.bluemix.westpac.hackathon.repositories.JpaGrantpaymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController
{
    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    private JpaGrantRepository grantRepository;
    private JpaGrantpaymentRepository paymentRepository;

    @Autowired
    public WelcomeController(JpaGrantRepository grantRepository, JpaGrantpaymentRepository paymentRepository)
    {
        this.grantRepository = grantRepository;
        this.paymentRepository = paymentRepository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(Model model)
    {
        model.addAttribute("grantscount", grantRepository.findAll().size());
        model.addAttribute("grantspaymentcount", paymentRepository.findAll().size());
        return "welcome";
    }

}
