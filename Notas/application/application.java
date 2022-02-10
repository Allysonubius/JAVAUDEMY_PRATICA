package Notas.application;

import java.util.Locale;
import java.util.Scanner;

import Notas.application.entities.Estudante;

public class application {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Estudante std = new Estudante();

        System.out.println();
        System.out.print("Nome: ");
        std.nome = sc.nextLine();
        System.out.print("Primeiro: ");
        std.primeiroSemestre = sc.nextDouble();
        System.out.print("Segundo: ");
        std.segundoSemestre = sc.nextDouble();
        System.out.print("Terceiro: ");
        std.terceiroSemestre = sc.nextDouble();
        System.out.print("Quarto: ");
        std.quartoSemestre = sc.nextDouble();

        System.out.println();
        System.out.printf("Final Grade: %.2f%n", std.somaNotasTotal() );

        if((std.somaNotasTotal() / 4) < 5){
            System.out.println();
            System.out.println("Falhou");
            System.out.println();
            System.out.printf("Perdido %.2f Pontos%n",  std.somaNotasTotal() - 20);
            System.out.println();
            System.out.println("Sua nota media foi: " + (std.somaNotasTotal() / 4 + " melhore suas notas " + std.nome));
            System.out.println();
        }else{
            System.out.println();
            System.out.println("Voce passou ! Parabens " + std.nome);
            System.out.println();
            System.out.println("Sua nota media foi: " + (std.somaNotasTotal() / 4));
            System.out.println();
        }

        sc.close();
    }
}
