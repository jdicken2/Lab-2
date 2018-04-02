package Julian.Dickens.Iggy;
import Julian.Dickens.VehicleEngine;
import Julian.Dickens.VehicleTypes;
import Julian.Dickens.Vehicle;
import java.io.*;
import java.util.*;
public class ArrayOfVehicles
{
	public ArrayOfVehicles()
	{
	
	}
	
	//try
	//{
	public Vehicle [] arrayV()
	{
		Vehicle vehicleArray[]=null;
		int size=0;
		int index=0;
		try
		{
			File ifile=new File("Vehicles.txt");
			Scanner scan1=new Scanner(ifile);
			while(scan1.hasNextLine())
			{
				scan1.nextLine();
				size++;
			}
			vehicleArray=new Vehicle[size];
				
			Scanner scan2=new Scanner(ifile);
			while(scan2.hasNextLine())
			{
				String line=scan2.nextLine();
				StringTokenizer str=new StringTokenizer(line, ",");
				String sAcceleration=str.nextToken();
				double acceleration=Double.parseDouble(sAcceleration);
				String sTime=str.nextToken();
				int time=Integer.parseInt(sTime);
				String owner=str.nextToken();
				String sVeng=str.nextToken();
				VehicleEngine veng=VehicleEngine.valueOf(sVeng);
				/*Vehicle veng=null;	
				if(sVeng.equals("TwoPointFourLiters")
				{
				veng=VehicleEngine.TwoPointFourLiters;
				}
				else if(sVeng.equals("ThreePointFourLiters")
				{
					veng=VehicleEngine.ThreePointFiveLiters;
				}
				else if(sVeng.equals("FivePointZeroLiters")
				{
					veng=VehcleEngine.FivePointZeroLiters;
				}
				else if(sVeng.equals("SixPointZeroLiters")
				{
					veng=VehicleEngine.SixPointZeroLiters;
				}
				*/
				Vehicle car=new Vehicle(acceleration,time,owner,veng);
				car.calculateVelocity(0.0);
				car.calculateDistance(0.0,0.0);
				vehicleArray[index]=car;
				index++;
			}
			
		}
		catch(IOException ioe)
		{
			System.out.println("There was error when attempting to read the file");
		}
		return vehicleArray;	
	}
	
	public Vehicle [] selectionSort(Vehicle vArray[])
	{
		for(int i=0;i<vArray.length-1;i++)
		{
			int subarraylength=vArray.length-i;
			int index1=0;
			for(int j=1;j<subarraylength;j++)
			{
				if(vArray[j].getVelocity()>vArray[index1].getVelocity())
				{
					index1=j;
				}
			}
		Vehicle temp=vArray[index1];
		vArray[index1]=vArray[vArray.length-i-1];
		vArray[vArray.length-i-1]=temp;
		}
		return vArray;
	}
		
	//}
	//catch (IOException ioe)
	//{
	//	System.out.println("There was an error when attempting to read the file");
	//}










}