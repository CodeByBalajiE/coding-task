import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        while (true){
            Scanner input=new Scanner(System.in);
            System.out.println("ENTER THE OPERATION YOU WANT TO PERFORM:");
            String str=input.next();
            if(str.equals("exit"))break;
            switch (str){
                //checking the case of which operation we want
                case "+":
                    System.out.println("enter the first num");
                    int a=input.nextInt();
                    System.out.println("enter the second element");
                    int b=input.nextInt();
                    int c=a+b;
                    System.out.println("The addition of two num is"+c);
                    break;
                case "-":
                    System.out.println("enter the first num");
                    a=input.nextInt();
                    System.out.println("enter the second element");
                    b=input.nextInt();
                    c=a-b;
                    System.out.println("The subtraction of two num is"+c);
                    break;
                case "*":
                    System.out.println("enter the first num");
                    a=input.nextInt();
                    System.out.println("enter the second element");
                    b=input.nextInt();
                    c=a*b;
                    System.out.println("The multiplication of two num is"+c);
                    break;
                case "/":
                    System.out.println("enter the first num");
                    a=input.nextInt();
                    System.out.println("enter the second element");
                    b=input.nextInt();
                    c=a/b;
                    System.out.println("The division of two num is"+c);
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("invalid");
            }
        }
    }
}
