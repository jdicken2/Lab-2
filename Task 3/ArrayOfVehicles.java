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
	
	public Vehicle [] arrayV()
	{
		String line=" ";
		int size=0;
		Vehicle [] vehicleArray=null;
		VehicleEngine veng=null;
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
			int index=0;
			System.out.println("The file has"+" "+size+"lines");

			while(scan2.hasNextLine())
			{
				line=scan2.nextLine();
				StringTokenizer str=new StringTokenizer(line, ",");
				String sAcceleration=str.nextToken();
				double acceleration=Double.parseDouble(sAcceleration);
				String sTime=str.nextToken();
				int time=Integer.parseInt(sTime);
				String owner=str.nextToken();
				String sVeng=str.nextToken();
				veng=VehicleEngine.valueOf(sVeng);
				Vehicle car=new Vehicle(acceleration,time,owner,veng);
					
					
				car.calculateVelocity(0.0);
				car.calculateDistance(0.0,0.0);
					
				vehicleArray[index]=car;
				index++;
			}
		}
		catch(IOException ioe)
		{
			System.out.println("There was error when attempting to read the file.");
		}
		return vehicleArray;
		
	}
	
	public Vehicle [] selectionSort(Vehicle vArray[])
	{
		Vehicle temp;
		int subarraylength=0;
		for(int i=0;i<vArray.length-1;i++)
		{
			subarraylength=vArray.length-i;
			int index1=0;
			for(int j=1;j<subarraylength;j++)
			{
				if(vArray[j].getVelocity()>vArray[index1].getVelocity())
				{
					index1=j;
				}
			}
			temp=vArray[index1];
			vArray[index1]=vArray[vArray.length-i-1];
			vArray[vArray.length-i-1]=temp;
			}
			return vArray;
	}
}