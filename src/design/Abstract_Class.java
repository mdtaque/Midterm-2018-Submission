package design;

public abstract class Abstract_Class implements Employee {

    public final String empName = "Md Taque";
    static String address = "Bronx, NY";

    public void empInfo(){
        System.out.println("the employee name is "+empName+" & he lives in "+address);
    }
    public abstract void empInfo (int DOB);

    public void empInfo(String maritalStatus){
        System.out.println("Md Taque is "+maritalStatus);
    }

}
