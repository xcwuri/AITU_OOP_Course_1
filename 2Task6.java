import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		int sum = 0;
		while(!number.equalsIgnoreCase("ENTER")){
		    int numb = Integer.parseInt(number);
		    sum+=numb;
		    number = input.nextLine();
		}
		System.out.println(sum);
	}
}
