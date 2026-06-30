import classes.farm.Farm;
import classes.rig.Rig;
import classes.route.Route;
import classes.field.Field;
import java.util.Random;

public class Main {
    public static void main(String[] args) { 
                
        Random random = new Random();
        Field myField = new Field();
        Rig rig = new Rig();
        
        myField.randomizeAcres();
        rig.randomizeRig();
	 }
}
