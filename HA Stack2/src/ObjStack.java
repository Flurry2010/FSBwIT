public class ObjStack {

	//-----Objekt Array erstellen-------------------
	
	private Object[] lager = new Object[0];

	//-----Abfrage ob Stack leer-------------------	
	
	public boolean isEmpty() {
		return lager.length == 0;
	}

	//-----Stack fuellen---------------------------
	
	public void push(Object x) {
		Object[] temp = new Object[lager.length + 1];
		for (int i = 0; i < lager.length; i++)
			temp[i + 1] = lager[i];
		temp[0] = x;
		lager = temp;
	}

	//-----Stack leeren---------------------------
	
	public Object pop() {
		Object inhalt = lager[0];
		Object[] temp = new Object[lager.length - 1];
		for (int i = 0; i < temp.length; i++)
			temp[i] = lager[i + 1];
		lager = temp;
		return inhalt;
	}

}
