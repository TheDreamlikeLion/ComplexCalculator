package program;

import calculator.Calculator;
import complex.Complex;
import utils.ComplexGenerator;

import java.util.Random;
import java.util.logging.Logger;

public class Program {
    private static final Logger LOGGER = Logger.getLogger(Program.class.getName());
    public static void run() {
        Random rand = new Random();

        Complex cmplx1 = ComplexGenerator.nextComplex(rand);
        rand.nextDouble();
        Complex cmplx2 = ComplexGenerator.nextComplex(rand);

        System.out.println("Заданы два рандомных комплексных числа:");
        System.out.print(cmplx1 + "   и   " + cmplx2 + " .\n");
        LOGGER.info("Сгенерированы комплексных чисел " + cmplx1 + " и " + cmplx2);
        System.out.println("Давайте посчитаем!");

        Calculator.run(cmplx1, cmplx2);
    }
}
