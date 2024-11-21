package LRU;

import java.util.ArrayList;

public class BufferLRU {
	private ArrayList <String> buffer;
	private int numnerOfSlots;
	
	public BufferLRU(int size) {
		this.buffer = new ArrayList<String>(size);
		this.numnerOfSlots = size;
	}
	
	public void add(String page) {
		if(this.buffer.contains(page)) {
			this.buffer.remove(this.buffer.indexOf(page));
			this.numnerOfSlots++;
		}
		else if(!this.buffer.isEmpty() && this.numnerOfSlots == 0){
			this.buffer.remove(0);
			this.numnerOfSlots++;
		}
		
		
		this.buffer.add(page);
		if(this.numnerOfSlots > 0) {
			this.numnerOfSlots--;
		}
		
		System.out.println(this.buffer);
	}
}
