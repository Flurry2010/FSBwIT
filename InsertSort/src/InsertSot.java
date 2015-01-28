public class InsertSot {

	public static char[] charArray = { 'a', 'x', 'a', 'd', 'f', 'o', 't', 'e',
			's', 'h', 'i', 'z', 'g' };

	//-----CharArray halbieren Seite für Seite sortieren----------------------------
	
	public char[] sort(char[] array){
		int r = array.length-1;
		int l = array.length - array.length;
		return sort(l, r);
	}
	
	//-----
	
	private char[] sort(int l, int r) {

		if (l < r) {
			int q = (l + r) / 2;
			sort(l, q);
			sort(q + 1, r);
			merge(l, q, r);
		}
		return charArray;
	}

	//-----Sortierte Seiten wieder zusammenfügen-----------------------------------
	
	private void merge(int l, int q, int r) {
		char[] a = new char[charArray.length];
		int i, j;
		for (i = l; i <= q; i++) {
			a[i] = charArray[i];
		}
		
		for (j = q + 1; j <= r; j++) {
			a[r + q + 1 - j] = charArray[j];
		}
		i = l;
		j = r;
		
		for (int k = l; k <= r; k++) {
			if (a[i] <= a[j]) {
				charArray[k] = a[i];
				i++;
			} else {
				charArray[k] = a[j];
				j--;
			}
		}
	}

	public static void main(String[] inhalt) {

		//-----CharArray füllen------------------------------------
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}

		//-----CharArray unsortiert ausgeben-----------------------
		
		System.out.println();
		
		//-----
		
		InsertSot ms = new InsertSot();
		
		//-----CharArray sortieren lassen-------------------------
		
		char[] arraySort = ms.sort(charArray);
		
		//-----CharArray sortiert ausgeben------------------------
		
		for (int i = 0; i < arraySort.length; i++) {
			System.out.print(arraySort[i]);
		}
	}
}
