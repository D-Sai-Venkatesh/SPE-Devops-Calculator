import org.junit.*;

import static org.junit.Assert.*;

public class Addition_Test {

    @BeforeClass
    public static void before_Addition_test() {
        System.out.println("starting addition test");
    }
    @Before
    public void beforeEmailTest(){
        System.out.println("Before Email Testing");
    }

    @Test
    public void positive_and_positive_int() {
        Calculator mycalc = new Calculator();
        System.out.println("test 1) Adding +ve and +ve integer numbers");
        assertEquals("addition of 3.5 and 1.5 is not working correctly",5,mycalc.add(3.5f, 1.5f),0.00001);
    }

    @Test
    public void positive_and_negative_int() {
        Calculator mycalc = new Calculator();
        System.out.println("test 2) Adding +ve and -ve integer numbers");
        assertEquals("addition of 6.5 and -1.5 is not working correctly",5,mycalc.add(6.5f, -1.5f),0.00001);
    }

    @Test
    public void negative_and_negative_int() {
        Calculator mycalc = new Calculator();
        System.out.println("test 3) Adding -ve and -ve integer numbers");
        assertEquals("addition of -6.5 and -1.5 is not working correctly",-8,mycalc.add(-6.5f, -1.5f),0.00001);
    }

    @After
    public void afterEmailTest(){
        System.out.println("After Email Testing");
    }

    @AfterClass
    public static void afterEmailClass(){
        System.out.println("After Email Class Testing");
    }
}
