package classes.rig;

public class Rig {
    private String truckBrand;
    private int trailerQuantity;
    
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

}