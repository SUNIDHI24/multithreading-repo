package com.hm.multithreading.inheritance;

public class MutithreadingInheritance {
	
	public static void main(String[] args) {
		Thread thread = new Newthread();
			
			
		thread.start();
	}
	
	private static class Newthread extends Thread {
		@Override
		public void run() {
			System.out.println("Hello from "+this.getName());
		}
	}

}
