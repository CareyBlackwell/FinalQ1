
public class MotorCycle extends Vehicle implements IVehicle{
	private boolean hasSideCar;
	
	MotorCycle(String Name, String Color, double Weight, Person Owner,boolean hasSideCar){
		super(Name, Color, Weight, Owner);
		this.hasSideCar = hasSideCar;
	}
	
	public boolean getHasSideCar(){
		return this.hasSideCar;
	}
	public void setHasSideCar(boolean hasSideCar){
		this.hasSideCar = hasSideCar;
	}
	
	@Override
	public void transferOwnership(Person newOwner){
		setOwner(newOwner);
	}
}
