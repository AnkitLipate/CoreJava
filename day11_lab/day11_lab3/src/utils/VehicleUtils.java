package utils;

import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;

public class VehicleUtils {
 // add static method : for checking dup vehicle : base upoun reg no
	// it should throw custom exc, in case of dup vehicle
	//o.w ret reg no
	//use case : in Tester while adding a new vehicle
	public static int checkForDup(int regNo, Vehicle[] vehicles) throws VehicleHandlingException
	{
		//create a vehicle instance, having reg no inited 
		Vehicle newVehicle = new Vehicle(regNo);
		for(Vehicle v : vehicles)
			if(v !=null)
				if(v.equals(newVehicle))
					throw new VehicleHandlingException("Duplicate reg no found ..!!!");
		//=>no dup found
		return regNo;
	}
	
	//add static finder method : 
	//findByRegNo : i/p : regNo , o/p : vehicle ref, or cust exc : in case vehicle is not found 
	
	public static Vehicle findByRegNo(int regNo, Vehicle[] vehicles) throws VehicleHandlingException
	{
		//create vehicle instatnce. having reg no inited
		Vehicle existingVehicle = new Vehicle(regNo);
		for(Vehicle v : vehicles)
			if(v !=null)
				if(v.equals(existingVehicle))
					return v;
		//=>vehicle not found
		throw new VehicleHandlingException("Vehicle not found ....!!!!");
		
	}






}





