package com.greatlearning.AlgorithmsAssignmentSolution;
import java.util.Scanner;

public class Driver {
	static int number;
	static double[] company;
	static double stock;

	public static void main(String[] args) {
		
		Operations operations =new Operations();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of companies :");
		 number =sc.nextInt();
		 company =new double[number];
		 boolean result =false;
		
		int c=0;
		for (int i=0;i<number;i++)
		{
			++c;
			System.out.println("Enter the stocprice of company:"+c);
			company[i] =sc.nextDouble();
			if(number ==1)
			{
				System.out.println("Whether company's stock price rose today compare to yesterday?");
				System.out.println(true);
				break;
			}
			
			else 
			{
				
					if (i==0)
					{
						System.out.println("Whether company's stock price rose today compare to yesterday?");
						System.out.println(result);
					}
					else
					{
						if(company[i-1]<company[i])
						{
							result =true;
							System.out.println("Whether company's stock price rose today compare to yesterday?");
							System.out.println(result);
						}
						else
						{
							System.out.println("Whether company's stock price rose today compare to yesterday?");
							System.out.println(false);
						}
					}
				}
			}
			
			
		
		
		int exit =0;
		
		
		
		do
		{
			System.out.println("Select the operation you want to perform:");
			System.out.println("1. Display the companies stock prices in ascending order\r\n"
					+ "2. Display the companies stock prices in descending order\r\n"
					+ "3. Display the total no of companies for which stock prices rose today\r\n"
					+ "4. Display the total no of companies for which stock prices declined today\r\n"
					+ "5. Search a specific stock price //it will only display whether the stock price is present or not.\r\n"
					+ "6. You have exited succesfully");
			int choice =sc.nextInt();
			
			
			if(choice ==1)
			{
				operations.Displayascending(company,number);
				
			}
			else if (choice ==2)
			{
				operations.Displaydescending(company,number);
			}
			else if(choice ==3)
			{
				operations.StockRise(company,number);
			}
			else if(choice ==4)
			{
				operations.StockDec(company,number);
			}
			else if(choice ==5)
			{
				System.out.println("Select the stock price you want to search:");
				stock=sc.nextDouble();
				operations.Stocksearch(company,number,stock);
			}
			else if(choice ==6)
			{
				exit =1;
				System.out.println("You have exited successfully");
			}
				
			
			else 
				System.out.println("invalid option please select from the below :");
		}while (exit ==0);
		

	}

}
