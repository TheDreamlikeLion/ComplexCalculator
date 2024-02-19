package utils;

import complex.Complex;
import java.util.Random;

public class ComplexGenerator {
    static double min = 0.0;
    static double max = 10.0;

    public static Complex nextComplex(Random rand) {
        double randomReal = min + (max - min)*rand.nextDouble();
        double randomImaginary = min + (max - min)*rand.nextDouble();
        return (new Complex(randomReal, randomImaginary));
    }
}