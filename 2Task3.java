import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static boolean isHigh;
    static boolean isLow;
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		Double temp = input.nextDouble(); 
		isHigh = temp > 37.2;
		isLow = temp < 36.5;
		if(isLow)
		    System.out.println("low temperature");
		else if(isHigh)
            System.out.println("high temperature");
        else
            System.out.println("norm");

	}
}
