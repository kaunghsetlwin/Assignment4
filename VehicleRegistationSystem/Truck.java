package text;

public class Truck extends Vehicle{

	private int payloadCapacity;

	public Truck(String brand,String model,int payloadCapacity){
		super(brand,model);
		this.payloadCapacity = payloadCapacity;
	}

	@Override
	public void displayInfo(){
		System.out.println(" **** Truck ****");
		System.out.println("Brand : "+this.getBrand());
		System.out.println("Model : "+this.getModel());
		System.out.println("Pay Load Capacity : "+this.payloadCapacity);
	}
}
