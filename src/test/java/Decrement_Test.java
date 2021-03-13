import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Decrement_Test {
    @BeforeClass
    public static void before_test() {
        System.out.println("===============================================");

        System.out.println("starting decrement test");
        System.out.println("===============================================");
    }


    @Test
    public void positive_float() {
        Calculator mycalc = new Calculator();
        System.out.println("test 1) decrement +ve");
        assertEquals("decrement 4 not working correctly",5,mycalc.decrement(6),0.00001);
    }

    @Test
    public void negative_float() {
        Calculator mycalc = new Calculator();
        System.out.println("test 2) decrementing -ve");
        assertEquals("decrement -4 not working correctly",-5,mycalc.decrement(-4),0.00001);
    }

}
