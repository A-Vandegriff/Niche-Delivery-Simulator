package classes.farm;
import classes.field.Field;
import classes.location.Location;
import java.util.ArrayList;


public class Farm {
	private String name;
	private Location location;
	private ArrayList<Field> fields;
	private boolean hasSand;

	public Farm(String name, Location location) {
		this.location = location;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display(){
		System.out.println(name);
		System.out.println(location.getLatitude());
		System.out.println(location.getLongitude());
	}

}
