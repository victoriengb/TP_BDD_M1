package FIFO;

import java.util.ArrayList;

public class BufferFIFO {
	private String[] buffer;
	private int slot;
	
	public BufferFIFO() {
		this.buffer = new String[4];
		this.slot = 0;
	}
	
	public void add(String page) {
		if(!BufferFIFO.contains(this.buffer, page)) {
			buffer[slot] = page;
			slot++;
			slot = slot % 4;
		}
		printStringArray(buffer);
	}
	
	public static boolean contains(String[] buffer, String page) {
		for(String value : buffer) {
			if(value != null && value.equals(page)) {
				return true;
			}
		}
		return false;
	}
	public void printStringArray(String[] array) {
		String value = "";
		for(String cell : array) {
			value += " " + cell;
		}
		System.out.println(value);
	}
}
