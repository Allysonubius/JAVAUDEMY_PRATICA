package Notas.application.entities;

public class Estudante {
    
    public String nome;
    public double primeiroSemestre;
    public double segundoSemestre;
    public double terceiroSemestre;
    public double quartoSemestre;

    public double somaNotasTotal(){
        return primeiroSemestre + segundoSemestre + terceiroSemestre + quartoSemestre;
    }

    public double aprovacaoReprovacao(){
        if((somaNotasTotal() / 4) < 5){
            return somaNotasTotal();
        }else{
            return 0.0;
        }
    }
}
