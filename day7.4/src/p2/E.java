package p2;
import p1.A;

// different package non-sub class
class E {
 E() {
	 A a1 = new A();
	 System.out.println("A's state "+a1.i+" "+a1.j+" "+a1.k+" "+a1.l);
}
}
