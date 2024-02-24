package thrds3;
import static java.lang.Thread.*;
public class MyRunnableTask implements Runnable {
  
	
	@Override
	public void run() /* throws InterruptedException */ {
		System.out.println(currentThread().getName()+" started");
		try {
		//B>L> : for loop
		for(int i=0; i<10; i++) {
			System.out.println(currentThread().getName()+" exce# "+ i);
			Thread.sleep(500);
		}
		}catch (Exception e) {
			System.out.println(currentThread().getName());
		}
		System.out.println(currentThread().getName()+" Over");
	}
}
