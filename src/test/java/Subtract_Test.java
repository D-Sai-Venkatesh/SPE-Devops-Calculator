import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Subtract_Test {
    @BeforeClass
    public static void before_Addition_test() {
        System.out.println("===============================================");

        System.out.println("starting subtract test");
        System.out.println("===============================================");
    }


    @Test
    public void positive_and_positive() {
        Calculator mycalc = new Calculator();
        System.out.println("test 1) Subtract +ve and +ve integer numbers");
        assertEquals("subtract of 5.5 and 0.5 is not working correctly",5,mycalc.subtract(5.5f, 0.5f),0.00001);
    }

    @Test
    public void positive_and_negative() {
        Calculator mycalc = new Calculator();
        System.out.println("test 2) subtract +ve and -ve integer numbers");
        assertEquals("subtract of 4.5 and -0.5 is not working correctly",5,mycalc.subtract(4.5f, -0.5f),0.00001);
    }

    @Test
    public void negative_and_negative() {
        Calculator mycalc = new Calculator();
        System.out.println("test 3) subtract -ve and -ve integer numbers");
        assertEquals("subtract of -9.5 and -1.5 is not working correctly",-8,mycalc.subtract(-9.5f, -1.5f),0.00001);
    }

}
