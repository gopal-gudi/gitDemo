package p1;

public class SameClass {

	private int private_a=10;
	int default_b=20;
	public int public_c=30;
	protected int protected_d=40;
	
	public SameClass()
	{
		System.out.println("It is a SameClass's constructor............");
		System.out.println("private_a    :"+private_a);
		System.out.println("default_b    :"+default_b);
		System.out.println("public_c    :"+public_c);
		System.out.println("protected_d    :"+protected_d);
	}
}
