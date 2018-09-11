package math.problems;

import org.testng.Assert;
import org.testng.AssertJUnit;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Assert.assertEquals(120,Factorial.factorial(5));
        //Assert.assertEquals(Fibonacci.main(40));
        //Assert.assertEquals(4,FindLowestDifference.main());
        //Assert.assertEquals(9,FindMissingNumber.missingNumber());
        //Assert.assertEquals(5,LowestNumber.main());
    }
}
