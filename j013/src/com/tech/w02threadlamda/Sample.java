package com.tech.w02threadlamda;

//class ThreadA implements Runnable{
//	@Override
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("thAAA");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				
//			}
//		}
//		
//	}
//}
//
//class ThreadB implements Runnable{
//
//	@Override
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("thBBB");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//			}
//		}
//	}
//	
//}

public class Sample {
	public static void main(String[] args) {
//		Runnable obj1 = new ThreadA();
//		Runnable obj2 = new ThreadB();

		Runnable obj1 = new Runnable() {
			//non lamda
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("thAAA");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		
		
		Runnable obj2 = () ->  {
			//lamda
				for (int i = 0; i < 5; i++) {
					System.out.println("thBBB");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

	}
}
