package Clock;

public class Page {
	private String value;
	private boolean flag;
	
	public Page() {
		this.value = "";
		this.flag = true;
	}
	
	public void toggleFlag() {
		this.flag = !this.flag;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public boolean isTrue() {
		return this.flag;
	}
	
	public String toString() {
		return "[" + this.value + ", " + this.flag + "]";
	}
}
