package com.bridgelabz.EmployeWageCalculator;

public class EmployeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmployeWageCalculator() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursInMonth);
		numOfCompany++;
	}
	
	private void computeEmpWage() {
		for(int i=0; i< numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		}
	}
	
	public  int  computeEmpWage(CompanyEmpWage companyEmpWage) {

		//variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays =0;
		//computation
		while(totalEmpHrs <= companyEmpWage.maxHoursInMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays ++;
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
			switch (empCheck) {
				case IS_PART_TIME : 
					empHrs = 4;
					break;
				case IS_FULL_TIME :
					empHrs = 8;
					break;
				default :
					empHrs = 0;
			}
		
			totalEmpHrs += empHrs;
			System.out.println("Days#: "+totalWorkingDays+"     Emp Hrs: "+ empHrs);
		}
		return totalEmpHrs *companyEmpWage.empRatePerHour;
		
	}
	
	private void displayEmpWage() {
		for (int i=0; i< numOfCompany; i++) {
			System.out.println(companyEmpWageArray[i]);
		}
	}
	
	public static void main(String[] args) {
		EmployeWageCalculator empWageBuilder = new EmployeWageCalculator();
		empWageBuilder.addCompanyEmpWage("Dmart",20, 5, 50);
		empWageBuilder.addCompanyEmpWage("Reliance",22, 6, 60);
		
		empWageBuilder.computeEmpWage();
		empWageBuilder.displayEmpWage();
		

		
	}

}



