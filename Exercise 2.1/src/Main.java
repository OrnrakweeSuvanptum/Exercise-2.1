
public class Main {

	public static void main(String[] args) {
		
		Motorcycle Yamaha = new Motorcycle();
		Yamaha.brand = "Yamaha"; 
		Yamaha.engine = "155cc"; 
		Yamaha.colour = "Blue";
		Yamaha.type = "Superbike"; 
		
		Motorcycle Honda = new Motorcycle(); 
		Honda.brand = "Honda";
		Honda.engine = "150cc"; 
		Honda.colour = "Orange"; 
		Honda.type = "Scooters"; 
		
		System.out.println("Brand 1: " + Yamaha.brand + "\n" + "Engine: " + Yamaha.engine + "\n" + 
								"Colour: " + Yamaha.colour + "\n" + "Type: " + Yamaha.type); 
		
		System.out.println();
		
		System.out.println("Brand 2: " + Honda.brand + "\n" + "Engine: " + Honda.engine + "\n" + 
				"Colour: " + Honda.colour + "\n" + "Type: " + Honda.type); 
		
		System.out.println();
		
		Yamaha.behavior();

		
		
		
		
		
		

	}

}
