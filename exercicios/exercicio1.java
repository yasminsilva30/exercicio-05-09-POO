package com.mycompany.exercicios;

/**
 *
 * @author ester.yasmin
 */
import java.util.Scanner;

public class exercicio1 {

    public double calcularArea(double lado) {
        return lado * lado;
    }
    
    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public double calcularArea(double raio, boolean isCirculo) {
        if (isCirculo) {
            return Math.PI * raio * raio;
        }
        throw new IllegalArgumentException("Para calcular a área de um círculo, o parâmetro booleano deve ser verdadeiro :) ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exercicio1 exercicio1 = new exercicio1();

        System.out.println("Olá! Vamos calcular a área de algumas formas geométricas.");
        System.out.println("Qual forma você gostaria de calcular?");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Círculo");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite o comprimento do lado do quadrado: ");
                double ladoQuadrado = scanner.nextDouble();
                double areaQuadrado = exercicio1.calcularArea(ladoQuadrado);
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;

            case 2:
                System.out.print("Digite a largura do retângulo: ");
                double larguraRetangulo = scanner.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double alturaRetangulo = scanner.nextDouble();
                double areaRetangulo = exercicio1.calcularArea(larguraRetangulo, alturaRetangulo);
                System.out.println("A área do retângulo é: " + areaRetangulo);
                break;

            case 3:
                System.out.print("Digite o raio do círculo: ");
                double raioCirculo = scanner.nextDouble();
                double areaCirculo = exercicio1.calcularArea(raioCirculo, true);
                System.out.println("A área do círculo é: " + areaCirculo);
                break;

            default:
                System.out.println("Ops! Opção inválida :( Por favor, escolha 1, 2 ou 3");
        }

        scanner.close();
    }
}