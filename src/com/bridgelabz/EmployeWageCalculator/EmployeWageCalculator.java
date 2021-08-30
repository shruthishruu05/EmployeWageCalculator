package com.bridgelabz.EmployeWageCalculator;

public class EmployeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private static String company;
	private static int empRatePerHour;
	private static int numOfWorkingDays;
	private static int maxHoursInMonth ;
	
	EmployeWageCalculator(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth){
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}
	
	public  void computeEmpWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays =0;
		while(totalEmpHrs <= maxHoursInMonth && totalWorkingDays < numOfWorkingDays) {
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
		int totalWage = totalEmpHrs *empRatePerHour;
		System.out.println("The total wage of employee in "+company+" is : "+ totalWage);
	}
	
	public static void main(String[] args) {
		EmployeWageCalculator dMart = new EmployeWageCalculator("Dmart",20, 5, 50);
		dMart.computeEmpWage();
		
		EmployeWageCalculator Reliance = new EmployeWageCalculator("Reliance",22, 6, 60);
		Reliance.computeEmpWage();
		
	}

}



