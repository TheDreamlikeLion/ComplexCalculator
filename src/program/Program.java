package program;

import calculator.Calculator;
import complex.Complex;
import utils.ComplexGenerator;

public class Program {
    public static void run() {
        Complex cmplx1 = ComplexGenerator.nextComplex();
        Complex cmplx2 = ComplexGenerator.nextComplex();

        System.out.println("Заданы два рандомных комплексных числа:");
        System.out.println(cmplx1 + "   и   " + cmplx2 + " .\n");

        Calculator.run(cmplx1, cmplx2);
    }
}
