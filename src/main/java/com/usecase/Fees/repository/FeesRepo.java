package com.usecase.Fees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usecase.Fees.model.Fees;

public interface FeesRepo extends JpaRepository<Fees, Integer> {

}
