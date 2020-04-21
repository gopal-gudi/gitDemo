package main;

import p1.DerivedInP1Pkg;
import p1.IndependentClassinPkgP1;
import p1.SameClass;
import p2.DerivedClassPkgP2;
import p2.IndependentClassPkgP2;

public class MainDemo {

	public static void main(String[] args) {
		//Execute the SameClass Constructor..........
		SameClass sc=new SameClass();
		System.out.println("++++++++++++++++++++++++++++++++++");
		// Execute the DerivedInP1Pkg constructor....
		DerivedInP1Pkg dp1=new DerivedInP1Pkg();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		//Execute the IndependentClassinPkgP1 constructor ...
		IndependentClassinPkgP1 ind1=new IndependentClassinPkgP1();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		//Execute the DerivedClassPkgP2 constructor................
		DerivedClassPkgP2 dp2=new DerivedClassPkgP2();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		//Execute the IndependentClassPkgP2 Constructor...
		IndependentClassPkgP2 ind2=new IndependentClassPkgP2();
	}

}
