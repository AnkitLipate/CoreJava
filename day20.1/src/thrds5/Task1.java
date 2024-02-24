package thrds5;

public class Task1 implements Runnable {
	private Thread t2;
	
	public Task1(Thread t2) {
		super();
		this.t2 = t2;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");

		try {
			t2.join();//t1 : blocked on join
			System.out.println(Thread.currentThread().getName()+" continues....");
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}//t1 : dead

}
