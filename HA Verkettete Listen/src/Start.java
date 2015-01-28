
public class Start {

	public static void main(String[] args) {
		
		Liste l = new Liste();
		
		l.add("Wagon 1");
		l.push("Wagon 2");
		l.add("Wagon 3");
		l.push("Wagon 4");
		l.add("Wagon 5");
		l.push("Wagon 6");
		
		System.out.println(l.toString());
		
//		l.del("Wagon 6");
//		
//		System.out.println(l.toString());
//		
//
//		
//		System.out.println(l.isEmpty());
//		
//		System.out.println(l.pop());
		
System.out.println(l.getIndex("Wagon 7"));
		
//		System.out.println(l.atIndex(2));
		
//		System.out.println(l.remove(2));
//		
//		System.out.println(l.toString());
		
		l.insert(3, "Wagon neu");
		
		System.out.println(l.toString());
	

		
		
		

	}

}
