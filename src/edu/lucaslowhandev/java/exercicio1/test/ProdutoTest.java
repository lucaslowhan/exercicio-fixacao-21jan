package edu.lucaslowhandev.java.exercicio1.test;

import edu.lucaslowhandev.java.exercicio1.domain.Produto;
import edu.lucaslowhandev.java.exercicio1.domain.Televisao;
import edu.lucaslowhandev.java.exercicio1.domain.TipoPagamento;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Televisao("TV 50'",5799.00,50);
        produto.calcularValorEstoque();
        produto.setTipoPagamento(TipoPagamento.CREDITO);
        produto.calcularDesconto();
    }
}
