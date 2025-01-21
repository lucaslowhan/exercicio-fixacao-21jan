package edu.lucaslowhandev.java.exercicio2.domain;

public class Aluno {
    protected String nome;
    protected int matricula;
    protected int contador = 0;
    protected double nota1, nota2, nota3;

    public Aluno(String nome) {
        this.nome = nome;
        this.matricula = contador++;
    }

    public void calcularMedia(){
        double media = (nota1 + nota2 + nota3)/3;
        System.out.println("A média do aluno foi: " + media);
    }

    public void verificarAprovacao(){
        double media = (nota1+nota2+nota3)/3;
        if(media>=7.0){
            System.out.println("Aluno aprovado.");
        }else{
            System.out.println("Reprovado");
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
