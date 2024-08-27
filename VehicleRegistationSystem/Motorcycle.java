package text;

public class Motorcycle extends Vehicle{

	private boolean hasSideCar;
	
	public Motorcycle(String brand,String model,boolean hasSideCar){
		super(brand,model);
		this.hasSideCar = hasSideCar;
		
	}
	
	@Override
	public void displayInfo(){
		System.out.println(" **** Motorcycle ****");
		System.out.println("Brand : "+this.getBrand());
		System.out.println("Model : "+this.getModel());
		System.out.println("Has Side Car :"+this.hasSideCar);
	}
}
