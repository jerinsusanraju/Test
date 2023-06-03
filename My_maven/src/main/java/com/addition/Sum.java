package com.addition;

public class Sum {
	
	
	public int add(int a, int b){
	int sum = a+b;
	return sum;
	
	}

	public static void main(String[] args) {
		
		Sum obj = new Sum();
		System.out.println(obj.add(5,2));

	}

}
