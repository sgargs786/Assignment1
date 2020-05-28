package citycouncilratecalculator.src.citycouncilratecalculator;

import java.util.Scanner;
import java.util.Vector;
import java.io.FileNotFoundException;
import java.io.File;

class payer
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
	public payer()
	{
		
	}
	String fileName= "ITECH2306_2020_Load_RatePayers.csv";
    File file= new File(fileName);
	public void input()
	{
		
		try{
		Scanner inputStream= new Scanner(file);
        while(inputStream.hasNext()){
        String data= inputStream.next();
        v.add(data);
        }
        inputStream.close();	
	
		}
		catch(Exception e1)
		{
			
		}
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

public class fileratecalculatorTest {

	public static void main(String args[])
{
		Scanner s=new Scanner(System.in);
		ratepayer f=new ratepayer();
		System.out.println("Do you want to see all rate Payer details enter 1");
		int option=s.nextInt();
		if(option==1)
		{
		f.input();
		f.showall();
		}
	
}
}
