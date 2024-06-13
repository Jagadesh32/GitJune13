package org.gui;

public class Sample {
	
	private void add() {
		
		int a = 20;
		System.out.println(a);
	}
	
	private void print() {
		
		int b = 10;
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		s.add();
		s.print();
		
	}

}
