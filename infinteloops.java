/*1.Imagine you‟re on a quest to discover never-ending loops. Create a program that 
demonstrates two types of endless journeys: one using a for loop and another using a 
while loop. How will you set up these loops to keep running forever, showcasing their 
infinite nature?*/
import java.util.Scanner;
public class infinteloops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a loop name to check infinity nature in lower case");
        String a = input.nextLine();
        if(a=="while")//while infine natue
        {
            while (true)
            {
                System.out.println("infinite while loop");
            }
        }
        else
        {
            for (;;)//for infinite nature
            {
                System.out.println("infinite for loop");
            }
        }
    }
}


