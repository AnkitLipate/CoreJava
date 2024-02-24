package thrds3;
import static java.lang.Thread.*;
public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main threads details: "+currentThread());//Thread[main,5,main]
		//1 main thread
		//parent thrds : main will be used to created child thrds
		//create instance of the runnable task
		MyRunnableTask task = new MyRunnableTask();
		//Thread(Runnable instance, String name)
		Thread t1 = new Thread(task, "one");//one : NEW
		Thread t2 = new Thread(task, "two");
		Thread t3 = new Thread(task, "three");
		Thread t4 = new Thread(task, "four");//four : NEW, how many RUNNABLE thrds : 1
		t1.start();
		t2.start();
		t3.start();
		t4.start();// how many runnable threads : 5
		
		//delay loop to simulate main's B.L 
		for(int i=0; i<10; i++) {
			System.out.println(currentThread().getName()+" exce# "+i);
			Thread.sleep(200);//BLOCKED on sleep
		}
		//t1.start(); //main thrd get exception : IllegalThreadStateExce(dead thrd can't be started)
		System.out.println(t1.isAlive()+" "+t4.isAlive());//true true
		System.out.println("mai waiting for child theads o complete exec : to ensure no orphans");
		t1.join();//main waiting for t1 to complete execution : Blocked on join()
		t2.join();//main waiting for t2 to complete execution : Blocked on join()
		t3.join();//main waiting for t3 to complete execution : Blocked on join()
		t4.join();//main waiting for t4 to complete execution : Blocked on join()
		System.out.println(t1.isAlive()+" "+t4.isAlive());//false false
		System.out.println("main over.....");
	}

}
