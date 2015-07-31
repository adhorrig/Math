/*
*myMathApp.java
*@author Adam.H 13735825
*7th November 2013
*/

public class Math{

		//declaring variables
		private double x,y;

		static double f(double x){
			return (3*x)+2;
		}

		static double g(double x){
			return (8*x*x*x);
		}

		static double gIN(double x){ //IN stands for inverse
			return ((java.lang.Math.cbrt(x)/2));
		}

		static double fIN(double x){ //IN stands for inverse
			return ((x-2)/3);
		}

		//constructor
		public Math(){
			x=0.0;
		}

		//set methods
		public void setX (double x){
			this.x=x;
		}

		//Q1//
		//inverse of f(x) when f(x) = 3x+2.
		public double Q1(double x){
			return (x-2)/3;
		}

		//inverse of g(x) when g(x) = 8x^3.
		public double Q1b (double x){
			return (java.lang.Math.cbrt(x) ) / 2;
		}
		// (i) f o f = f(f(x));
		public double fof(double x){
			return f(f(x));
		}

		// (ii) g o g = g(g(x));
		public double gog(double x){
			return g(g(x));
		}

		// (iii) f o g = g(f(x));
		public double fog(double x){
			return g(f(x));
		}

		// (iv) g o f = f(g(x));
		public double gof(double x){
			return f(g(x));
		}

		// (v) f inverse o f = f(fIN(x))
		public double fINof(double x){
			return  f(fIN(x));
		}


		// (vi) g inverse o g = g(gIN(x))
		public double gINog(double x){
			return g(gIN(x));
		}

		//Q2.//
		public boolean p(double x) {
		    return x % 2 == 1; //test if the number is odd
		}
		public boolean q(double y) {
		    return y > 5;
		}

	}

