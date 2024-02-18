package calculator;

import complex.Complex;
import calculator.Commands;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void run(Complex cmplx1, Complex cmplx2) {
        Commands com;
        while (true) {
            String command = prompt("------------------------------------\n" +
                    "\tADD - сложение,\n" + "\tMULT - умножение,\n" + "\tDIV - деление.\n" +
                    "  EXIT - выход.\n" + "Введите команду: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case ADD:
                    System.out.println("Результат их сложения:");
                    System.out.println(cmplx1.add(cmplx2));
                    System.out.println("-----------------------------------\n");
                    break;
                case MULT:
                    System.out.println("Результат их усножения:");
                    System.out.println(cmplx1.multiply(cmplx2));
                    System.out.println("-----------------------------------\n");
                    break;
                case DIV:
                    System.out.println("Результат их деления:");
                    System.out.println(cmplx1.divide(cmplx2));
                    System.out.println("-----------------------------------\n");
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
