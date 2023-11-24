package Calculator;

import java.util.Scanner;

public class readUserInput 
{
	public void userInput() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Trevor's Calculator (A java application)");
		System.out.println("---------------------------------------------------");
		System.out.println("Enter an equation: ");
		
		String operator = scan.nextLine();
        char o = operator.charAt(0);
	//	scan.useDelimiter(" ");
		while (scan.hasNextLine())
		{
			if (o == '+')
			{
				System.out.println(additionButton());
			}
		}
		
		scan.close();
	}
	
	public int additionButton()
	{
		int leftNum = 0;
		int rightNum = 0;
		int results;
		results = leftNum + rightNum;
		return results;
	}
	
}
