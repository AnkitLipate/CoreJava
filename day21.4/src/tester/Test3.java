package tester;

import java.io.IOException;

import utils.SynchroUtils;

public class Test3 {
	
	private static boolean exit = false;
	public static void main(String[] args) throws IOException, InterruptedException{
		//create SINGLE instance of 	SynchroUtils
		SynchroUtils util = new SynchroUtils();
		//create 2 thrds using runnable  : lambda expr, pass SAME instance to them, start them
		
		Thread t1 = new Thread(()->{
			while(!exit)
				util.test();
		},"t1");
		
		Thread t2 = new Thread(()->{
			while(!exit)
				util.testMeAgain(); 
		},"t2");
		
		t1.start();
		t2.start();//RUNNABLE
		//t1 : run() : while(!exit) : invoke test method
		//t2 : run() : while(!exit) : invoke test method
		//main : blocked on  i/p : Sysytem.in.read()
		System.out.println("press enter to stop ");
		System.in.read();//main : Blocked on i/p
		//after user press "Enter " : 
		//t1 & t2 : should get over(exit=true)
		System.out.println("stoppin g exce of child thread : exit");
		exit = true;
		//no orphans
		//main over......
		t1.join();
		t2.join();
		System.out.println("main over......");

	}

}
