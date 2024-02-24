package thrds3;

public class Tester3 {

	public static void main(String[] args) throws InterruptedException{
		//create a thread : imple Runnable : using ano inner class
		//Thread(Runnable task, String name)
		Thread t1 = new Thread(() -> 
				System.out.println(Thread.currentThread().getName()+" running")
				
			, "one");//NEW
		t1.start();
		// o/p : main thrds running, child thrd running
		System.out.println(Thread.currentThread().getName()+" running");
		t1.join();//RUNNABLE
		System.out.println("main over....");
	}

}
