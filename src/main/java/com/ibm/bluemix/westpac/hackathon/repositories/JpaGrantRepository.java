package com.ibm.bluemix.westpac.hackathon.repositories;

import com.ibm.bluemix.westpac.hackathon.domain.Grant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by pas on 9/07/15.
 */
public interface JpaGrantRepository extends JpaRepository<Grant, String>
{
}
