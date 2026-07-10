import classes.farm.Farm;
import classes.rig.Rig;
import classes.route.Route;
import classes.field.Field;
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

        Field myField = new Field();
        Rig rig = new Rig();
        Route route = new Route();

        myField.displayFields(myField.getAllFields());
        rig.randomizeRig();
	 }
}
