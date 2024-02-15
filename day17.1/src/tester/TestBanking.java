package tester;

import static java.time.LocalDate.parse;
import static utils.BankValidationRules.validateBalance;
import static utils.CollectionUtils.findByAcctNo;
import static utils.CollectionUtils.populateMap;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.banking.AcType;
import com.app.banking.BankAccount;

import custom_exceptions.AccountHandlingException;
import custom_exceptions.DupAccountException;

public class TestBanking {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// invoke populate map
			HashMap<Integer, BankAccount> accts = populateMap();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1.Create A/c 2.Display all accts 3.A/c Summary 4.Transfer Funds "
						+ "5.Close A/c 6.Dispaly A/c by type 7.Display accts by balance 8.Remove loan accts "
						+ "9.Print a/cs sorted as per asc a/c nos 10.Print a/cs sorted as per desc a/c nos 100.Exit");
				System.out.println("Enter your option");
				try {
					switch (sc.nextInt()) {
					case 1:// create A/c
						System.out.println("Enter a/c no");
						int acctNo = sc.nextInt();
						if (accts.containsKey(acctNo))// int---> auto boxing -->Integer--->Object
							// =>dup a/c no
							throw new DupAccountException("A/c No Already exists!!!!");
						// => new a/c No
						System.out.println("Enter a/c  type, balance, createionDate(yr-mon-day), customerName");
						accts.put(acctNo, new BankAccount(acctNo, AcType.valueOf(sc.next().toUpperCase()),
								validateBalance(sc.nextDouble()), parse(sc.next()), sc.next()));
						System.out.println("A/C Created......");
						break;

					case 2:
						System.out.println("All A/c Details ");
						for(BankAccount a:accts.values())
							System.out.println(a);
						break;
					case 3:
						System.out.println("Enter A/c NO");
						System.out.println("Bank A/c summary: "+findByAcctNo(sc.nextInt(), accts));
						break;
					case 4://fund transfer
						System.out.println("Enter src a/c no, dest a/c no, transfer Amount ");
						BankAccount src = findByAcctNo(sc.nextInt(), accts);
						//=> src a/c exists
						BankAccount dest = findByAcctNo(sc.nextInt(), accts);
						//=>dest a/c exists
						//proceed to transfer
						src.transferFunds(dest, sc.nextDouble());
						//=> transfer success
						System.out.println("Funds transfer successful");
						break;
					case 5://close a/c
						System.out.println("Enter A/c No: ");
						BankAccount a = accts.remove(sc.nextInt());
						if(a == null)
							throw new AccountHandlingException("A/c closing failed : invalid a/c No");
						System.out.println("Closed A/c : "+a);
						break;
					case 6://Display all account details of specific  account type
						//	searching criteria is value based, so had to convert map--->Collection view
						System.out.println("Enter A/c type");
						AcType acctType = AcType.valueOf(sc.next().toUpperCase());
						System.out.println("A/c details for A/C Type "+acctType);
						for(BankAccount a1:accts.values())
							if(a1.getType() == acctType)
								System.out.println();
						break;
					case 7://seach A/cs bybalance > speccific balance display there details.
						System.out.println("Enter balance");
						double bal = sc.nextDouble();
						//searching criteria is value based (balance), so have to convert map---> Collection view.
						for(BankAccount a1 : accts.values())
							if(a1.getBalance()> bal)
								System.out.println(a1);
						break;
					case 8://Remove all loan accounts.
						Collection<BankAccount> acctsCollection = accts.values();
//						for(BankAccount a1: acctsCollection)
//							if(a1.getType()==AcType.LOAN)
//								acctsCollection.remove(a1);		
						//attached explicit iterator
						Iterator<BankAccount> itr = acctsCollection.iterator();
						while(itr.hasNext()) {
							if(itr.next().getType()==AcType.LOAN)
								itr.remove();
						}
						break;
					case 9://Print a/cs sorted as per asc a/c nos
						//since sorting criteria is key based(accts no)	: can be done ussing TreeMap
						//Ctor : TreeMap(Map<? xtends K, ?extends V> map)
						TreeMap<Integer,BankAccount> sortedAccts = new TreeMap<>(accts);
						//jvm Invokes for sorting integer's compareTo
//						TreeMap<Integer, BankAccount> sortedAccts = new TreeMap<>();
//						//to populate the TreeMap from HM : putAll
//						sortedAccts.putAll(accts);
						System.out.println("sorted accts as per asc a/c nos");
						for(BankAccount a1: sortedAccts.values())
							System.out.println(a1);
						break;
					case 10://Print a/cs sorted as per desc a/c nos
						//key based sorting BUT custom ordering
						//TreeMap(Comparator<? suoer K> comp
						TreeMap<Integer, BankAccount> sortedAccts2 = new TreeMap<>(new Comparator<Integer>() {

							@Override
							public int compare(Integer o1, Integer o2) {
								System.out.println("in compare : desc acct no");
								return o2.compareTo(o1);
							}
							
						});
						System.out.println(sortedAccts2);
						sortedAccts2.putAll(accts);//ccopies all entries from HM
						System.out.println("Sorted Accts as per desc accts no");
						for(BankAccount a1: sortedAccts2.values())
							System.out.println(a1);
						break;
					case 100:
						exit=true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// read off pending i/ps from scanner
				sc.nextLine();
			}
		}

	}

}
