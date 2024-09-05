package com.mycompany.exercicios;
/**
 *
 * @author ester.yasmin
 */
import java.util.Scanner;

abstract class Animal {
    public abstract void fazerSom();
    public abstract void mover();
    public void descricao() {
        System.out.println("Este é um animal.");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo feliz.");
    }

    @Override
    public void descricao() {
        System.out.println("Este é um cachorro adorável.");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato faz: Miau!");
    }

    @Override
    public void mover() {
        System.out.println("O gato pula elegantemente.");
    }

    @Override
    public void descricao() {
        System.out.println("Este é um gato charmoso.");
    }
}

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Vamos descobrir mais sobre alguns animais.");
        System.out.println("Escolha o tipo de animal que você quer conhecer:");
        System.out.println("1. Cachorro");
        System.out.println("2. Gato");
        
        int escolha = scanner.nextInt();
        scanner.nextLine(); 

        Animal animal;

        switch (escolha) {
            case 1:
                animal = new Cachorro();
                break;
            case 2:
                animal = new Gato();
                break;
            default:
                System.out.println("Ops! Escolha inválida. Tente novamente com 1 ou 2.");
                scanner.close();
                return;
        }

        animal.descricao();
        animal.fazerSom();
        animal.mover();

        scanner.close();
    }
}