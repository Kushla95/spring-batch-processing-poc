package com.zkteco.spring.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zkteco.spring.batch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
