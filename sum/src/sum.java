import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tell me a number to add");
        int num1 = sc.nextInt();
        System.out.println("tell me another number");
        int num2 = sc.nextInt();
        System.out.println("the sum of the number "+ num1+ "with the number" + num2 +" is equal to "+(num1+num2));
    }
}
