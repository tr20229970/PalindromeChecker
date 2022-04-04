import java.util.Stack;
import java.util.Scanner;

public class Main
{
    private static Stack<String> lineStack = new Stack<String>();

    public static void main(String[] args)
    {
        String input = "";
        Scanner reader = new Scanner(System.in);

        System.out.println("[------------------------------------]\n               Welcome to \n           Palindrome Checker\n[------------------------------------]");
        System.out.print(" Enter a String or Type [-1] to Quit \n Input? ");
        input = reader.nextLine();

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
    }

    private static boolean check(String input)
    {
        String temp = "";

        while(!lineStack.empty())
            temp += lineStack.pop();


        if(temp.equals(input))
            return true;

        return false;
    }
}
