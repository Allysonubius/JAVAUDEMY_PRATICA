package Retangulo.application;

import java.util.Locale;
import java.util.Scanner;

import Retangulo.application.Entities.Retangulo;

public class application{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo rect = new Retangulo();

        System.out.println("Entre o valor da largura e altura: ");
        System.out.println();
        System.out.print("Insira o valor da altura: ");
        rect.altura = sc.nextDouble();
        System.out.print("Insira o valor da largura: ");
        rect.largura = sc.nextDouble();
        System.out.println();

        System.out.printf("Area = %.2f%n", rect.area());
        System.out.println();
        System.out.printf("Perimetro = %.2f%n", rect.perimetro());
        System.out.println();
        System.out.printf("Diagonal = %.2f%n", rect.diagonal());
        System.out.println();

        sc.close();
    }
}