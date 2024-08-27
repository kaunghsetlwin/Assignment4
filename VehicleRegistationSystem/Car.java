package text;

public class Car extends Vehicle{

	private int doors;

	public Car(String brand,String model,int doors){
		super(brand,model);
		this.doors = doors;
		
	}
	
	@Override
	public void displayInfo(){
		System.out.println("  **** CAR ****");
		System.out.println("Brand : "+this.getBrand());
		System.out.println("Model : "+this.getModel());
		System.out.println("Doors : "+this.doors);
	}
}
