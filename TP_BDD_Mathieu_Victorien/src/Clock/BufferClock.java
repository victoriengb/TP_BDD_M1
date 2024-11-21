package Clock;

public class BufferClock {
	private Page[] buffer;
	private int aiguille;
	
	public BufferClock(int size) {
		this.buffer = new Page[size];
		this.aiguille = 0;
	}
	
	public void add(String value) {
		if(!this.buffer[this.aiguille].isTrue()) {
			
			this.buffer[this.aiguille].setValue(value);
			this.buffer[this.aiguille].toggleFlag();
			
			//Rotation de l'aiguille
			this.aiguille++;
			this.aiguille = this.aiguille % this.buffer.length;
			printStringArray(buffer);
		}
		else if(this.buffer[this.aiguille].isTrue()) {
			this.buffer[this.aiguille].toggleFlag();
			
			//Rotation de l'aiguille
			this.aiguille++;
			this.aiguille = this.aiguille % this.buffer.length;
			
			//Récursivité
			this.add(value);
		}
	}
	
	public void printStringArray(Page[] array) {
		String value = "";
		for(Page cell : array) {
			value += " " + cell;
		}
		System.out.println(value);
	}
}
