package utils;

import complex.Complex;
import java.util.Random;

public class ComplexGenerator {
    static Random r = new Random();
    static double randomReal = r.nextDouble();
    static double randomImaginary = r.nextDouble();

    public static Complex nextComplex() {
        return (new Complex(randomReal, randomImaginary));
    }
}