package classes.field;
import java.util.Random;

public class Field{
    private int acres;
    private boolean injection;
    private boolean moist;
    private int fieldAmt;
    Random random = new Random();
    public Field(){
       
    }
    //field acres getters and setters
    public void setAcres(int acres){
        this.acres = acres;

    }
    public int getAcres(){
        return acres;

    }
    //field amount getters and setters
    public void setFieldAmt(int fieldAmt){
        this.fieldAmt = fieldAmt;
    }
    public int getFieldAmt(){
        return fieldAmt;
    }
    public void randomizeAcres(){
        setAcres(random.nextInt(40,150));
        System.out.println("Current Field: " + getAcres() + " acres\nFields to go " + (getFieldAmt()));
    }
    public void randomizeFieldAmt(){
        setFieldAmt(random.nextInt(1,6));

    }



}