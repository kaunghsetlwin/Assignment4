package text;
import java.io.IOException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException{
		VehicleRegisterService vgs = new VehicleRegisterService();
		vgs.InputData();
		vgs.dispaly();
	}

}
