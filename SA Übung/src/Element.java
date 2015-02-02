public class Element {

	private int value;
	private Element next;
	
	
	
	public Element(int value){
		this.value = value;
		this.next = null;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}
	
	public Element del(int a){
		if(a == (this.value))return next;
		if(next!=null)next = next.del(a);
		return this;
	}
}