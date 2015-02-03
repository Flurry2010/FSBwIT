public class QuickSort {

	public static void main(String[] args) {

		int[] array = arrayVoll(arrayNeu(10));

		String[] stringArray = { "de", "Ab", "Dd", "ef", "cc", "cd", "bb",
				"aa", "Ee", "bc" };

		System.out.println(arrayToString(array));

		quickSortInt(array);

		System.out.println(arrayToString(array));

		System.out.println(arrayToString(stringArray));
		
		quickSortString(stringArray);

		System.out.println(arrayToString(stringArray));

	}

	public static int[] arrayNeu(int laenge) {
		int[] array = new int[laenge];
		return array;
	}

	public static int[] arrayVoll(int[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = (int) (Math.random() * 10);
		return a;
	}

	public static String arrayToString(int[] a) {
		String inhalt = "[";
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1)
				inhalt += a[i];
			else
				inhalt += a[i] + ",";
		}
		return (inhalt + "]");
	}

	public static String arrayToString(String[] a) {
		String inhalt = "[";
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1)
				inhalt += a[i];
			else
				inhalt += a[i] + ",";
		}
		return (inhalt + "]");
	}

	public static void quickSortInt(int[] a) {
		int r = a.length - 1;
		int l = 0;
		quickSortInt(a, l, r);
	}

	private static void quickSortInt(int[] a, int l, int r) {
		int m = a[(l + r) / 2];
		int i = l;
		int j = r;

		while (i <= j) {
			while (a[i] < m)i++;
			while (a[j] > m)j--;
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		if (j > l)
			quickSortInt(a, l, j);

		if (i < r)
			quickSortInt(a, i, r);
	}

	public static void quickSortString(String[] a) {
		int l = 0;
		int r = a.length - 1;
		quickSortString(a, l, r);
	}

	private static void quickSortString(String[] a, int l, int r) {
		String m = a[(l + r) / 2];
		int i = l;
		int j = r;

		while (i <= j) {
			while (a[i].compareToIgnoreCase(m) < 0)i++;
			while (a[j].compareToIgnoreCase(m) > 0)j--;
			if( i<= j){
				String temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		if(i < r)
			quickSortString(a, i, r);
		if(j > l)
			quickSortString(a, l, j);

	}

	

}
