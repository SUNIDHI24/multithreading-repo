package com.hm.multithreading.casestudy;

public class Main {
	
   public static final int MAX_PASSWORD = 9999;

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("I'm going for a walk");
		    }
		});
		 
		Thread thread2 = new Thread(new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("I'm going to swim");
		    }
		});
		        
		thread1.start();
		thread2.start();
		System.out.println("I'm going home");

	}
	
//	private static class Vault {
//		private int password;
//		public Vault(int password) {
//			this.password = password;
//		}
//	
//		public boolean isPasswordCorrect(int guess) {
//			try {
//				Thread.sleep(5);
//			} catch(InterruptedException e) {
//				
//			}
//			return this.password == guess;
//		}
//	}
//	
//	private static abstract class HackerThread extends Thread {
//		protected Vault vault;
//		public HackerThread(Vault vault) {
//			this.vault = vault;
//			this.setName(this.getName());
//			this.setPriority(Thread.MAX_PRIORITY);
//		}
//		@Override
//		public void start() {
//			System.out.println("Starting thread "+this.getName());
//			super.start();
//		}
//		
//	}
//	
//	private static class AscendingHackerThread extends HackerThread {
//
//		public AscendingHackerThread(Vault vault) {
//			super(vault);
//			
//		}
//		@Override
//		public void run {
//			for(int guess = 0; guess<MAX_PASSWORD; guess++) {
//				if
//			}
//		}
//		
//	}

}
