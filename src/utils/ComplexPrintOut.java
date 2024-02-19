package utils;

import complex.Complex;

public class ComplexPrintOut {
    public static void print(Complex cmplx) {
        System.out.print(cmplx.getReal());
        System.out.print(" + ");
        System.out.print(cmplx.getImaginary() + "*i");
    }

    public static void println(Complex cmplx) {
        System.out.print(cmplx.getReal());
        System.out.print(" + ");
        System.out.print(cmplx.getImaginary() + "*i");
        System.out.println();
    }
}
