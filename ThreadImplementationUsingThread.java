
package java8Study.streams;
class myRunnable1 implements Runnable{
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
public class ThreadImplementationUsingThread  {
	
	public static void main(String[] args) {
		Runnable r = new myRunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i = 0;i<5;i++) {
			System.out.println(" Here is the count"+ i);
		}
	}

}
