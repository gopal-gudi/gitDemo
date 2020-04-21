package p2;

import p1.SameClass;

public class DerivedClassPkgP2  extends SameClass{

	public DerivedClassPkgP2()
	{
		System.out.println("It is a DerivedClassPkgP2's constructor............");
//		System.out.println("private_a    :"+private_a);
//		System.out.println("default_b    :"+default_b);
		System.out.println("public_c    :"+public_c);
		System.out.println("protected_d    :"+protected_d);
	}
}
