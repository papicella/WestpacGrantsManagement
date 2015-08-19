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

    @RequestMapping(value = "/singlegrants", method = RequestMethod.GET)
    public List<Westpacgrant> listSingleGrants()
    {
        List<Westpacgrant> grants = (List<Westpacgrant>) repository.findSinglePaymentGrants();

        return grants;
    }

    @RequestMapping(value = "/multiplegrants", method = RequestMethod.GET)
    public List<Westpacgrant> listMultipleGrants()
    {
        List<Westpacgrant> grants = (List<Westpacgrant>) repository.findMultiplePaymentGrants();

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

    @RequestMapping(method=RequestMethod.PUT, value="/updategrant/{grantid}")
    public Westpacgrant update(@PathVariable String grantid, @RequestBody Westpacgrant grant)
    {
        Westpacgrant update = repository.findOne(grantid);

        update.setGrantname(update.getGrantname());
        update.setGrantdescription(update.getGrantdescription());
        update.setProviderid(update.getProviderid());
        update.setProvidername(update.getProvidername());
        update.setRecipientid(update.getRecipientid());
        update.setRecipientname(update.getRecipientname());
        update.setDateopened(update.getDateopened());
        update.setDateappclosed(update.getDateappclosed());
        update.setDateawarded(update.getDateawarded());
        update.setGrantvalue(update.getGrantvalue());
        update.setGrantawarded(update.getGrantawarded());
        update.setPaymenttype(update.getPaymenttype());
        update.setNumberofpayments(update.getNumberofpayments());

        return repository.save(update);
    }
}
