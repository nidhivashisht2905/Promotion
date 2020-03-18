package java8Study.streams;

class myRunnable11 implements Runnable{
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println(" Here is the count"+ i);
		}
	}
	
}
//class Demo1 implements interfAddNumber {
	
	//public int getLength(String s)
	//{
		//return s.length();
	//}
//}
public class ThreadImplementationUsingLambda  {
	
	public static void main(String[] args) {
		Runnable r = new myRunnable11();
		Thread t = new Thread(r);
		t.start();
		for(int i = 0;i<5;i++) {
			System.out.println(" Here is the count"+ i);
		}
	}

}

