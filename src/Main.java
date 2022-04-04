
    /*
    [-----------------------------------------------------]
    | @P-Name Palindrome Checker                          |
    | @File Main.java                @By Tyler Romanowski |
    | @Created  3.30.22              @Last 4.4.22         |
    | @Comment -  The Purpose of this program is to check |
    | to see if a string reversed is the same as the      |
    | original string. This program request user input,   |
    | and the present the status of the String whether    |
    | it is a Palindrome, or not                          |
    [-----------------------------------------------------]
     */

import java.util.Stack;
import java.util.Scanner;

public class Main
{
    private static final Stack<String> lineStack = new Stack<>();

    public static void main(String[] args)
    {
        String input;
        Scanner reader = new Scanner(System.in);


        // Greeting
        System.out.println("[------------------------------------]\n              Welcome to \n          Palindrome Checker\n[------------------------------------]");
        System.out.print(" Enter a String or Type [-1] to Quit \n Input? ");
        input = reader.nextLine();


        // Checks to see if Empty String is Imported
        while(input.trim().isEmpty())
        {
            System.out.print("INFO : Invalid Input \n Enter a String or Type [-1] to Quit \n Input? ");
            input = reader.nextLine();
        }


        // Run Loop again until -1, is entered
        while(!(input.equals("-1")))
        {
            for (int i = 0; i < input.length(); i++)
                lineStack.push(input.substring(i, i + 1));

            if (check(input))
                System.out.println("That String is a valid Palindrome!    ✅");
            else
                System.out.println("That String is a invalid Palindrome!  ❌");

            System.out.print(" Input? ");
            input = reader.nextLine();
        }


        // Exit
        System.out.println("\n Thanks for using Palindrome Checker, have a great day!");
    }

    /*
    [----------------------------------------]
    | @Method check                          |
    | @Args String Input                     |
    | @Post - Returns boolean                |
    | @Comment - Returns true if the reverse |
    |String is the same as the original      |
    |string else false                       |
    [----------------------------------------]
     */
    private static boolean check(String input)
    {
        String temp = "";

        while(!lineStack.empty())
            temp = temp.concat(lineStack.pop());


        return temp.equalsIgnoreCase(input);
    }
}
