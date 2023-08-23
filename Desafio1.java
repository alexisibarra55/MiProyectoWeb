package Principal;

import java.util.Scanner;

public class DesafioFechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dd = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mm = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int yyyy = scanner.nextInt();

        if (validarFecha(dd, mm, yyyy)) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }
    }

    public static boolean validarFecha(int dd, int mm, int yyyy) {
        if (mm < 1 || mm > 12 || dd < 1 || yyyy < 1900 || yyyy > 2099) {
            return false;
        }

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (esBisiesto(yyyy)) {
            diasPorMes[2] = 29;
        }

        return dd <= diasPorMes[mm];
    }

    public static boolean esBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

