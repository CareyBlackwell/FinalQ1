
public class Car extends Vehicle implements IVehicle{
	//Attributes
	private int NumberOfDoors;
	
	//Constructor
	Car(String Name, String Color, double Weight, Person Owner,int NumberOfDoors){
		super(Name, Color, Weight, Owner);
		this.NumberOfDoors = NumberOfDoors;
	}
	
	public int getNumberOfDoors(){
		return this.NumberOfDoors;
	}
	
	public void setNumberOfDoors(int NumberOfDoors){
		this.NumberOfDoors = NumberOfDoors;
	}
	@Override
	public void transferOwnership(Person newOwner){
		setOwner(newOwner);
	}

}
