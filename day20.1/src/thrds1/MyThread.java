package thrds1;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);//state : NEW
		start(); // RUNNABLE
	}
	
	@Override
	public void run() /* throws InterruptedException */ {
		System.out.println(getName()+" started");
		try {
		//B>L> : for loop
		for(int i=0; i<10; i++) {
			System.out.println(getName()+" exce# "+ i);
			Thread.sleep(500);
		}
		}catch (Exception e) {
			System.out.println(getName());
		}
		System.out.println(getName()+" Over");
	}
}
