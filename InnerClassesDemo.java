package java8Study.streams;

interface interf12{
	public void m1();
}
 class InnerClassesDemo {

	int x =888;
	public void m2(){
		int x=999;
		//interf12 ii = new interf12(){
		  //	int x= 999;
			//public void m1(){
				//System.out.println(this.x);
			//}
			//};
		interf12 ii = ()->{
			
			System.out.println(x);
		};
		ii.m1();
		
	}
	public static void main(String args[]) {
		InnerClassesDemo Id = new InnerClassesDemo();
		Id.m2();
	}
	
}
