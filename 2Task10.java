import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int start, end, multiple;
		int sum = 0;
		start = input.nextInt();
		end = input.nextInt();
		multiple = input.nextInt();
		for(int i = start; i < end; i++){
		    if(i%multiple!=0)
		        continue;
		    sum+=i;
		}
		System.out.println(sum);
	}
}
