package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		
            EmployeeInfo employee1 = new EmployeeInfo(410);
            EmployeeInfo employee2 = new EmployeeInfo("AA", 101 );
            EmployeeInfo employee3 = new EmployeeInfo("BB",102);
            EmployeeInfo employee4 = new EmployeeInfo("CC",103);

            employee1.assignDepartment("IT");
            employee2.assignDepartment("HR");
            employee3.assignDepartment("Sales");
            employee4.assignDepartment("Management");

            employee1.setSalary(8000);
            double salary1 = employee1.getSalary();
            System.out.println("yearly salary of emp 1: "+employee1.calculateSalary(salary1));

            employee2.setSalary(10000);
            double salary2 = employee2.getSalary();
            System.out.println("yearly salary of emp 2: "+ employee2.calculateSalary(salary2));

            employee3.setSalary(12000);
            double salary3 = employee3.getSalary();
            System.out.println("yearly salary of emp 3: "+employee3.calculateSalary(salary3));

            employee4.setSalary(14000);
            double salary4 = employee4.getSalary();
            System.out.println("yearly salary of emp 4: "+employee4.calculateSalary(salary4));

        employee1.setPerformance(5);
        double bonus101 = employee1.calculateEmployeeBonus(employee1.getSalary(), employee1.getPerformance());
        employee2.setPerformance(4);
        double bonus102 = employee2.calculateEmployeeBonus(employee2.getSalary(), employee2.getPerformance());
        employee3.setPerformance(3);
        double bonus103 = employee3.calculateEmployeeBonus(employee3.getSalary(), employee3.getPerformance());
        employee4.setPerformance(2);
        double bonus104 = employee4.calculateEmployeeBonus(employee4.getSalary(), employee4.getPerformance());
        employee4.setPerformance(1);


        EmployeeInfo.calculateEmployeePension((int) employee1.getSalary());

        Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
        List<Object> employeeRecord101 = new ArrayList<Object>();
        employeeRecord101.add(employee1.employeeName());
        employeeRecord101.add(employee1.calculateSalary(employee1.getSalary()));
        employeeRecord101.add(bonus101);

        List<Object> employeeRecord102 = new ArrayList<Object>();
        employeeRecord102.add(employee2.employeeName());
        employeeRecord102.add(employee2.calculateSalary(employee2.getSalary()));
        employeeRecord102.add(bonus102);

        employeeInfo.put(101, employeeRecord101);
        employeeInfo.put(102, employeeRecord102);








    }

}
