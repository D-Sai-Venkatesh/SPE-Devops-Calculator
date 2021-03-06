import java.util.Scanner;

public class Calculator {

    float ans;
    float x, y;

    public float add(float x, float y){
        return x+y;
    }


    public float evaluate(int op, float x, float y){
        switch(op)
        {
            case(1):
                ans = add(x, 1);
                break;
            case(2):
                ans = add(x,y);
                break;
            default:
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
                "Enter your choice : ");

        int op = scan.nextInt();
        float x = 0;
        float y = 0;

        if (op == 1){
            System.out.print("Enter operand x: ");
            x = scan.nextFloat();
        }
        else if (op == 2){
            System.out.print("Enter operands x y: ");
            x = scan.nextFloat();
            y = scan.nextFloat();
        }

        Calculator mycalc = new Calculator();
        System.out.println("Your Answer: " +  mycalc.evaluate(op, x, y));
    }
}
