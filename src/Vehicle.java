
public abstract class Vehicle {
	//Attributes
	private String Name;
	private String Color;
	private double Weight;
	private Person Owner;
	
	//Constructor
	Vehicle(String Name, String Color, double Weight, Person Owner){
		this.Name = Name;
		this.Color = Color;
		this.Weight= Weight;
		this.Owner = Owner;
	}
	
	//Getters 
	public String getName(){
		return this.Name;
	}
	public String getColor(){
		return this.Color;
	}
	public double getWeight(){
		return this.Weight;
	}
	public Person getOwner(){
		return this.Owner;
	}
	
	//Setters
	public void setName(String Name){
		this.Name = Name;
	}
	public void setColor(String Color){
		this.Color = Color;
	}
	public void setWeight(double Weight){
		this.Weight = Weight;
	}
	public void setOwner(Person Owner){
		this.Owner = Owner;
	}
}
