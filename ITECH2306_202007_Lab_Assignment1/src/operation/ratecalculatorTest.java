package operation;

import java.util.Scanner;
import java.util.Vector;
class propert
{
	int property_count=7;
	String property[]=new String[20];
	double civrates[]=new double[20];
	public propert()
	{
		property[0]="Residential";
		property[1]="Commercial";
		property[2]="Vacant Land";
		property[3]="Hospital";
		property[4]="Industrial";
		property[5]="School/Community";
		property[6]="Others";
		civrates[0]=0.39;
		civrates[1]=0.59;
		civrates[2]=0.20;
		civrates[3]=0.35;
		civrates[4]=0.59;
		civrates[5]=0.25;
		civrates[6]=0.30;
		
	}
	void add(String newproperty,double rate)
	{
		property[property_count]=newproperty;
		civrates[property_count]=rate;
		property_count++;
	}
	public void show()
	{
		int i;
		for(i=0;i<property_count;i++)
		{
			System.out.println(property[i]);
		}
		
	}
}
class ratepaye
{
	int countrecord=0;
	Scanner s=new Scanner(System.in);
	Vector v=new Vector();
	String ratepayername="";
	String postaladdress="";
	int postcode;
	String tno;
	boolean CorI;
	float itemcost=0;
	public ratepaye()
	{
		
	}
	public void input()
	{
	System.out.println("Enter Rate Payer Name");
	ratepayername=s.nextLine();
	System.out.println("Enter Postal Address");
	postaladdress=s.nextLine();
	System.out.println("Enter Rate Postcode");
	postcode=s.nextInt();
	System.out.println("Enter Telephone Number");
	tno=s.nextLine();
	s.nextLine();
	System.out.println("individual or public company(true/false)");
	CorI=s.nextBoolean();
	String total=ratepayername+","+postaladdress+","+postcode+","+tno+","+CorI;
	v.add(total);
	}
	void showall()
	{
		int i;
		for(i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
	}
}

public class ratecalculatorTest {
static int menu()
{
	System.out.println("1. Add a Rate Payer");
	System.out.println("2. Add a Property");
	System.out.println("3. Calculate a Property Type's Yearly Rates Total");
	System.out.println("0. Exit Program");
	System.out.println("Enter a selection (0-3):");
	Scanner s=new Scanner(System.in);
	int option=s.nextInt();
	return(option);
}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	
	ratepayer r=new ratepayer();
	property p=new property();
	while(true){
	System.out.println("Council Rate Payer System"); 
	System.out.println("=========================");
	System.out.println("What would you like to do?");
	int option=menu();
	if(option==1)
	{
		r.input();
	}
	else if(option==2)
	{
		
		String name="";
		double ra=0;
		System.out.println("Enter property Name");
		name=s.nextLine();
		s.nextLine();
		System.out.println("Enter rate");
		ra=s.nextDouble();
		p.add(name, ra);
	}
	else if(option ==3)
	{
		System.out.println("Council Rate Payer System");
		System.out.println("=========================");
		System.out.println("CalculatePropertyTypeRates");
		System.out.println("What type of property are we dealing with?");
		p.show();
		System.out.println("0. To exit");
		System.out.println("Enter a selection (0-7):");
		int opt=s.nextInt();
		System.out.println("What is the value of the property?");
		System.out.println("Enter a selection (100.00-50,000,000.00):");
		double rate=s.nextDouble();
		boolean check=false;
		System.out.println("Does the rate payer have a charity status?");
		System.out.println("Enter a selection - (true or false)false");
		check=s.nextBoolean();
		double tot=0;
		if(opt==1)
		{
			System.out.println("Details Selected: Property [description=Not Available, capitalImprovedValue="+rate);
			System.out.println("capitalImprovedRate="+p.civrates[0]+"]");
			System.out.println("Residential [");
			System.out.println("ServiceType [description=Waste Management][unit=1, rate=350.0]");
			System.out.println("ServiceType [description=Green Waste Management][unit=1, rate=75.0]");
			System.out.println("ServiceType [description=Fire Levy][base=110.0, percentage=6.0E-5, value="+rate+"] ]");
			tot= 1*350+ 75 + 110+ 0.006*rate;
			System.out.println("Total Rate Costs: $"+tot);
			
		}
		else if(opt==2)
		{
			System.out.println("Details Selected: Property [description=Not Available, capitalImprovedValue="+rate);
			System.out.println("capitalImprovedRate="+p.civrates[1]+"]");
			System.out.println("Commercial [");
			System.out.println("ServiceType [description=Waste Management][unit=2, rate=350.0]");
			System.out.println("ServiceType [description=Fire Levy][base=200.0, percentage=6.0E-5, value="+rate+"] ]");
			tot= 2*350+ 200+ 0.006*rate;
			System.out.println("Total Rate Costs: $"+tot);
			
		}
		else if(opt==3)
		{
			System.out.println("Details Selected: Property [description=Not Available, capitalImprovedValue="+rate);
			System.out.println("capitalImprovedRate="+p.civrates[1]+"]");
			System.out.println("Vacant [");
			System.out.println("ServiceType [description=Fire Levy][base=110.0, percentage=6.0E-5, value="+rate+"] ]");
			tot= 110+0.006*rate;
			System.out.println("Total Rate Costs: $"+tot);
			
		}
		else if(opt==4)
		{
			System.out.println("Details Selected: Property [description=Not Available, capitalImprovedValue="+rate);
			System.out.println("capitalImprovedRate="+p.civrates[1]+"]");
			System.out.println("Hospital [");
			System.out.println("ServiceType [description=Industrial Waste Management][unit=4, rate=500.0]");
			System.out.println("ServiceType [description=Fire Levy][base=200.0, percentage=6.0E-5, value="+rate+"] ]");
			tot= 4*500+ 200+ 0.006*rate;
			System.out.println("Total Rate Costs: $"+tot);
			
		}
		else if(opt==5)
		{
			System.out.println("Details Selected: Property [description=Not Available, capitalImprovedValue="+rate);
			System.out.println("capitalImprovedRate="+p.civrates[1]+"]");
			System.out.println("School/Community [");
			System.out.println("ServiceType [description=Industrial Waste Management][unit=2, rate=500.0]");
			System.out.println("Extra service [description=Extra Levy][$200 + ($60 for small or $80 for medium or $100 for large organisation category)] ]");
			System.out.println("ServiceType [description=Fire Levy][base=200.0, percentage=6.0E-5, value="+rate+"] ]");
			tot= 2*500+ 200+80+200+ 0.006*rate;
			System.out.println("Total Rate Costs: $"+tot);
			
		}
		else if(opt==6)
		{
			System.out.println("Details Selected: Property [description=Not Available, capitalImprovedValue="+rate);
			System.out.println("capitalImprovedRate="+p.civrates[1]+"]");
			System.out.println("Others [");
			System.out.println("ServiceType [description=Fire Levy][base=150.0, percentage=6.0E-5, value="+rate+"] ]");
			tot= 150+0.006*rate;
			System.out.println("Total Rate Costs: $"+tot);
			
		}
	
	}
	else if(option==0)
	{
		break;
	}
	
	
		
	}
}
}
