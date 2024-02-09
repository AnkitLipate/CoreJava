package generic;

public class Holder<T> {
// add state which can refer to any primitive type or reference type
	private T reference;
	// constr

	public Holder(T reference) {
	super();
	this.reference = reference;
	}

	//getter
	public T getReference() {
		return reference;
	}

	
}
