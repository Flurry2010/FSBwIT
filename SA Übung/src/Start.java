public class Start {

	public static void main(String[] args) {
		
		Liste unSort = new Liste();
		
		for(int i = 0; i < 20; i++)unSort.add((int)(Math.random()*100));
		
		Liste sort = new Liste();
		
		System.out.print(unSort.toString());
//		
//		while(!unSort.isEmpty())sort.insertSort(unSort.pop());
//		
		System.out.println();
//		
//		System.out.print(sort.toString());
		
//		System.out.println(unSort.min());
		
		unSort.sortMin();
		
		System.out.println();
		
		System.out.print(unSort.toString());
		
		
	}
}

