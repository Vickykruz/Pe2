package com.stackroute.pe2;
public class Pe2
{
	public boolean reverse(int num) {
			int rem,temp,sum=0;
				temp=num;
				while(num>0)
				{
				rem=num%10;
				sum=(sum*10)+rem;
				num=num/10;
				}
				if(temp==sum)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
	
	
	
	public boolean power(int num) {
		if(num==0)
			return false;
		while(num!=1)
		{
			if(num%4!=0)
				return false;
			num=num/4;
		}
		return true;
		}

	
	
	
	public boolean even(int num) {
			if(num%2==0)
				return true;
			else
		return false;
		}
	
	
	
	
	public String intfact(int num)
	{
		int i,fact=1;
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		String s= "The factorial of "+num+" is "+fact;
		
		
		
		return s;
	}
	public String longFactorial(long num)
	{
		int i;
		long fact=1;
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		String s= "The factorial of "+num+" is "+fact;
		
		
		
		return s;	
	}
	
		 
	     	
	

		
		
		

		public String average(int num[])
		{
			int x=num.length,y=0;
			float avg;
			for(int i=0;i<x;i++) {
				y=y+num[i];
			}
			
			avg=y/x;
			avg=(float) (avg+0.50);
			String s= "The average is "+avg+0;
			return s;
		}
		public String min(int num[])
		{
			int min=num[0];
			int x=num.length;
			for(int i=1;i<x;i++)
			{
				if(num[i]<min)
				{
					min=num[i];
				}
			}
			String s= "The minimum is "+min;
			return s;
		}
		public String max(int num[])
		{
			int max=num[0];
			
			for(int i=1;i<num.length;i++)
			{
				if(num[i]>max)
				{
					max=num[i];
				}
			}
			String s= "The maximum is "+max;
			return s;
		}

	}