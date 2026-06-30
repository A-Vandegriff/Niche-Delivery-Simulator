package classes.field;
import java.util.Random;

public class Field{
    private int acres;
    private boolean injection;
    private boolean moist;
    private int fieldAmt = 0;;
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
    }
    public void displayCurrentField(){
        if(fieldAmt > 0){
        System.out.println("Current Field: " + getAcres() + " acres\nFields to go " + (getFieldAmt()));
        }else{
            System.out.print("ERROR no current field");
        }
    }
    public void randomizeFieldAmt(){
        setFieldAmt(random.nextInt(1,6));
    }
    //method for filling fieldsArr[][] with a pair (fieldNum,Acres)
    public int[][] getAllFields(){
            randomizeFieldAmt();
        int[][] arr = new int[2][getFieldAmt()];
            for(int i = 0; i < arr[0].length;i++){
                randomizeAcres();
                arr[0][i]= i+1;
                arr[1][i]= getAcres();
            }
            return arr;
    }
    public void displayFields(int[][] fieldsArr){
        System.out.println("Fields for the job:");
        for(int i = 0; i < fieldsArr[0].length;i++){
                System.out.println("field " + fieldsArr[0][i] + ", " + fieldsArr[1][i] + " acres");
        }
    }



}