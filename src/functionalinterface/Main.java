package functionalinterface;

// 
//class MyThread implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("run implemented");
//		
//	}
//	
//}

public class Main {
	
	public static void main(String[] args) {
		
//		MyThread myThread = new MyThread();
//		Thread thread = new Thread(myThread);
//		
//		
//		thread.start();
		
		// way - 1 [lamda expression]
//		Runnable runnable = ()->{
//			System.out.println("run method implemented");
//		};
//		Thread thread = new Thread(runnable);
//		thread.start();
		
		// way - 2 [lamda expression]
		Thread thread = new Thread(()->{
			System.out.println("run method implemented2");
		});
		
		thread.start();
	 	
		
		// anonymous inner class
		
//		Thread thread2 = new Thread(new Runnable() {
//			
//			
//		});
		
//		thread2.start();
	}

	
	
}

