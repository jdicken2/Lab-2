package Julian;
import Julian.Dickens.VehicleEngine;
import Julian.Dickens.VehicleTypes;
import Julian.Dickens.Vehicle;
import Julian.Dickens.Iggy.ArrayOfVehicles;
import java.io.*;
import java.util.*;
public class AnotherVehicleClient
{
	public static void main (String [] args)
	{
		ArrayOfVehicles car1=new ArrayOfVehicles();
		Vehicle [] unsortedVehicleArray=car1.arrayV();
	
		for(int h=0;h<=unsortedVehicleArray.length-1;h++)
		{
			System.out.println(unsortedVehicleArray[h].toString());
		}
		
		for(int i=0;i<=unsortedVehicleArray.length-1;i++)
		{
			double initial=(double)i;
			unsortedVehicleArray[i].calculateVelocity(initial);
			unsortedVehicleArray[i].calculateDistance(initial,initial);
			
			if(i==0||i==7||i==14)
			{
				unsortedVehicleArray[i].setVehicleTypes(VehicleTypes.FOURDOORSEDAN);	
			}
			else if(i==1||i==8||i==15)
			{
				unsortedVehicleArray[i].setVehicleTypes(VehicleTypes.TWODOORSEDAN);				
			}
			else if(i==2||i==9||i==16)
			{
				unsortedVehicleArray[i].setVehicleTypes(VehicleTypes.TRUCK);
			}
			else if(i==3||i==10||i==17)
			{
				unsortedVehicleArray[i].setVehicleTypes(VehicleTypes.SUV);
			}
			else if(i==4||i==11||i==18)
			{
				unsortedVehicleArray[i].setVehicleTypes(VehicleTypes.SPORT);
			}
			else if(i==5||i==12||i==19)
			{
				unsortedVehicleArray[i].setVehicleTypes(VehicleTypes.VAN);
			}
			else if(i==6||i==13||i==20)
			{
				unsortedVehicleArray[i].setVehicleTypes(VehicleTypes.MINIVAN);
			}
			
		}
		
		
		for(int k=0;k<=unsortedVehicleArray.length-1;k++)
		{
			System.out.println(unsortedVehicleArray[k].toString());
		}
		Vehicle sortedVehicleArray[]=car1.selectionSort(unsortedVehicleArray);
		for(int l=0;l<=sortedVehicleArray.length-1;l++)
		{
			System.out.println(sortedVehicleArray[l].toString());
		}
	}	
}