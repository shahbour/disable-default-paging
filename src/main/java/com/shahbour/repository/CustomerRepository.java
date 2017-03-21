package com.shahbour.repository;

import com.shahbour.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by shahbour on 3/16/17.
 */
public interface CustomerRepository extends JpaRepository<Customer,Integer>,JpaSpecificationExecutor<Customer> {
}
