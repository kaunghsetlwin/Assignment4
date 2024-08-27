package text;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VehicleRegisterService  {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Vehicle [] vehicleArr = new Vehicle[100];
	private String brand;
	private String model;
	private String type;
	
	
	public  void InputData()throws IOException{
		String flag;
		do{
		   commonInputData();
		
		if ("car".equalsIgnoreCase(type)){
		 this.getCarInfo();
		}
		else if ("truck".equalsIgnoreCase(type)){
			 this.getTruckInfo();
		}
		else if ("motorcycle".equalsIgnoreCase(type)){
			 this.getMotorcylceInfo();
		}
		System.out.print("Do you want to add a new Vehicle? (yes/no) :");
		flag = br.readLine();
		}
		while (flag.equalsIgnoreCase("yes"));
		System.out.println();
	}
	
	    public void commonInputData()throws IOException {
	    	
	    	System.out.print("Enter Brand : ");
			this.brand = br.readLine();
			System.out.print("Enter Model : ");
			this.model = br.readLine();
			System.out.print("Enter Type (car/truck/motorcycle) : ");
			this.type = br.readLine();
	    	
	    }
		
		public void getCarInfo()throws IOException{
			System.out.print("Enter doors : ");
			int doors = Integer.parseInt(br.readLine());
			Vehicle car = new Car(brand,model,doors);
			this.vehicleArr[Vehicle.getCount()-1] = car;
		}
		
		public void getTruckInfo()throws IOException {
			System.out.print("Enter Pay load Capacity : ");
			int payloadCapacity = Integer.parseInt(br.readLine());
			Vehicle truck = new Truck(brand,model,payloadCapacity);
			this.vehicleArr[Vehicle.getCount()-1] = truck;
		}
		
		public void getMotorcylceInfo()throws IOException {
			System.out.print("Do you have Side-car (true/false) : ");
			boolean hasSideCar = Boolean.parseBoolean(br.readLine());
			Vehicle motorcycle = new Motorcycle (brand,model,hasSideCar);
			this.vehicleArr[Vehicle.getCount()-1] = motorcycle;
			
			
		}
		
		public void dispaly(){
			for (int i=0;i<Vehicle.getCount();i++){
				this.vehicleArr[i].displayInfo();
				System.out.println();
			}
		}
	

}
