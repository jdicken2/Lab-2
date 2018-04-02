//package folder1.folder2;
package Julian.Dickens;
import java.text.*;
public class Vehicle
{
	VehicleEngine ve=null;
	VehicleTypes vt=null;
	double acceleration=0.0;
	int time=0;
	String owner_name=" ";
	double velocity=0.0;
	double distance=0.0;
	static int vehicleID=0;
	int currentID=0;
	
	public Vehicle()
	{
		ve=null;
		vt=null;
		acceleration=0.0;
		time=0;
		owner_name="none";
		velocity=0.0;
		distance=0.0;
		vehicleID++;
		currentID=vehicleID;
	}
	
	public Vehicle(double ac, int ti, String na, VehicleEngine veh)
	{
		acceleration=ac;
		time=ti;
		owner_name=na;
		ve=veh;
		vt=null;
		velocity=0.0;
		distance=0.0;
		vehicleID++;
		currentID=vehicleID;
	}
	
	public VehicleEngine getVehicleEngine()
	{
		return ve;
	}
	
	public VehicleTypes getVehicleTypes()
	{
		return vt;
	}
	
	public double getAcceleration()
	{
		return acceleration;
	}
	
	public int getTime()
	{
		return time;
	}
	
	public int getVehicleID()
	{
		return vehicleID;
	}
	
	public String getOwnerName()
	{
		return owner_name;
	}
	
	public double getVelocity()
	{
		return velocity;
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public int getCurrentID()
	{
		return currentID;
	}
	
	public void setVehicleEngine (VehicleEngine ven)
	{
		ve=ven;
	}
	
	public void setVehicleTypes (VehicleTypes vet)
	{
		vt=vet;
	}
	
	public void setAcceleration (double acc)
	{
		acceleration=acc;
	}

	public void setTime (int tim)
	{
		time=tim;
	}
	
	public void setOwnerName(String nam)
	{
		owner_name=nam;
	}
	
	public boolean equals(Vehicle vehi)
	{
		if((this.getVehicleTypes()==vehi.getVehicleTypes())&&(this.getVehicleEngine()==vehi.getVehicleEngine()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String output="The acceleration is:" + " " + acceleration + " " +
					  "The time is:" + " " + time + " " +
					  "The owner's name is:" + " " + owner_name + " " +
					  "The vehicle engine is:" + " " + ve + " " + 
					  "The vehicle types is:" + " " + vt + " " +
					  "The velocity is:" + " " + velocity + " " +
					  "The distance is:" + " " + distance + " " +
					  "The vehicle ID is:" + " " + vehicleID + " " +
					  "The currentID is:" + " " + currentID + " ";
		return output;
	}
	
	public void calculateVelocity (double initialVelocity)
	{
		double velocity=acceleration*time+initialVelocity;
		DecimalFormat df=new DecimalFormat("0.00");
		String stringVelocity=df.format(velocity);
		double doubleVelocity=Double.parseDouble(stringVelocity);
		velocity=doubleVelocity;
	}
	
	public void calculateDistance(double initialVelocity, double initialDistance)
	{
		double distance=(.5)*acceleration*Math.pow(time,2)+initialVelocity*time+initialDistance;
		DecimalFormat df1=new DecimalFormat("0.00");
		String stringDistance=df1.format(distance); 
		double doubleDistance=Double.parseDouble(stringDistance);
		distance=doubleDistance;
	}
	

}