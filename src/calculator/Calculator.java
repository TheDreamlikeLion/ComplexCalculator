package calculator;

import complex.Complex;
import calculator.Commands;
import utils.ComplexPrintOut;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void run(Complex cmplx1, Complex cmplx2) {
        Commands com;
        while (true) {
            String command = prompt("*** Доступные команды калькулятора: ***\n" +
                    "\tADD \t- сложение,\n" + "\tMULT\t- умножение,\n" + "\tDIV \t- деление.\n" +
                    "  EXIT - выход.\n" + "Введите команду: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case ADD:
                    System.out.println("Результат их сложения:");
                    ComplexPrintOut.println(cmplx1.add(cmplx2));
                    break;
                case MULT:
                    System.out.println("Результат их умножения:");
                    ComplexPrintOut.println(cmplx1.multiply(cmplx2));
                    break;
                case DIV:
                    System.out.println("Результат их деления:");
                    ComplexPrintOut.println(cmplx1.divide(cmplx2));
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
