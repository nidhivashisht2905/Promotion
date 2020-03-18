package java8Study.streams;

class MyOwnRunable implements Runnable{
	public void run()
	{
		for(int i =0;i<5;i++) {
			System.out.println("Child Thread");
			
		}
	}
}
public class ThreadImplementation {
	public static void main(String[] args) {
		Runnable r = new MyOwnRunable();
				Thread t = new Thread(r);
				t.start();
				
				for(int i =0;i<5;i++) {
					System.out.println("Main Thread");
					
				}
	}

}
