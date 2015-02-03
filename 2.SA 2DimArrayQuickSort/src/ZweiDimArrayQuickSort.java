public class ZweiDimArrayQuickSort {

	public static void main(String[] args) {

		String[][] liste = { { "HS6", "Fleuren" }, { "HS5", "Rose" },
				{ "HS3", "Mayer" }, { "HS6", "Napret" }, { "HS5", "Heinz" },
				{ "HS2", "Klaus" }, { "HS1", "Theilen" }, { "HS4", "Geue" },
				{ "HS4", "Geue" }, { "HS2", "Michael" }, { "HS3", "Geue" },
				{ "HS1", "Geue" } };

		for (String[] ausg : liste) {
			for (String a : ausg) {
				System.out.println(a);
			}
		}
		
		quickSort(liste);
		
		System.out.println();
		
		for (String[] ausg : liste) {
			for (String a : ausg) {
				System.out.println(a);
			}
		}
		
	}

	public static void quickSort(String[][] a) {
		int l = 0;
		int r = a.length - 1;
		quickSort(a, l, r);
	}

	private static void quickSort(String[][] a, int l, int r){
		String[] m = a[(r+l)/2];
				int i = l;
				int j = r;
				while(i <= j){
					while(a[i][0].compareToIgnoreCase(m[0])<0 || (a[i][0].equals(m[0]) && a[i][1].compareToIgnoreCase(m[1])<0))i++;
					while(a[j][0].compareToIgnoreCase(m[0])>0 || (a[j][0].equals(m[0]) && a[j][1].compareToIgnoreCase(m[1])>0))j--;
					if(i <= j){
					String[] temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
					j--;
					}
				}
				if(j > l)
				quickSort(a, l, j);
				
				if(i < r)
					quickSort(a, i, r);
	}
}
