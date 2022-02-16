package com.mouritech.springbootsecuritywithroles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.springbootsecuritywithroles.entity.Staff;
import com.mouritech.springbootsecuritywithroles.exception.StaffNotFoundException;
import com.mouritech.springbootsecuritywithroles.repository.StaffRepository;

@Service
public class StaffServiceImpl  implements StaffService{
	@Autowired
	private StaffRepository staffRepository;

	@Override
	public Staff insertStaff(Staff newStaff) {
	
	
		return staffRepository.save(newStaff);
	}
	
	
	

	@Override
	public Staff showStaffById(Long staffid) throws StaffNotFoundException {
		// TODO Auto-generated method stub
		return staffRepository.findById(staffid).orElseThrow(() -> new StaffNotFoundException("Staff not found with id " + staffid));
	}


	@Override
	public List<Staff> showAllStaffs() {
		// TODO Auto-generated method stub
		return staffRepository.findAll();
	}


	@Override
	public Staff updateStaffById(Long staffid,Staff Staff) throws StaffNotFoundException {
		Staff existingStaff = staffRepository.findById(staffid).orElseThrow(() -> new StaffNotFoundException("Staff not found with id " + staffid));
		existingStaff.setStaffmobno(Staff.getStaffmobno());
		existingStaff.setStaffemail(Staff.getStaffemail());
		
		return existingStaff;
	}

	@Override
	public Staff updateSalaryById(Long staffid,Staff Staff) throws StaffNotFoundException {
		Staff existingStaff = staffRepository.findById(staffid).orElseThrow(() -> new StaffNotFoundException("Staff not found with id " + staffid));
		existingStaff.setStaffsalary(Staff.getStaffsalary());
		
		
		return existingStaff;
	}


	@Override
	public void deleteStaffById(Long staffid) throws StaffNotFoundException {
		Staff existingStaff = staffRepository.findById(staffid).orElseThrow(() -> new StaffNotFoundException("Staff not found with id " + staffid));
		staffRepository.delete(existingStaff);
	}


	
}
