package program;

import calculator.Calculator;
import complex.Complex;
import utils.ComplexGenerator;
import utils.ComplexPrintOut;

import java.util.Random;

public class Program {
    public static void run() {
        Random rand = new Random();

        Complex cmplx1 = ComplexGenerator.nextComplex(rand);
        rand.nextDouble();
        Complex cmplx2 = ComplexGenerator.nextComplex(rand);

        System.out.println("Заданы два рандомных комплексных числа:");
        ComplexPrintOut.print(cmplx1);
        System.out.print("   и   ");
        ComplexPrintOut.print(cmplx2);
        System.out.println(" .\nДавайте посчитаем!\n");

        Calculator.run(cmplx1, cmplx2);
    }
}
