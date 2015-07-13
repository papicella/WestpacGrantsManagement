package com.ibm.bluemix.westpac.hackathon.controllers;

import com.ibm.bluemix.westpac.hackathon.domain.Grant;
import com.ibm.bluemix.westpac.hackathon.repositories.JpaGrantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pas on 9/07/15.
 */
@RestController
public class GrantRest
{
    private static final Logger logger = LoggerFactory.getLogger(GrantRest.class);
    private JpaGrantRepository repository;

    @Autowired
    public GrantRest(JpaGrantRepository repository)
    {
        this.repository = repository;
    }

    @RequestMapping(value = "/grants", method = RequestMethod.GET)
    public List<Grant> listGrants()
    {
        List<Grant> grants = (List<Grant>) repository.findAll();

        return grants;
    }

    @RequestMapping(value = "/viewgrant", method = RequestMethod.GET)
    public Grant viewGrant(@RequestParam(value="grantid", required=true) String grantid)
    {
        Grant grant = repository.findOne(grantid);

        return grant;
    }

}
