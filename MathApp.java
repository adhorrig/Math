/*
*MathApp.java
*@author Adam.H 13735825
*7th November 2013
*/

import javax.swing.JOptionPane;
public class MathApp{
	public static void main (String args[]){
		//declare variables
		int x; double ans; int y;

		//decalre objects
		Math myMath;

		//crate objects
		myMath = new Math();

		//input Q1
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Q1\nPlease enter a value for x, where x will be put into functions"));

		//output Q1
		System.out.println("The answer to the inverse of 3(" + x + ")+2 is: " + myMath.Q1(x));
		System.out.println("The answer to the inverse of 8(" + x + ")^3 is: " + myMath.Q1b(x));
		System.out.println("The answer to f(f("+ x + ")) is: " + myMath.fof(x));
		System.out.println("The answer to g(g("+ x + ")) is: " + myMath.gog(x));
		System.out.println("The answer to f(g("+ x + ")) is: " + myMath.fog(x));
		System.out.println("The answer to g(f("+ x + ")) is: " + myMath.gof(x));
		System.out.println("The answer to fINVERSE(f("+ x + ")) is: " + myMath.fINof(x));
		System.out.println("The answer to gINVERSE(g("+ x + ")) is: " + myMath.gINog(x));

		//input Q2
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Q2\nPlease enter a value for x, to find the conjunction and disjunction of p(x) and q(y)"));
		y = Integer.parseInt(JOptionPane.showInputDialog(null,"Q2\nPlease enter a value for y, to find the conjunction and disjunction of p(x) and q(y), and the negation of q(y)"));

		//process + output Q2.

		boolean conjunction = myMath.p(x) && myMath.q(y);
		System.out.println("The conjunction is " + conjunction);
		boolean disjunction = myMath.p(x) && myMath.q(y);
		System.out.println("The disjunction is " + disjunction);
		boolean negation = !myMath.q(y);
		System.out.println("The negation is " + negation);






	}
}

