package com.ibm.bluemix.westpac.hackathon.repositories;

import com.ibm.bluemix.westpac.hackathon.domain.Grantpayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by pas on 10/07/15.
 */
public interface JpaGrantpaymentRepository extends JpaRepository<Grantpayment, String>
{
    @Query("select a from Grantpayment a where a.grantid = ?1")
    List<Grantpayment> findByGrantid(String grantid);

    @Query("select sum(a.paymentamount) from Grantpayment a where a.grantid = ?1")
    int paymenttotal(String grantid);

}
