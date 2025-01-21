package edu.lucaslowhandev.java.exercicio1.domain;

public enum TipoPagamento {
    PIX{
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.07;
        }

    },
    CREDITO{
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.01;
        }
    },
    DEBITO{
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}
