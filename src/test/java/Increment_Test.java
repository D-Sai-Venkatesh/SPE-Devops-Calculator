import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Increment_Test {
    @BeforeClass
    public static void before_test() {
        System.out.println("===============================================");

        System.out.println("starting increment test");
        System.out.println("===============================================");
    }


    @Test
    public void positive_float() {
        Calculator mycalc = new Calculator();
        System.out.println("test 1) incrementing 4");
        assertEquals("increment 4 not working correctly",5,mycalc.increment(4),0.00001);
    }

    @Test
    public void negative_float() {
        Calculator mycalc = new Calculator();
        System.out.println("test 2) incrementing -6");
        assertEquals("increment -6 not working correctly",-5,mycalc.increment(-6),0.00001);
    }

}
