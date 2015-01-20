
public class Element {

	private String value;
	private Element next;
	
	
	
	public Element(String value){
		this.value = value;
		this.next = null;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}
	
	public Element del(String a){
		if(a.equals(this.value))return next;
		if(next!=null)next = next.del(a);
		return this;
	}

}
