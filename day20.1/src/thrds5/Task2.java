package thrds5;

public class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		int counter = 0;
		try {
			while (true) {
				System.out.println(Thread.currentThread().getName() + " exce " + (counter++));
				Thread.sleep(300);//t2 : InterruptedException : un blocked
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}//t2 : dead  

}
