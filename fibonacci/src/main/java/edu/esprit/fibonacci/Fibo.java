package edu.esprit.fibonacci;

public class Fibo {

	public Fibo() {
	}
	public int process(int n){
		if (n<2){
			
		return n;
		}
		return process (n-1)+ process (n-2);
		}

}
