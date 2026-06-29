import classes.farm.Farm;
import classes.rig.Rig;
import classes.route.Route;
import classes.field.Field;
import java.util.Random;

public class Main {
    public static void main(String[] args) { 
        String[] truckBrands = {"Western Star", "Freightliner"};
        int[] truckQuantity = {7500, 8900, 10500};
        Random random = new Random();
        Field myField = new Field();
        Rig rig = new Rig();
        
        myField.setAcres(random.nextInt(40,150));
        rig.setBrand(truckBrands[random.nextInt(truckBrands.length)]);
        rig.setQuantity(truckQuantity[random.nextInt(truckQuantity.length)]);
        System.out.println("Field for the day: " + myField.getAcres() + " acres");
        System.out.println("Assigned rig:\n Truck, " + rig.getBrand() + "\n Trailer, " + rig.getQuantity() + " gallons");

	 }
}
