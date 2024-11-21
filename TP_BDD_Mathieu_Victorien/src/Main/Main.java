package Main;

import Clock.BufferClock;
import FIFO.BufferFIFO;
import LRU.BufferLRU;

public class Main {
	
	public static void main(String[] args) {
		
		/*************************
		 * BufferFIFO
		 *************************/
		BufferFIFO bufferFIFO = new BufferFIFO();
		
		bufferFIFO.add("A");
		bufferFIFO.add("B");
		bufferFIFO.add("C");
		bufferFIFO.add("D");
		bufferFIFO.add("E");
		bufferFIFO.add("B");
		/*
		bufferFIFO.add("A");
		bufferFIFO.add("B");
		bufferFIFO.add("C");
		bufferFIFO.add("D");
		bufferFIFO.add("E");
		*/
		
		/**************************************************/
		
		/*************************
		 * BufferLRU
		 *************************/
		BufferLRU bufferLRU = new BufferLRU(4);
		bufferLRU.add("A");
		bufferLRU.add("B");
		bufferLRU.add("A");
		bufferLRU.add("C");
		bufferLRU.add("D");
		bufferLRU.add("G");
		bufferLRU.add("C");
		
		/*************************
		 * BufferClock
		 *************************/
		BufferClock bufferClock= new BufferClock(4);
		bufferClock.add("A");
		bufferClock.add("B");
		bufferClock.add("A");
		bufferClock.add("C");
		bufferClock.add("D");
		bufferClock.add("G");
		bufferClock.add("C");
		
	}

}
