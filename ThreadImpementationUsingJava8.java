package java8Study.streams;



public class ThreadImpementationUsingJava8 {
public static void main(String[] args) {
	Runnable r =()->{
		for(int i =0;i<5;i++) {
			System.out.println("Child Thread using Java 8");
		}
	};
	
	Thread t = new Thread(r);
	t.start();
	
	for(int i =0;i<5;i++) {
		System.out.println("Main  Thread using Java 8");
	}
}
}
