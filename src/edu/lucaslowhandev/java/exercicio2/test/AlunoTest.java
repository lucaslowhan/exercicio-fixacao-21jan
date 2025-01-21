package edu.lucaslowhandev.java.exercicio2.test;

import edu.lucaslowhandev.java.exercicio2.domain.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas");
        aluno.setNota1(8.0);
        aluno.setNota2(6.0);
        aluno.setNota3(6.0);
        aluno.calcularMedia();
        aluno.verificarAprovacao();

    }
}
