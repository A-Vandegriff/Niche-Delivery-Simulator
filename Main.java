import classes.rig.Rig;
import classes.route.Route;
import classes.field.Field;
import classes.location.Location;
import java.util.Scanner;
/*
STUFF NEEDED TO FULLY CALCULATE THE TIME OF A JOB

taking the amount of acres to do between all the fields
the gallons the trailer can hold, amount of trailers
whether the farm is using a spreader or frac tank (consistant flow or not)
how the route could impact the flow if multiple trucks

*/
//work on route, come up with real life situations and ideas that can predict a route 
//even with stop signs and traffic, maybe use time of the day for busyness etc. 

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
            Location farmLocation = createLocation(scanner);

            Field field = new Field();
            Rig rig = new Rig();

            farmLocation.display();
            rig.randomizeRig();
        }




	 }
    public static Location createLocation(Scanner scanner) {
        System.out.print("Enter farm name: ");
        String locationName = scanner.nextLine();

        System.out.print("Enter latitude: ");
        double latitude = scanner.nextDouble();

        System.out.print("Enter longitude: ");
        double longitude = scanner.nextDouble();

        return new Location(locationName, latitude, longitude);
    }
}
