package design;

import java.util.Scanner;

public class EmployeeInfo extends Abstract_Class implements Employee {

 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 *
 * Important: YOU MUST USE the
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private String employeeName;
    private int employeeId;
    private String deptName;
    private double salary;
    private int performance;


    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        EmployeeInfo.companyName = companyName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }


    public void companyInfo(){
        companyName = "PNT";
        System.out.println("Company name is " + companyName);
    }

    public void companyInfo(int address){
        System.out.println("address of pnt is: " + address);
    }




	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
    public EmployeeInfo(){}
	public EmployeeInfo(int employeeId){
	    this.employeeId = employeeId;
	    Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = s.nextLine();
        this.employeeName=name;
        System.out.println("thank for your registration "+name +"\n" + "your employee id is "+employeeId);

    }
    public EmployeeInfo(String name, int employeeId){
	    this.employeeId = employeeId;
	    this.employeeName = name;

	}

    //from abstract class
	public void empInfo(int DOB) {
        System.out.println("DOB of Md Taque is: " + DOB);
    }

    @Override
    public void empInfo(String maritalStatus){
        System.out.println("Md Taque is "+maritalStatus);
    }


    /*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		int total=0;
		return total;
	}

	public static double calculateEmployeeBonus(double monthlySalary, int performance){
	    double yearlybonus;
	    if(performance==10){
	        yearlybonus = monthlySalary * 0.1 * 12;
            System.out.println("Emp 1 yearly bonus is: "+yearlybonus);
        }else if(performance==8){
	        yearlybonus = monthlySalary * 0.08 * 12;
            System.out.println("Emp 2 yearly bonus is: "+yearlybonus);
        }else if(performance==5){
	        yearlybonus = monthlySalary * 0.05 * 12;
            System.out.println("Emp 3 yearly bonus is: "+yearlybonus);
        }else if(performance==2){
	        yearlybonus = monthlySalary * 0.02 * 12;
            System.out.println("performance is not good, need to improve");
        }else{
	        yearlybonus = 0;
            System.out.println("bonus is coming for u!");
        }
        return yearlybonus;

    }

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static double calculateEmployeePension(double salary){
		double total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		//Calculate pension

        String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
        String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedTodaysDate.length());

        int start = Integer.parseInt(startYear);
        int current = Integer.parseInt(currentYear);

        //Calculate pension
        int numberOfYears = current - start;

        if (numberOfYears >= 5) {
            total = salary * .25;
        } else if (numberOfYears == 4) {
            total = salary * .20;
        } else if (numberOfYears == 3) {
            total = salary * .15;
        } else if (numberOfYears == 2) {
            total = salary * .10;
        } else if (numberOfYears == 1) {
            total = salary * .05;
        } else if (numberOfYears == 0) {
            total = 0;
        }
        System.out.println("Total pension: $" + total);

		return total;
	}

    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }



    public void assignDepartment(String deptName) {
	    this.deptName = deptName;
        System.out.println("Dept Name: " + deptName);

    }

    @Override
    public double calculateSalary(double salary) {
        double yearlySalary = salary * 12;
        return yearlySalary;
    }


    @Override
    public void benefitLayout() {

    }


    private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
