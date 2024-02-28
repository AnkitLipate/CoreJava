package utils;

import java.util.Random;

public class SynchroUtils {
	private static Random r1 = new Random();

	public synchronized void test() {
		System.out.println("entred test " + Thread.currentThread().getName());
		try {
			Thread.sleep(r1.nextInt(40) + 100);// 100--139
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("exited test " + Thread.currentThread().getName());
	}

	public synchronized void testMe() {
		System.out.println("entered testMe " + Thread.currentThread().getName());
		try {
			Thread.sleep(r1.nextInt(15) + 20);// 20--34
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("exited testMe " + Thread.currentThread().getName());
	}

	public void testMeAgain() {
		System.out.println("entered testMeAgain " + Thread.currentThread().getName());
		try {
			Thread.sleep(r1.nextInt(50) + 1);// 1--49
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("exited testMeAgain " + Thread.currentThread().getName());
	}

	public synchronized static void test1() {
		System.out.println("entered test1 " + Thread.currentThread().getName());
		try {
			Thread.sleep(r1.nextInt(10) + 1);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("exited test1 " + Thread.currentThread().getName());
	}
	public synchronized static void test2() {
		System.out.println("entered test1 "+Thread.currentThread().getName());
		try {
			Thread.sleep(r1.nextInt(20)+2);
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("exited test1 "+Thread.currentThread().getName());
	}
}
