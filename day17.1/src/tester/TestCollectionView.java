package tester;

import java.util.HashMap;
import java.util.Map.Entry;

import static utils.CollectionUtils.populateMap;
import com.app.banking.BankAccount;

public class TestCollectionView {
	public static void main(String[] args) {
	//get populated sample map
		HashMap<Integer, BankAccount> map = populateMap();
		//extract and display only key : keySet
		System.out.println("Keys :");
		for(int i: map.keySet())//auto unboxing by javac
			System.out.print(i+" ");
		System.out.println();
		//Extract n display only values
		System.out.println("values :");
		for(BankAccount a:map.values())
			System.out.println(a);
		System.out.println("Entries : ");
		//Extract n display both : k n v in a single iteration : entrySet : set<Map.entry<K,V>>
		for(Entry<Integer, BankAccount> e: map.entrySet())
			System.out.println(e.getKey()+":"+e.getValue());
}
}
