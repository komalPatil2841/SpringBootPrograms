package com.mouritech.springbootsecuritywithroles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.springbootsecuritywithroles.entity.Staff;
@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

}
