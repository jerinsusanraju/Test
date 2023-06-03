package com.interfacepkg;

public class D extends C implements A,B{
	
	public void display() {
		System.out.println("Show");
		super.display();		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D obj =new D();
		obj.display();
		
		

	}

}
