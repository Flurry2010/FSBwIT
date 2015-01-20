
public class Start {

	public static void main(String[] args) {
		
		Liste l = new Liste();
		
		l.push("Wagon 1");
		l.push("Wagon 2");
		l.push("Wagon 3");
		l.push("Wagon 4");
		l.push("Wagon 5");
		
		System.out.println(l.toString());
		System.out.println(l.getSize());
		
		l.del("Wagon 1");
		
		System.out.println(l.toString());

		
		
		

	}

}
