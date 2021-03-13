import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {

    float ans;
    float x, y;
    private static final Logger logger = LogManager.getLogger(Calculator.class);


    public float add(float x, float y){
        float temp = x + y;
        logger.info("[ADDITION] - " + x + ", " + y);
        logger.info("[RESULT - ADDITION] - " + temp);
        return temp;
    }

    public float increment(float x){
        float temp = x + 1;
        logger.info("[INCREMENT] - " + x);
        logger.info("[RESULT - INCREMENT] - " + temp);
        return temp;
    }

    public float subtract(float x, float y){
        float temp = x - y;
        logger.info("[SUBTRACT] - " + x + ", " + y);
        logger.info("[RESULT - SUBTRACT] - " + temp);
        return temp;
    }

    public float decrement(float x){
        float temp = x - 1;
        logger.info("[DECREMENT] - " + x);
        logger.info("[RESULT - DECREMENT] - " + temp);
        return temp;
    }

    public float evaluate(int op, float x, float y){
        switch(op)
        {
            case(1):
                ans = increment(x);
                break;
            case(2):
                ans = add(x,y);
                break;
            case(3):
                ans = decrement(x);
                break;
            case(4):
                ans = subtract(x,y);
                break;
            default:
                logger.error("wrong option selected");
                System.out.println("wrong option selected");
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


            System.out.print("Choose operation \n"+
                    "1. Increment \n"+
                    "2. Addition  \n"+
                    "3. Decrement  \n"+
                    "4. Subtract  \n"+
                    "Enter your choice : ");

            int op = scan.nextInt();
            float x = 0;
            float y = 0;

            if (op == 1 || op == 3){
                System.out.print("Enter operand x: ");
                x = scan.nextFloat();
            }
            else if (op == 2 || op == 4){
                System.out.print("Enter operands x y: ");
                x = scan.nextFloat();
                y = scan.nextFloat();
            }

            Calculator mycalc = new Calculator();
            System.out.println("Your Answer: " +  mycalc.evaluate(op, x, y));

    }
}
