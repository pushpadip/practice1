package selenium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
			System.out.print("Enter a number:");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a =Integer.parseInt(br.readLine());
			System.out.println(a);
			if(a%2==1)
			{
				System.out.println("a is odd");
			}
			else 
			{
				System.out.println("a is even");
			}

	}

}
