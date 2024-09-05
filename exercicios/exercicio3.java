package com.mycompany.exercicios;

/**
 *
 * @author ester.yasmin
 */
import java.util.Scanner;

public class exercicio3 {

    private String nome;
    private String codigo;
    private double preco;

    public exercicio3(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Código do produto: " + codigo);
        System.out.println("Preço: R$ " + preco);
    }

    public void exibirInformacoes(boolean apenasNomeEPreco) {
        if (apenasNomeEPreco) {
            System.out.println("Nome: " + nome);
            System.out.println("Preço: R$ " + preco);
        } else {
            exibirInformacoes();
        }
    }

    public void exibirInformacoes(int codigoOpcional) {
        if (codigoOpcional == 1) {
            System.out.println("Código do produto: " + codigo);
        } else {
            exibirInformacoes();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos cadastrar um produto!");
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        exercicio3 produto = new exercicio3(nome, codigo, preco);

        System.out.println("Como você quer visualizar as informações do produto?");
        System.out.println("1. Todas as informações");
        System.out.println("2. Só o nome e o preço");
        System.out.println("3. Só o código");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                produto.exibirInformacoes();
                break;

            case 2:
                produto.exibirInformacoes(true);
                break;

            case 3:
                produto.exibirInformacoes(1);
                break;

            default:
                System.out.println("Ops! Escolha inválida :( Tente novamente e escolha 1, 2 ou 3");
        }

        scanner.close();
    }
}