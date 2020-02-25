package com.epam.Exception_Logging;

public class Interest {
	
	float simple_interest(float princpal_amount,int years,float rate_of_interest)
	{
		return (princpal_amount*years*rate_of_interest)/100;
	}
	float compound_interest(float principal_amount,int times_to_calculate,int years,float rate_of_interest)
	{
		return principal_amount*power((1+(rate_of_interest/times_to_calculate)),times_to_calculate*years)	;
	}
	float power(float n,int p)
	{
		float a=1;
		for(int i=0;i<p;i++)
		{
			a=a*n;
		}
		return a;
	}
}

	

