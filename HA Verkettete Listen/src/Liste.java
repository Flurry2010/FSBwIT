public class Liste {

	private Element first;

	// -----Fuegt eine Element hinzu-------------

	public void add(String value) {
		if (first == null) {
			first = new Element(value);
		} else {
			Element e = new Element(value);
			e.setNext(first);
			first = e;
		}
	}

	// -----Loescht ein Element-----------------

	public void del(String a) {
		if (!isEmpty())
			first = first.del(a);
	}

	// -----Gibt alle Elemente aus--------------------------

	public String toString() {
		if (isEmpty())
			return "[LEER]";
		return toString(first.getNext()) + first.getValue() + "]";
	}

	private String toString(Element x) {
		if (x == null)
			return "[";
		return toString(x.getNext()) + x.getValue() + ", ";
	}

	// -----Gibt die Groesse der Liste aus------------------

	public int getSize() {
		if (isEmpty())
			return -1;
		return getSize(first);
	}

	private int getSize(Element x) {
		if (x == null)
			return 0;
		return getSize(x.getNext()) + 1;
	}

	// -----Fragt ab ob die Liste Lerr ist------------------

	public boolean isEmpty() {
		return first == null;
	}

	// -----Fuegt mit add eine Element hinzu----------------

	public void push(String a) {
		add(a);
	}

	// -----Wirft nur das letzte Element raus---------------

	public String pop() {
		Element temp = first;
		if (isEmpty())
			return null;
		first = first.getNext();
		return temp.getValue();

	}

	// -----Zeigt Indexstelle an----------------------------

	public int getIndex(String a) {
		if (isEmpty())
			return -1;
		return getSize() - getIndex(a, first);
	}

	private int getIndex(String a, Element temp) {
		if (temp == null)
			return 1;
		if (a.equals(temp.getValue()))
			return 1;
		return getIndex(a, temp.getNext()) + 1;

	}

	// -----Gibt den Inhalt an Stelle x aus-------------------

	public String atIndex(int x) {
		if (isEmpty())
			return null;
		return atIndex(getSize() - 1 - x, first);
	}

	private String atIndex(int x, Element temp) {
		if (x == 0)
			return temp.getValue();
		return atIndex(x - 1, temp.getNext());

	}

	// -----Loescht das Element an der Indexstelle x----------

	public String remove(int index) {
		if (isEmpty())
			return null;
		if (index > getSize() - 1)
			return null;
		if (index == getSize() - 1) {
			String inhalt = first.getValue();
			first = first.getNext();
			return inhalt;
		}
		return remove(getSize() - 1 - index, first);
	}

	private String remove(int x, Element temp) {
		if (x == 1) {
			String inhalt = temp.getNext().getValue();
			temp.setNext(temp.getNext().getNext());
			return inhalt;
		}
		return remove(x - 1, temp.getNext());
	}

	// -----Fuegt an der Indexstelle x ein Element ein------

	public void insert(int x, String inhalt){
		if(x < 0)return;
		if(x >= getSize())return;
		insert(getSize() - 1 - x, inhalt, first);
	}
	
	private void insert(int x, String inhalt, Element temp){
		if(x == 0){
			Element neu = new Element(inhalt);
			neu.setNext(temp.getNext());
			temp.setNext(neu);
			return;
		}
		insert(x-1, inhalt, temp.getNext());
	}
}
