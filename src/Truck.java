
public class Truck extends Vehicle implements IVehicle{
	private int NumberOfAxels;
	
	Truck(String Name, String Color, double Weight, Person Owner, int NumberOfAxels){
		super(Name, Color, Weight, Owner);
		this.NumberOfAxels = NumberOfAxels;
	}
	
	public int getNumberOfAxels(){
		return this.NumberOfAxels;
	}
	
	public void setNumberOfAxels(int NumberOfAxels){
		this.NumberOfAxels= NumberOfAxels;
	}
	
	@Override
	public void transferOwnership(Person newOwner){
		setOwner(newOwner);
	}
}
