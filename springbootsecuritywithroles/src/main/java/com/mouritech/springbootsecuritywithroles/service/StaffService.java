package com.mouritech.springbootsecuritywithroles.service;

import java.util.List;

import com.mouritech.springbootsecuritywithroles.entity.Staff;
import com.mouritech.springbootsecuritywithroles.exception.StaffNotFoundException;

public interface StaffService {
	Staff insertStaff(Staff newStaff);

	Staff showStaffById(Long stafid) throws StaffNotFoundException;

	List<Staff> showAllStaffs();



	Staff updateStaffById(Long stafid, Staff Staff) throws StaffNotFoundException;

	void deleteStaffById(Long stafid) throws StaffNotFoundException;

	Staff updateSalaryById(Long staffid, Staff Staff) throws StaffNotFoundException;
}
