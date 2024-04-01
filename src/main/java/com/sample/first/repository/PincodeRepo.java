package com.sample.first.repository;

import com.sample.first.entity.PincodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PincodeRepo extends JpaRepository<PincodeEntity, String> {


}
