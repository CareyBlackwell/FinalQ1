import java.util.ArrayList;
import java.util.UUID;


public class Person {
	//Attributes
	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
	//Constructor
	Person(String FirstName, String LastName){
		this.FirstName = FirstName;
		this.LastName = LastName;
		PersonID = UUID.randomUUID();
	}
	
	//Getters
	public String getFirstName(){
		return this.FirstName;
	}
	public String getLastName(){
		return this.LastName;
	}
	public UUID getPersonID(){
		return this.PersonID;
	}
	
	//Setters
	public void setFirstName(String FirstName){
		this.FirstName = FirstName;
	}
	public void setLastName(String LastName){
		this.LastName = LastName;
	}
	public void setPersonID(){
		this.PersonID = UUID.randomUUID();
	}
}
