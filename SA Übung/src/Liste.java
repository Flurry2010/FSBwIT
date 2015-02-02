public class Liste {

	private Element first;

	// -----Fuegt eine Element hinzu-------------

	public void add(int value) {
		if (first == null) {
			first = new Element(value);
		} else {
			Element e = new Element(value);
			e.setNext(first);
			first = e;
		}
	}

	// -----Fragt ab ob die Liste Lerr ist------------------

	public boolean isEmpty() {
		return first == null;
	}

	// -----Loescht ein Element-----------------

	public void del(int a) {
		if (!isEmpty())
			first = first.del(a);
	}

	public void insertSort(int x) {
		if (isEmpty()) {
			first = new Element(x);
		} else if (x >= first.getValue()) {
			Element help = new Element(x);
			help.setNext(first);
			first = help;

		} else {
			for (Element temp = first;; temp = temp.getNext()) {
				if (temp.getNext() == null) {
					temp.setNext(new Element(x));
					return;
				}

				if (x >= temp.getNext().getValue()) {
					Element help = new Element(x);
					help.setNext(temp.getNext());
					temp.setNext(help);
					return;
				}
			}

		}
	}

	public int pop() {
		int inhalt = first.getValue();
		first = first.getNext();
		return inhalt;

	}

	public String toString() {
		if (isEmpty())
			return "[LEER]";
		return "" + toString(first).substring(1);
	}

	private String toString(Element x) {
		String inhalt = "";
		if (x == null)
			return "";
		return inhalt += " " + x.getValue() + toString(x.getNext());
	}

	public Liste copy() {
		Liste neu = new Liste();
		neu.first = copy(first);
		return neu;
	}

	private Element copy(Element x) {
		Element neu = new Element(x.getValue());
		if (x.getNext() != null)
			neu.setNext(copy(x.getNext()));
		return neu;
	}

	public int min() {
		if (isEmpty())
			return -1;
		Element x = first;
		Element min = first;
		for (; x.getNext() != null;) {
			if (x.getValue() < min.getValue())
				min = x;
			x = x.getNext();
		}
		return min.getValue();
	}

	public void sortMin() {
		if(isEmpty())return;
		
		Liste neu = new Liste();
		
		for (;first != null;) {
			int min = (min());
			neu.add(min);
			del(min);
		}
	this.first = neu.first;
	}
}

