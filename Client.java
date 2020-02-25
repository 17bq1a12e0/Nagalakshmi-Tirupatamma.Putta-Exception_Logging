package com.epam.Exception_Logging;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client extends Interest{
	public static void main(String args[]){
		final Logger LOGGER = LogManager.getLogger(Client.class);


		Scanner sc=new Scanner(System.in);
		LOGGER.info("Enter your choice\n1.Home Construction\n2.Simple Interest/Compound Interest\\n");
		int choice1=sc.nextInt();
		if(choice1==1) {
			   Costhome c=new Costhome();
				LOGGER.info("Enter the area of a home in a square feet");
				int area=sc.nextInt();
				LOGGER.info("\nSelect a Material Standard:");
				LOGGER.info("1.1200 INR--- Standard Materials\n2.1500 INR--- Above Standard Materials\n3.1800 INR--- High Standard Material\n4.2500 INR--- High Standard Material+Fully Automated Home");
				int choice=sc.nextInt();
				if(choice==1) {
					LOGGER.info("\nConstruction with Standard Materials is"+c.home_construct(1200,area));
				}
				if(choice==2) {

					LOGGER.info("\nConstruction with above Standard Materials is"+c.home_construct(1500,area));
				}
				if(choice==3) {

					LOGGER.info("\nConstruction high Standard Materials is"+c.home_construct(1800,area));
				}
				if(choice==4) {

					LOGGER.info("\nConstruction with fully automated home and high standard material is"+c.home_construct(2500,area));
				}
		}
		
		
		
	
		if(choice1==2) {
		while(true){
		 LOGGER.info("Enter principal amount\n");
		int p=sc.nextInt();
		 LOGGER.info("Enter time period\n");
		    int t=sc.nextInt();
		 LOGGER.info("Enter rate of interest\n");
	    float r=sc.nextFloat();
	    LOGGER.info("Enter n\n");
	    int n=sc.nextInt();
	    LOGGER.info("Enter your choice\n1.Simple Interest\n2.Compound Interest\n");
	    int ch=sc.nextInt();
	    Interest K=new Interest();
	    if(ch==1) {
	    	LOGGER.info("Simple Interest:"+K.simple_interest(p,t,r));
	    }
	    if(ch==2) {
	    	LOGGER.info("Compound Interest:"+K.compound_interest(p,t,n,r));
	    		
	    }
	    LOGGER.info("\nIf you want to exit!Enter 0 Otherwise enter any number");
		 int cho= sc.nextInt();	
		 if(cho==0) {
			    LOGGER.info("exit with 0");
				break;
			}
		}
	}
}
}
