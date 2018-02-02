package com.companybitmix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("ingrese un numero");
        String valor = scanner.nextLine();
        int n = Integer.parseInt(valor);
        Numero miNumero = new Numero(n);
        System.out.println("El numero que usten ingrese es " + miNumero.esPar());
        System.out.println(miNumero.primo(n));
}
}
