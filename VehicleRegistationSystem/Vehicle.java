package text;

public class Vehicle {
	
	private String brand;
	private String model;
	private static int count=0;
	
	public Vehicle (String brand,String model){
		this.brand = brand;
		this.model = model;
		count++;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public String getModel(){
		return model;
	}
	
	public static int getCount(){
		return count;
	}
	
	public void displayInfo(){
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
	}

}
