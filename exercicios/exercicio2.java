package com.mycompany.exercicios;

/**
 *
 * @author ester.yasmin
 */
import java.util.Scanner;

public class exercicio2 {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double somar(int a, double b) {
        return a + b;
    }

    public double somar(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exercicio2 exercicio2 = new exercicio2();

        System.out.println("Oi, bem-vindo ao somador mágico!");
        System.out.println("Qual tipo de soma você quer fazer?");
        System.out.println("1. Soma de dois inteiros");
        System.out.println("2. Soma de dois números decimais");
        System.out.println("3. Soma de um inteiro e um número decimal");
        System.out.println("4. Soma de um número decimal e um inteiro");
        
        int escolha = scanner.nextInt();
        double resultado = 0;

        switch (escolha) {
            case 1:
                System.out.print("Digite o primeiro número inteiro: ");
                int inteiro1 = scanner.nextInt();
                System.out.print("Digite o segundo número inteiro: ");
                int inteiro2 = scanner.nextInt();
                resultado = exercicio2.somar(inteiro1, inteiro2);
                System.out.println("A soma dos inteiros é: " + resultado);
                break;

            case 2:
                System.out.print("Digite o primeiro número decimal: ");
                double decimal1 = scanner.nextDouble();
                System.out.print("Digite o segundo número decimal: ");
                double decimal2 = scanner.nextDouble();
                resultado = exercicio2.somar(decimal1, decimal2);
                System.out.println("A soma dos números decimais é: " + resultado);
                break;

            case 3:
                System.out.print("Digite um número inteiro: ");
                int inteiro = scanner.nextInt();
                System.out.print("Digite um número decimal: ");
                double decimal = scanner.nextDouble();
                resultado = exercicio2.somar(inteiro, decimal);
                System.out.println("A soma do inteiro com o número decimal é: " + resultado);
                break;

            case 4:
                System.out.print("Digite um número decimal: ");
                double decimalInput = scanner.nextDouble();
                System.out.print("Digite um número inteiro: ");
                int inteiroInput = scanner.nextInt();
                resultado = exercicio2.somar(decimalInput, inteiroInput);
                System.out.println("A soma do número decimal com o inteiro é: " + resultado);
                break;

            default:
                System.out.println("Ah não! Escolha inválida. Tente novamente com 1, 2, 3 ou 4.");
        }

        scanner.close();
    }
}