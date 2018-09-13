package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo employee5 = new EmployeeInfo("Mr R", 1010);
        employee5.setSalary(10000);
        employee5.setPerformance(6);
        Assert.assertEquals(10000.0,employee5.getSalary());
        Assert.assertEquals(6,employee5.getPerformance());
        Assert.assertEquals("Mr R",employee5.getEmployeeName());
        Assert.assertEquals(1010,employee5.getEmployeeId());
    }
}
