package com.companybitmix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("ingrese un numero");
            String valor = scanner.nextLine();
            n = Integer.parseInt(valor);
            System.out.println("que opcion quiere ?");
            System.out.println("1 para saber si es par");
            System.out.println("2 para saber si es primo");
            System.out.println("3 para saber si es farctorial");
            String valor2 = scanner.nextLine();
            m = Integer.parseInt(valor2);
            Numero miNumero = new Numero(n);
            if (m == 1) {
                System.out.println(miNumero.esPar());
            }
            if (m == 2) {
                System.out.println(miNumero.primo());
            }
            if (m == 3) {
                System.out.println(miNumero.factorial());
            }


        }
        while (n != 0);
    }
}
