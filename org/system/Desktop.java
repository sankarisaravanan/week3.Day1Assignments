package org.system;

public class Desktop extends Computer{

	public void desktopsize() {
		System.out.println("Inside desktopSize method....");
		
	}
	public static void main(String[] args) {
		Desktop desk1 = new Desktop();
		System.out.println("Methods from class Computer");
		desk1.computerModel();
		
		System.out.println("Methods from class Desktop");
		desk1.desktopsize();

	}

}
