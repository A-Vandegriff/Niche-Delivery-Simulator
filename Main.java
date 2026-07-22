import classes.farm.Farm;
import classes.rig.Rig;
import classes.route.Route;
import classes.field.Field;
import classes.location.Location;
import java.util.Scanner;
/*
STUFF NEEDED TO FULLY CALCULATE THE TIME OF A JOB

taking the amount of acres to do between all the fields
the gallons the trailer can hold, amount of trailers
whether the farm is using a spreader or frac tank (consistent flow or not)
how the route could impact the flow if multiple trucks

*/
//work on route, come up with real life situations and ideas that can predict a route 
//even with stop signs and traffic, maybe use time of the day for busyness etc. 

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){

            Field field = new Field();
            Rig rig = new Rig();
            Farm farm = createFarm(scanner);
            farm.display();
            rig.randomizeRig();
        }




	 }
    public static Location createLocation(Scanner scanner) {
        System.out.print("Enter latitude: ");
        double latitude = scanner.nextDouble();

        System.out.print("Enter longitude: ");
        double longitude = scanner.nextDouble();

        return new Location(latitude, longitude);
    }
    public static Farm createFarm(Scanner scanner){
        System.out.println("Enter Farm name: ");
        String farmName = scanner.nextLine();
        Location location = createLocation(scanner);
        return new Farm(farmName, location);
    }
}
