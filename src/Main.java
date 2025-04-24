import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("yoo");

        Double num1;
        Double num2;
        char operator;
        Double result = 0.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first num: ");
        num1 = scanner.nextDouble();


        System.out.println("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);


        System.out.println("Enter first num2: ");
        num2 = scanner.nextDouble();



        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Invalid operator.");
                return;
            }
        }

        System.out.println("The results is: " + result);

        scanner.close();
    }
}