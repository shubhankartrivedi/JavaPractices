import java.util.Scanner;

public class day6
{
    public static void main(String args[]) {
        // Learning about ASCII Codes!
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Character to Know its ASCII Code: ");
        char ch = in.next().charAt(0);
        int asc = (int)ch;
        System.out.println(asc);
        
    }
}