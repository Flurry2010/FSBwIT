public class Liste {

	private Element first;

	//-----Fuegt eine Element hinzu-------------
	
	public void add(String value) {
		if (first == null) {
			first = new Element(value);
		} else {
			Element e = new Element(value);
			e.setNext(first);
			first = e;
		}

	}

	//-----Loescht eine Element-----------------
	
	public void del(String a) {
		if(!isEmpty())
		first = first.del(a);
	}

	//-----Gibt alle Elemente aus--------------------------
	
	public String toString() {
		if(isEmpty())return "[LEER]";
	return toString(first.getNext()) + first.getValue() + "]";
	}
			
	private String toString(Element x) {
		if(x == null)return "[";
		return toString(x.getNext())+ x.getValue() + ", ";
	}

	//-----Gibt die Groesse der Liste aus------------------
	
	public int getSize(){
		if(isEmpty())return -1;
		return getSize(first);
		}
	
	private int getSize(Element x) {
		if(x == null)return 0;
		return getSize(x.getNext())+1;
	}

	//-----Fragt ab ob die Liste Lerr ist------------------
	
	public boolean isEmpty() {
		if (first != null)return false;
		return true;
	}

	//-----Fuegt mit add eine Element hinzu----------------
	
	public void push(String a) {
		add(a);
	}

	//-----Wirft nur das letzte Element raus---------------
	
	public String pop() {
		Element temp = first;
		if (isEmpty())return null;
		first = first.getNext();
		return temp.getValue();
	}

	//-----Zeigt Indexstelle an----------------------------
	
	public int getIndex(String a) {
		int counter = -1;
		String inhalt = "";
		Element temp = first;
		if (isEmpty())return -1;
		while (temp != null)
			if (!inhalt.equals(temp.getValue())) {
				counter++;
				temp = temp.getNext();
			} else return getSize() - counter;
		return counter;
	}

	//-----Gibt den Inhalt an Stelle x aus-------------------
	
	public String atIndex(int x) {
		if (isEmpty())return null;
		int size = this.getSize();
		if (x == size - 1)return first.getValue();
		else return first.atIndex(x - this.getSize() + 1);
	}
}
