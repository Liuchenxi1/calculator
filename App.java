import java.util.Scanner;

public class App {

    static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt) {
        System.out.print(prompt);
        String retrieve = inputScanner.nextLine();
        return retrieve;
    }
    
    private static double getDouble(String prompt) {
        System.out.print(prompt);
        double retrieve = inputScanner.nextDouble();
        inputScanner.nextLine();
        return retrieve;
        
    }
    public static void main(String[] args) {
        boolean continueCalculations = true;

        while(true){ 
            System.out.println("\nwhat you like to do?\n add\n substract\n multiply\n divide\n exit\n");
            String choice = getString("Enter: ");

            if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Ending the program");
                System.exit(0);
                break;
            }

            double num1 = getDouble("Enter the #1 number: ");
            double num2 = getDouble("Enter the #2 number: ");

            double result = 0;

            if (choice.equalsIgnoreCase("add")) {
                result = Calculator.add(num1, num2);
                 
            } 
            else if (choice.equalsIgnoreCase("substract")) {
                result = Calculator.substract(num1, num2); 
                
            } 
            else if (choice.equalsIgnoreCase("multiply")) {
                result = Calculator.multiply(num1, num2); 
                
            } else if (choice.equalsIgnoreCase("divide")) {
                if (num2 != 0) {
                    result = Calculator.divide(num1, num2); 
                } else {
                    System.out.println("Cannot divide by zero.");
                }
            } 
            else {
                System.out.println("Please enter a valid option.");
            }

            System.out.println("Result is: " + result);

                String continueChoice = getString("Do you want to continue: yes or no? ");
                if (!continueChoice.equalsIgnoreCase("yes")) {
                    System.out.println("Goodbye");
                    continueCalculations = false;
                    break;
                }
            }
        }
    }


