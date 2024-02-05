package var_args;

public class Test {

	public static void main(String... args) {
		System.out.println("Testing no arg");
		displayNames();//no args
		System.out.println("Testing with Animal[]");
		Animal[] pets = {new Cat("Mojo"), new Horse("Speedy"), new Dog("Casper")};
		displayNames(pets);
		System.out.println("Tested with , separated animals");
		displayNames(new Dog("Bruno"),new Horse("SeaBiscuit"));
	}
	//add static method whic accept var no of args n display the name
	private static void displayNames(Animal... animals )
	{
		for(Animal a:animals)
			System.out.println(a.getName());
	}
}
