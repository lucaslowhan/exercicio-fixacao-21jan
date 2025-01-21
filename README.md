# Exercícios de POO em Java

Este repositório contém dois exercícios práticos para reforçar os conceitos de **Programação Orientada a Objetos (POO)** em Java. Os exercícios abordam aspectos como criação de classes, métodos, encapsulamento e manipulação de objetos.

---

## Exercício 1: Cadastro de Produtos

### Descrição

Neste exercício, você deve implementar uma classe `Produto` com os seguintes atributos e métodos:

### Atributos
- `nome` (String): Nome do produto.
- `preco` (double): Preço do produto.
- `quantidadeEstoque` (int): Quantidade em estoque.

### Métodos
1. **Construtor**: Para inicializar todos os atributos.
2. **getters e setters**: Para acessar e modificar os atributos.
3. **calcularValorEstoque()**: Retorna o valor total do estoque (preço * quantidadeEstoque).
4. **adicionarEstoque(int quantidade)**: Adiciona uma quantidade ao estoque.
5. **removerEstoque(int quantidade)**: Remove uma quantidade do estoque, verificando se há estoque suficiente.

### Tarefa
Na classe principal (`Main`):
- Crie um objeto da classe `Produto`.
- Teste os métodos criados e exiba os resultados no console.

---

## Exercício 2: Sistema de Alunos

### Descrição

Neste exercício, você deve implementar uma classe `Aluno` com os seguintes atributos e métodos:

### Atributos
- `nome` (String): Nome do aluno.
- `matricula` (String): Matrícula do aluno.
- `nota1`, `nota2`, `nota3` (double): Notas do aluno.

### Métodos
1. **Construtor**: Para inicializar o nome e a matrícula. As notas podem ser inicializadas com valor padrão 0.
2. **getters e setters**: Para acessar e modificar os atributos.
3. **calcularMedia()**: Retorna a média das três notas.
4. **verificarAprovacao()**: Retorna `true` se a média for maior ou igual a 7, e `false` caso contrário.

### Tarefa
Na classe principal (`Main`):
- Crie objetos da classe `Aluno`.
- Simule a entrada de notas.
- Exiba a média e o status de aprovação no console.

---

## Como Usar

1. Clone este repositório:
   ```bash
   git clone https://github.com/lucaslowhan/exercicio-fixacao-21jan.git
   ```
2. Abra o projeto em sua IDE favorita (Eclipse, IntelliJ IDEA, etc.).
3. Implemente os exercícios conforme descrito.
4. Compile e execute as classes principais para testar suas soluções.

---

## Tecnologias Utilizadas

- **Java**: Linguagem de programação.
- **IDE**: Use qualquer ambiente de desenvolvimento Java.

---

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou enviar sugestões via issues.

---


Divirta-se codando!
