package edu.desu.datastructs.partA;
import java.lang.Math;
public class ScientificCalculator {

    // This method should add two numbers: x and y, and return the result.
    public double add(double x, double y){
        return x + y;
    }

    // This method should subtract y from x and return the result.
    public double subtract(double x, double y){
        return x - y;
    }

    // This method should multiply x by y and return the result.
    public double multiply(double x, double y){
        return x * y;
    }

    // This method should divide x by y and return the result.
    // Remember to handle the case when y is zero to avoid division by zero.
    public double divide(double x, double y){
        if (x == 0 || y == 0) {
            throw new ArithmeticException("You cannot divide by zero.");
        } else {
            return x / y;
        }
    }

    // This method should return the sine of x.
    public double sin(double x){
        return Math.sin(x);
    }

    // This method should return the cosine of x.
    public double cos(double x){
        return Math.cos(x);
    }

    // This method should return the tangent of x.
    public double tan(double x){
        return Math.tan(x);
    }

    // This method should raise x to the power of e and return the result.
    public double exponent(double x, double e){
        return Math.pow(x,e);
    }

    // This method should return the natural logarithm (base e) of x.
    // Remember to handle cases where x is negative or zero.
    public double logarithm(double x){
        if (x <= 0){
            throw new ArithmeticException("You cannot divide by zero.");
        }
        return Math.log(x);
    }
}
