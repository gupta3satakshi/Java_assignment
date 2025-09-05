package Assignment9;

import Day8.MyQueue;

public class EvenOddThread {
	
//	Q.3 Write a Multithreaded program that prints even and odd number alternately
//	Exp output
//	Odd: 1
//	Even : 2
//	Odd : 3
//	.

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		Thread even = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =0; i <30; i+=2) {
					
						queue.setValue("Even : " +i);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
			}
			
		});
		
		
		Thread odd = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =1; i <30; i+=2) {
				
						queue.getValue();
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
			}
			
		});
		
		even.start();
		odd.start();

	}

}
