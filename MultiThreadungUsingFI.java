package java8Study.streams;

public class MultiThreadungUsingFI {
	
	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i =0;i<5;i++) {
				System.out.println("Child thread using FI");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i =0;i<10;i++) {
			System.out.println("Main Thread using FI");
		}
	}

}
