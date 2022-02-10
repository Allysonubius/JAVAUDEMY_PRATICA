package Salario.application;

import java.util.Locale;
import java.util.Scanner;

import Salario.application.Entities.SaldoSalario;

public class application {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        SaldoSalario emp = new SaldoSalario();

        System.out.println();

        System.out.print("Nome: ");
        emp.name = sc.nextLine();
        System.out.print("Salario: ");
        emp.salarioTotal = sc.nextDouble();
        System.out.print("Taxa: ");
        emp.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário(a): " + emp);
        System.out.println();
        System.out.print("Qual porcentagem para aumentar o salario ? ");
        double PERCENT = sc.nextDouble();
        emp.aumentoSalary(PERCENT);

        System.out.println();
        System.out.println("Update data: " + emp);
        System.out.println();

        sc.close();
    }
    
}