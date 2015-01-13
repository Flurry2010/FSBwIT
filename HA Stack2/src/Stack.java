public class Stack {

	//-----Objekt Array erstellen-------------------
	
	private Object[] karton = new Object[2];

	//-----Abfrage ob Stack leer-------------------	
	
	public boolean isEmpty() {
		return karton[0] == null;
	}

	//-----Stack fuellen---------------------------
	
	public void push(Object x) {
		if (karton[0] != null)
			karton[1] = karton.clone();
		karton[0] = x;
	}

	//-----Stack leeren---------------------------
	
	public Object pop() {
		Object temp = karton[0];
		if (karton[1] != null)
			karton = (Object[]) karton[1];
		else
			karton[0] = null;
		return temp;
	}

}
