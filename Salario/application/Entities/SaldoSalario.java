package Salario.application.Entities;

public class SaldoSalario {
     
    public String name;
    public double salarioTotal;
    public double taxa;

    public double netSalary(){
        return salarioTotal - taxa;
    }

    public void aumentoSalary(double PERCENT){
        salarioTotal += salarioTotal * PERCENT / 100.0;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary());
    }

}
