
public class Start {

	public static void main(String[] args) {
		
		Liste neu = new Liste();
		
		System.out.println(neu.isEmpty());
		
		neu.add(5);
		neu.add(4);
		neu.add(3);

		System.out.println(neu.isEmpty());
		
		System.out.println(neu.toString());
		
//		System.out.println(neu.pop());
		
//		neu.del(3);
		
		System.out.println(neu.min());
		
		neu.sortMin();
		
		System.out.println(neu.toString());
	}

}
