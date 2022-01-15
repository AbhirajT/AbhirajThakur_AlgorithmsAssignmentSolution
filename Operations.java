package com.greatlearning.AlgorithmsAssignmentSolution;

public class Operations extends Driver{
	
	public double[] company;
	public int number;


	
	
	public void display(double[] company,int number)
	{
		System.out.println("Array is :");
		for (int i=0;i<number;i++)
		{
			System.out.println(company[i]);
		}
	}

	public void Displayascending(double[] company,int number)
	{
		double temp =0;
		if(number != 1 && number != 0)
		{
		for (int i=0;i<number;i++)
		{
			for (int j=1;j<number;j++)
			{
				if(company[j]<company[j-1])
				{
					temp = company[j-1];
					company[j-1]=company[j];
					company[j]=temp;
				}
			}
		}
		}
		
	display(company, number);
	
		
	}
	
	public void Displaydescending(double[] company,int number)
	{
		double temp =0;
		if(number != 1 && number != 0)
		{
		for (int i=0;i<number;i++)
		{
			for (int j=1;j<number;j++)
			{
				if(company[j]>company[j-1])
				{
					temp = company[j-1];
					company[j-1]=company[j];
					company[j]=temp;
				}
			}
		}
		}
		display(company, number);
	
		
	}


	public void StockRise(double[] company, int number) {
		double max=0;
		int count=0;
		if(number ==1)
		{
			System.out.println("Total no. of companies for which stockpice rose is :" +number);
		}
		
		else
		{
			for (int j=1;j<number;j++)
			{
				max=company[0];
				if(company[j]>max)
					count ++;
				
			}
			System.out.println("total no of companies for which stock prices rose today is :"+ count);
		}
		
	}
	
	public void StockDec(double[] company, int number) {
		double max=0;
		int count=0;
		if(number ==1)
		{
			System.out.println("Total no. of companies for which stockpice rose is :" +number);
		}
		
		else
		{
			for (int j=1;j<number;j++)
			{
				max=company[0];
				if(company[j]>max)
					count ++;
				
			}
			System.out.println("total no of companies for which stock prices declined today is :"+ count);
		}
		
	}

	public void Stocksearch(double[] company, int number,double stock) {
		for (int i=0;i<number;i++)
		{
			if(company[i]%stock==0)
			{
				System.out.println("Stock value of "+ stock+ "is present ");
			}
		}
		// TODO Auto-generated method stub
		
	}

	
	
}
