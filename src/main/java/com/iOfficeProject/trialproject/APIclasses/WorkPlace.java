package com.iOfficeProject.trialproject.APIclasses;


//NOTE: DO I EVEN NEED API CLASSES IF I'M NOT CREATING A DATABASE???


import java.util.Date;


public class WorkPlace {

	private String WorkPlace_ID;
	private String WorkPlace_Name;
	private String Address;
	private Date Timezone;
	private String Group;
	private String Start_Date;
	private String End_Date;
	private int Active_Start_Hour;
	private int Active_End_Hour;
	
	public WorkPlace() {
	}

	public String getWorkPlace_ID() {
		return WorkPlace_ID;
	}

	public void setWorkPlace_ID(String workPlace_ID) {
		WorkPlace_ID = workPlace_ID;
	}

	public String getWorkPlace_Name() {
		return WorkPlace_Name;
	}

	public void setWorkPlace_Name(String workPlace_Name) {
		WorkPlace_Name = workPlace_Name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getTimezone() {
		return Timezone;
	}

	public void setTimezone(Date timezone) {
		Timezone = timezone;
	}

	public String getGroup() {
		return Group;
	}

	public void setGroup(String group) {
		Group = group;
	}

	public String getStart_Date() {
		return Start_Date;
	}

	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}

	public String getEnd_Date() {
		return End_Date;
	}

	public void setEnd_Date(String end_Date) {
		End_Date = end_Date;
	}

	public int getActive_Start_Hour() {
		return Active_Start_Hour;
	}

	public void setActive_Start_Hour(int active_Start_Hour) {
		Active_Start_Hour = active_Start_Hour;
	}

	public int getActive_End_Hour() {
		return Active_End_Hour;
	}

	public void setActive_End_Hour(int active_End_Hour) {
		Active_End_Hour = active_End_Hour;
	}

	
}
