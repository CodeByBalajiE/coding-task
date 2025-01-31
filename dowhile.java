/*.You‟re tasked with creating a simple calculator using a while loop and a switch 
statement. Your program should repeatedly prompt the user to choose an arithmetic 
operation (like addition, subtraction, multiplication, or division) and then perform the 
selected operation based on user input. How will you set up your while loop and 
switch case to keep the calculator running until the user decides to exit*/
import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
       
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("ENTER THE OPERATION YOU WANT TO PERFORM:");
            String str = input.next();
            if (str.equals("exit")) break;
            switch (str) {
                //check case which operation operation you want

                case "+":
                    System.out.println("enter the first num");
                    int a = input.nextInt();
                    System.out.println("enter the second element");
                    int b = input.nextInt();
                    int c = a + b;
                    System.out.println("The addition of two num is" + c);
                    break;
                case "-":
                    System.out.println("enter the first num");
                    a = input.nextInt();
                    System.out.println("enter the second element");
                    b = input.nextInt();
                    c = a - b;
                    System.out.println("The subtraction of two num is" + c);
                    break;
                case "*":
                    System.out.println("enter the first num");
                    a = input.nextInt();
                    System.out.println("enter the second element");
                    b = input.nextInt();
                    c = a * b;
                    System.out.println("The multiplication of two num is" + c);
                    break;
                case "/":
                    System.out.println("enter the first num");
                    a = input.nextInt();
                    System.out.println("enter the second element");
                    b = input.nextInt();
                    c = a / b;
                    System.out.println("The division of two num is" + c);
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("invalid");
            }
        }while (true);
    }
}
