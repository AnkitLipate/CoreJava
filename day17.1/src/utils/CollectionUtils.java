package utils;

import static com.app.banking.AcType.*;
import static java.time.LocalDate.parse;
import java.util.HashMap;

import com.app.banking.BankAccount;

import custom_exceptions.AccountHandlingException;

public class CollectionUtils {

	// add static method to return populated map of bank accts
	public static HashMap<Integer, BankAccount> populateMap() {
		// create empty map
		HashMap<Integer, BankAccount> map = new HashMap<>();
		// int acctNo, AcType type, double balance, LocalDate createionDate, String
		// customerName
		// customer Name
		System.out
				.println("Added: put " + map.put(10, new BankAccount(10, SAVING, 5000, parse("2010-04-23"), "Reema")));
		System.out.println(
				"Added: put " + map.put(101, new BankAccount(101, CURRENT, 3500, parse("2011-06-21"), "Sameer")));

		System.out.println(
					"Added: put " + map.put(76, new BankAccount(76, LOAN, 150000, parse("2009-04-01"), "Mohan")));
		System.out.println(
				"Added: put " + map.put(77, new BankAccount(77, LOAN, 170000, parse("2010-04-01"), "Madhura")));
	
		System.out
				.println("Added: put " + map.put(56, new BankAccount(56, SAVING, 7800, parse("2020-04-07"), "Meera")));

		System.out.println("Added: put " + map.put(10, new BankAccount(10, SAVING, 9500, parse("2015-11-23"), "Riya")));
		System.out.println(map);// {4 entries}
		return map;
	}

	// add static method to return a/c details or throw exc
	public static BankAccount findByAcctNo(int accNo, HashMap<Integer, BankAccount> map)
			throws AccountHandlingException {
		BankAccount a = map.get(accNo);
		if (a == null)
			throw new AccountHandlingException("Invalid A/c No !!!!!!!");
		return a;
	}
}
