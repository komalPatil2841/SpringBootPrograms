package com.mouritech.springbootsecuritywithroles.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="staff")
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer staffid;
	
	private String staffname;
	private String staffemail;
	private String staffpassword;
	private String staffrole;
	private Double staffcommission;
	private Double staffsalary ;
	private String staffmobno;
	
	
	

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getStaffid() {
		return staffid;
	}
	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getStaffemail() {
		return staffemail;
	}
	public void setStaffemail(String staffemail) {
		this.staffemail = staffemail;
	}
	public String getStaffpassword() {
		return staffpassword;
	}
	public void setStaffpassword(String staffpassword) {
		this.staffpassword = staffpassword;
	}
	public String getStaffrole() {
		return staffrole;
	}
	public void setStaffrole(String staffrole) {
		this.staffrole = staffrole;
	}
	public Double getStaffcommission() {
		return staffcommission;
	}
	public void setStaffcommission(Double staffcommission) {
		this.staffcommission = staffcommission;
	}
	public Double getStaffsalary() {
		return staffsalary;
	}
	public void setStaffsalary(Double staffsalary) {
		this.staffsalary = staffsalary;
	}
	public String getStaffmobno() {
		return staffmobno;
	}
	public void setStaffmobno(String staffmobno) {
		this.staffmobno = staffmobno;
	}

	public Staff(Integer staffid, String staffname, String staffemail, String staffpassword, String staffrole,
			Double staffcommission, Double staffsalary, String staffmobno) {
		super();
		this.staffid = staffid;
		this.staffname = staffname;
		this.staffemail = staffemail;
		this.staffpassword = staffpassword;
		this.staffrole = staffrole;
		this.staffcommission = staffcommission;
		this.staffsalary = staffsalary;
		this.staffmobno = staffmobno;
	
	}

	public Staff(String staffname, String staffemail, String staffpassword, String staffrole, Double staffcommission,
			Double staffsalary, String staffmobno) {
		super();
		this.staffname = staffname;
		this.staffemail = staffemail;
		this.staffpassword = staffpassword;
		this.staffrole = staffrole;
		this.staffcommission = staffcommission;
		this.staffsalary = staffsalary;
		this.staffmobno = staffmobno;
		
	}

	@Override
	public String toString() {
		return "Staff [staffid=" + staffid + ", staffname=" + staffname + ", staffemail=" + staffemail
				+ ", staffpassword=" + staffpassword + ", staffrole=" + staffrole + ", staffcommission="
				+ staffcommission + ", staffsalary=" + staffsalary + ", staffmobno=" + staffmobno + "]";
	}

	
}
