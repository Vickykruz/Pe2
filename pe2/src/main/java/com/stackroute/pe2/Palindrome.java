package com.stackroute.pe2;

public class Palindrome {
	public int palinTest(int num)
	{  
		   int r,sum=0,temp;  
		  
		  temp=num;    
		  while(num>0){    
		   r=num%10;   
		   sum=(num*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   return temp;    
		  else    
		   return num;
		}
	
		}  

