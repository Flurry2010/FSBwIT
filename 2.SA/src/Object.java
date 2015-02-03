
public class Object {

	private int inhalt;
	private Object next;
	
	
	
	public Object(int inhalt){
		this.inhalt = inhalt;
		this.next = null;
	}

	public int getInhalt() {
		return inhalt;
	}

	public void setInhalt(int inhalt) {
		this.inhalt = inhalt;
	}

	public Object getNext() {
		return next;
	}

	public void setNext(Object next) {
		this.next = next;
	}

	public String toStringObj() {
		if(next == null)return ", " + inhalt;
		return ", " + inhalt + next.toStringObj();
	}

	public Object delObj(int x) {
		if(x == inhalt)return next;
		if(next != null)next=next.delObj(x);
		return this;
		
	}

}
