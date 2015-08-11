package com.ibm.bluemix.westpac.hackathon.repositories;

import com.ibm.bluemix.westpac.hackathon.domain.Westpacgrant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by pas on 9/07/15.
 */
public interface JpaGrantRepository extends JpaRepository<Westpacgrant, String>
{
    @Query("select a from Westpacgrant a where UPPER(a.grantname) like %?1%")
    List<Westpacgrant> findByGrantname(String grantname);

}
