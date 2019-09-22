/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure_rational;

/**
 *
 * @author omar kishko
 */
public class Rational {

    public Rational() {
        // ADD CODE TO THE CONSTRUCTOR
    }

    public Rational(int n, int d) {
        // ADD CODE TO THE ALTERNATE CONSTRUCTOR
    }

    public int getNumerator() {
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return 0;
    }

    public int getDenominator() {
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return 0;
    }

    public Rational negate() {
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }

    public Rational invert() {
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }

    public Rational add(Rational other) {
        // ADD NEW CODE AND CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }

    public Rational subtract(Rational other) {
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }

    public Rational multiply(Rational other) {
        // ADD NEW CODE AND CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }

    public Rational divide(Rational other) {
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }

    private void normalize() {
//        int absNumerator = Math.abs(numerator);
//        int absDenominator = Math.abs(denominator);
//        int signDenominator = denominator/absDenominator;
//        
//        int divideBy = gcd(absNumerator, absDenominator);
//        numerator = (numerator / divideBy) * signDenominator;
//        denominator = (denominator / divideBy) * signDenominator;
    }

    /**
     * Recursively compute the greatest common divisor of two positive integers
     *
     * @param a the first argument of gcd
     * @param b the second argument of gcd
     * @return the gcd of the two arguments
     */
    private int gcd(int a, int b) {
        int result = 0;
        if (a < b) {
            result = gcd(b, a);
        } else if (b == 0) {
            result = a;
        } else {
            int remainder = a % b;
            result = gcd(b, remainder);
        }
        return result;
    }
}
