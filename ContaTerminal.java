package com.hickos;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeDoCliente;
        double saldo;

        System.out.println("Por favor digite seu nome");
        nomeDoCliente = scanner.nextLine();


        System.out.println("Por favor digite o numero da agencia");
        agencia = scanner.nextLine();


        System.out.println("Por favor digite o numero da conta");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor digite o seu saldo");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta " +
                "numero %d e seu saldo %.2f já esta disponivel para saque",
                nomeDoCliente, agencia, numero, saldo);

    }
}
