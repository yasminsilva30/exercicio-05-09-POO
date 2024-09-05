package com.mycompany.exercicios;

/**
 *
 * @author ester.yasmin
 */
import java.util.Scanner;

public class exercicio4 {

    private double salario;

    public exercicio4(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularImposto() {
        double imposto = 0;

        if (salario <= 2500) {
            imposto = 0;
        } else if (salario <= 5000) {
            imposto = salario * 0.1;
        } else if (salario <= 10000) {
            imposto = salario * 0.2;
        } else {
            imposto = salario * 0.3;
        }

        return imposto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular o imposto de renda!");
        System.out.print("Digite o salário da pessoa: ");
        double salario = scanner.nextDouble();

        exercicio4 pessoa = new exercicio4(salario);

        double imposto = pessoa.calcularImposto();
        System.out.println("Salário informado: R$ " + salario);
        System.out.println("Imposto de Renda a ser pago: R$ " + imposto);

        scanner.close();
    }
}