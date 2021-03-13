import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Math;
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

    public float square_root(float x){
        if(x < 0){
            logger.error("square root function is given -ve number");
            return -1f;
        }
        double temp = Math.sqrt(x);
        logger.info("[SQRT] - " + x);
        logger.info("[RESULT - SQRT] - " + temp);
        return (float) temp;
    }

    public int factorial(int x){
        if(x < 0){
            logger.error("factorial function does not work with -ve number");
            return -1;
        }
        int ans = 1;
        for(int i = 1; i <= x; i++){
            ans = ans * i;
        }
        logger.info("[FACTORIAL] - " + x);
        logger.info("[RESULT - FACTORIAL] - " + ans);
        return ans;
    }

    public float nat_log(float x){
        if(x < 0){
            logger.error("natural log function does not work with -ve number");
            return -1;
        }
        float temp = (float) Math.log(x);
        logger.info("[LOG] - " + x);
        logger.info("[RESULT - LOG] - " + temp);
        return temp;
    }

    public float power(float x, float y){
        float temp = (float) Math.pow(x,y);
        logger.info("[POWER] - " + x + ", " + y);
        logger.info("[RESULT - POWER] - " + temp);
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
            case(5):
                ans = square_root(x);
                break;
            case(6):
                ans = factorial((int) x);
                break;
            case(7):
                ans = nat_log(x);
                break;
            case(8):
                ans = power(x,y);
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
                    "5. Square Root  \n"+
                    "6. Factorial  \n"+
                    "7. Natural Log  \n"+
                    "8. Power  \n"+
                    "Enter your choice : ");

            int op = scan.nextInt();
            float x = 0;
            float y = 0;

            if (op == 1 || op == 3 || op == 5 || op == 6 || op == 7 ){
                System.out.print("Enter operand x: ");
                x = scan.nextFloat();
            }
            else if (op == 2 || op == 4 || op == 8 ){
                System.out.print("Enter operands x y: ");
                x = scan.nextFloat();
                y = scan.nextFloat();
            }

            Calculator mycalc = new Calculator();
            System.out.println("Your Answer: " +  mycalc.evaluate(op, x, y));

    }
}
