import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an expression made up of parentheses:");

        String expression = scanner.nextLine();
        
        BalancedParentheses balance = new BalancedParentheses();
        balance.balancedParentheses(expression);

        scanner.close();
    }
}
