package edu.lucaslowhandev.java.exercicio1.domain;

public class Produto implements DescontoPagamento {
    protected String nome;
    protected double preco;
    protected int quantidadeEstoque;
    protected TipoPagamento tipoPagamento;
    @Override
    public void calcularDesconto() {
        System.out.println("Desconto: " + tipoPagamento.calcularDesconto(preco));
    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
        System.out.println("Estoque atualizado");
        System.out.println("Foram adicionados " + quantidade + " ao estoque.");
        System.out.println("Estoque atual: " + this.quantidadeEstoque);
    }

    public void removerEstoque(int quantidade) {
        this.quantidadeEstoque -= quantidade;
        System.out.println("Estoque atualizado");
        System.out.println("Foram removidos " + quantidade + " do estoque.");
        System.out.println("Estoque atual: " + this.quantidadeEstoque);
    }

    public void calcularValorEstoque() {
        double valorTotalEstoque = (double) this.quantidadeEstoque * this.preco;
        System.out.println("VALOR TOTAL DO ESTOQUE DE " + this.nome + ", é: " + valorTotalEstoque);
        System.out.println("ESTOQUE: " + this.quantidadeEstoque + "UN - " + this.nome);
        System.out.println("Valor unitario: " + this.preco);
    }
}
