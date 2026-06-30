package classes.rig;
import java.util.Random;

public class Rig {
    private String truckBrand;
    private int trailerQuantity;
    Random random = new Random();

    public Rig(){


    }
    //setter and getters for truck brand
    public void setBrand(String truckBrand){
        this.truckBrand = truckBrand;
    }
    public String getBrand(){
        return truckBrand;
    }
    //setter and getters for truck quantity
    public void setQuantity(int trailerQuantity){
        this.trailerQuantity = trailerQuantity;
    }
    public int getQuantity(){
        return trailerQuantity;
    }
    public void randomizeRig(){
        int[] truckQuantity = {7500, 8900, 10500};
        String[] truckBrands = {"Western Star", "Freightliner"};
        setBrand(truckBrands[random.nextInt(truckBrands.length)]);
        setQuantity(truckQuantity[random.nextInt(truckQuantity.length)]);
        System.out.println("Assigned rig:\n Truck, " + getBrand() + "\n Trailer, " + getQuantity() + " gallons");
    }

}