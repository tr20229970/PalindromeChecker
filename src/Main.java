import java.util.Stack;
import java.util.Scanner;

public class Main
{
    private static Stack<String> lineStack = new Stack<String>();

    public static void main(String[] args)
    {
        String input = "";
        Scanner reader = new Scanner(System.in);


        System.out.print("Enter a Input?");
        input = reader.nextLine();

        for(int i = 0; i < input.length(); i++)
        {
            lineStack.push(input.substring(i, i + 1));
        }

        if(check(input))
            System.out.println("That String is a Palindrome!");
        else
            System.out.println("That String is not a Palindrome!");
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
