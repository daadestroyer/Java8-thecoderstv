package doublecolonoperator;

class MyThread implements Runnable {
	public void run() {
		System.out.println("hello");
	}
}

public class App02 {

	public void run() {
		System.out.println("run method");
	}

	public static void main(String[] args) {

		/*
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start(); */
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		// Runnable runnable = new App02()::run;
		
		
		
 	}
}
