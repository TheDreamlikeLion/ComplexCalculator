package calculator;

import complex.Complex;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());
    public static void run(Complex cmplx1, Complex cmplx2) {
        Commands com;
        while (true) {
            String command = prompt("\n*** Доступные команды калькулятора: ***\n" +
                    "\tADD \t- сложение,\n" + "\tMULT\t- умножение,\n" + "\tDIV \t- деление.\n" +
                    "  EXIT - выход.\n" + "Введите команду: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case ADD:
                    LOGGER.info("Cложение комплексных чисел " + cmplx1 + " и " + cmplx2);
                    System.out.println("Результат их сложения:");
                    Complex addResult = cmplx1.add(cmplx2);
                    LOGGER.info("Результат: " + addResult);
                    System.out.println(addResult);
                    break;
                case MULT:
                    LOGGER.info("Умножение комплексных чисел " + cmplx1 + " и " + cmplx2);
                    System.out.println("Результат их умножения:");
                    Complex multResult = cmplx1.multiply(cmplx2);
                    LOGGER.info("Результат: " + multResult);
                    System.out.println(multResult);
                    break;
                case DIV:
                    LOGGER.info("Деление комплексных чисел " + cmplx1 + " и " + cmplx2);
                    System.out.println("Результат их деления:");
                    Complex divResult = cmplx1.multiply(cmplx2);
                    LOGGER.info("Результат: " + divResult);
                    System.out.println(divResult);
                    break;
            }
        }
    }

    public static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine().toUpperCase(Locale.ROOT).replaceAll(" ", "").trim();
    }
}
