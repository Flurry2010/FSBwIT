public class Liste {

	private Object first;

	
	
	public void add(int x) {
		if (first == null)
			first = new Object(x);
		else {
			Object neu = new Object(x);
			neu.setNext(first);
			first = neu;
		}
	}

	
	
	public boolean isEmpty() {
		return first == null;
	}

	
	
	public String toStringObj() {
		if (isEmpty())
			return "[LEER]";
		return "[" + first.toStringObj().substring(2) + "]";
	}

	
	
	public String toString() {
		if (isEmpty())
			return "[LEER]";
		return "[" + toString(first).substring(2) + "]";
	}

	
	
	private String toString(Object x) {
		if (x == null)
			return "";
		return ", " + x.getInhalt() + toString(x.getNext());
	}

	
	
	public int pop() {
		if (isEmpty())
			return -1;
		Object neu = new Object(first.getInhalt());
		first = first.getNext();
		return neu.getInhalt();
	}

	
	
	public void delObj(int x) {
		if (isEmpty())
			return;
		first = first.delObj(x);
		// if(x == first.getInhalt())
		// first = first.getNext();
		// else
		// first.delObj(x);
	}

	
	
	public void del(int x) {
		if (x == first.getInhalt())
			first = first.getNext();
		else
			del(x, first);
	}

	
	
	private void del(int x, Object y) {
		if (y == null)
			return;
		if (y.getNext() != null)
			if (x == y.getNext().getInhalt()) {
				y.setNext(y.getNext().getNext());
				return;
			}
		del(x, y.getNext());
	}

	
	
	public int min() {
		if (isEmpty())
			return -1;
		Object min = first;
		Object start = first;
		for (; start != null; start = start.getNext()) {
			if (min.getInhalt() > start.getInhalt())
				min = start;
		}
		return min.getInhalt();
	}

	
	
	public void sortMin() {
		if (isEmpty())
			return;
		Liste neu = new Liste();
		for (;first != null;) {
			int min = min();
			neu.add(min);
			del(min);
		}
		this.first = neu.first;
	}

}
