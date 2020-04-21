package p2;

import p1.SameClass;

public class IndependentClassPkgP2 {
	
	SameClass sc=new SameClass();
	public IndependentClassPkgP2()
	{
		System.out.println("It is a IndependentClassinPkgP1's constructor............");
//		System.out.println("private_a    :"+sc.private_a);
//		System.out.println("default_b    :"+sc.default_b);
		System.out.println("public_c    :"+sc.public_c);
//		System.out.println("protected_d    :"+sc.protected_d);
	}

}
