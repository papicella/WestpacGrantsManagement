package com.ibm.bluemix.westpac.hackathon.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest
{
    @RequestMapping("/info")
    public String hello()
    {
        return "Westpac Hackathon - Grants Management API's version 1.0";
    }

}
