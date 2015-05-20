import java.util.HashMap;
import java.util.UUID;


public class TestVehicle {
	private HashMap carMap = new HashMap();
	private HashMap truckMap = new HashMap();
	HashMap hogMap = new HashMap();
	//I know person isn't subclass but just incase
	private HashMap perMap = new HashMap();
	
	public TestVehicle(){
		Person a = new Person("Bob", "Obo");
		Car c = new Car("Mazda6", "Blue", 3.1, a, 4);
		Truck t = new Truck("Hess", "Red", 3.2, a, 2);
		Person b = new Person("Rob", "Boss");
		t.transferOwnership(b);
		MotorCycle h = new MotorCycle("Bt", "Orange", 3.3, b, false);
		
		
		carMap.put(UUID.randomUUID(), c);
		truckMap.put(UUID.randomUUID(), t);
		hogMap.put(UUID.randomUUID(), h);
		perMap.put(UUID.randomUUID(), a);
		perMap.put(UUID.randomUUID(), b);
		
	}
	public HashMap getCarMap(){
		return this.carMap;
	}
	public HashMap getTruckMap(){
		return this.truckMap;
	}
	public HashMap getHogMap(){
		return this.hogMap;
	}
	public HashMap getPerMap(){
		return this.perMap;
	}

}
