package com.ibm.bluemix.westpac.hackathon.controllers;

import com.ibm.bluemix.westpac.hackathon.domain.Westpacgrant;
import com.ibm.bluemix.westpac.hackathon.repositories.JpaGrantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Westpacgrant> listGrants()
    {
        List<Westpacgrant> grants = (List<Westpacgrant>) repository.findAll();

        return grants;
    }

    @RequestMapping(value = "/viewgrant", method = RequestMethod.GET)
    public Westpacgrant viewGrant(@RequestParam(value="grantid", required=true) String grantid)
    {
        Westpacgrant grant = repository.findOne(grantid);

        return grant;
    }

    @RequestMapping(value = "/newgrant", method=RequestMethod.POST)
    public Westpacgrant create(@RequestBody Westpacgrant grant)
    {
        return repository.save(grant);
    }

    @RequestMapping(value = "/searchgrants", method=RequestMethod.POST)
    public List<Westpacgrant> searchGrants(@RequestParam(value="grantname") String grantname)
    {
        List<Westpacgrant> grants = (List<Westpacgrant>) repository.findByGrantname(grantname);

        return grants;
    }

    //TODO: Update grant using HTTP PUT method

}
