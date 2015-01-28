public class MergeSort {

	public static void main(String[] inhalt) {
		
		char[] charArray = { 'a', 'x', 'a', 'd', 'f', 'o', 't', 'e',
			's', 'h', 'i', 'z', 'g' };

		System.out.println(charArray);
		
		System.out.println(mergeSort(charArray));
	}
	
	public static char[] mergeSort(char[] array){
		
		if(array.length < 2)
			return array;
		
		char[] l = new char[array.length / 2];
		char[] r = new char[array.length - l.length];
		
		for(int i = 0; i < l.length; i++)
			l[i] = array[i];
		
		for(int i = 0; i < r.length; i++)
			r[i] = array[l.length+i];
		
		l = mergeSort(l);
		r = mergeSort(r);
		
		char[] neuArray = new char[array.length];
		
		int i = 0, j = 0, k = 0;
		
		while(i < l.length && j < r.length){
		if(l[i] < r[j])
		neuArray[k++] = l[i++];
		else
			neuArray[k++] = r[j++];
		}
		
		while(i < l.length){
			neuArray[k++] = l[i++];
		}
		
		while(j < r.length){
			neuArray[k++] = r[j++];
		}

		return neuArray;
	}

}
