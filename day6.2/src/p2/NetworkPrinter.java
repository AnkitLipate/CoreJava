package p2;

public class NetworkPrinter implements Printable{
	//MUST implement, inherited abstract functionality
	@Override
	public void print(String mesg)
	{
		System.out.println("Sending "+mesg+" from client ---> server in NetworkPrinter");
	}
	public void encryptData(String mesg)
	{
		System.out.println("Encripting the mesg : "+mesg);
	}
}
