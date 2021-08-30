package com.bridgelabz.EmployeWageCalculator;

public class CompanyEmpWage {
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursInMonth ;
	public int totalWage;
	
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth){
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}
	
	public void setTotalEmpWage (int totalEmpWage) {
		this.totalWage = totalEmpWage;
	}
	
	@Override
	public String toString() {
		return "The total wage of employee in "+company+" is : "+ totalWage;
	}
}
