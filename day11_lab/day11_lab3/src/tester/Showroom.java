package tester;

import static com.app.vehicles.Vehicle.sdf;
import static utils.VehicleUtils.findByRegNo;
import static utils.VehicleUtils.checkForDup;
import java.util.Scanner;

import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init
			System.out.println("Enter the size of showroom");
			Vehicle[] showroom = new Vehicle[sc.nextInt()];// Vehicle[]: size
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("Options: 1.Add new Vehicle 2.Display All 3.Purchase Vehicle 10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:// 1.Add new Vehicle
						if (counter < showroom.length) {
							System.out.println(
									"Enter vehicle Details: regNo, color, price, category, manufactureDate(yr-mon-day)");
							Vehicle v = new Vehicle(checkForDup(sc.nextInt(), showroom), sc.next(), sc.nextDouble(),
									valueOf(sc.next().toUpperCase()), sdf.parse(sc.next()));
							// =>correct input
							showroom[counter++] = v;
							System.out.println("Vehicle added to showroom");
						} else
							throw new VehicleHandlingException("Showroom full....!!!!!");
						break;
					case 2:// 2.Display All
						System.out.println("Vehicle in  the showrrom");
						for (Vehicle v : showroom)
							if (v != null)
								System.out.println(v);
						break;
					case 3:// 3.Purchase Vehicle
						System.out.println("Enter RegNo ");
						Vehicle vehicle = findByRegNo(sc.nextInt(), showroom);
						// =>vehicle found : chk if it's already sold(either add a flag in vehicle class
						// :
						// sold or chk id del address is set
						if (vehicle.getAddress() != null)
							throw new VehicleHandlingException("vehicle already sold!!!!!");
						System.out.println("Enter delivery address:  city, state, country, zipCode");
						// can you directly create delivery address(inner class instatnce) ? NO
						vehicle.assignDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
						System.out.println("Assign delivery address, Vehicle ready for dispatch!");

						break;
					case 4:
						break;
					case 10:// 10.Exit
						exit = true;
						break;

					}
				} catch (Exception e) {
					// TODO: handle exception
				}

			} // End while

		} // end try with resources

	}

}
