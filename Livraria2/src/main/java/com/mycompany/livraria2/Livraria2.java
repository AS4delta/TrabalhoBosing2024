package com.mycompany.livraria2;

import com.mycompany.livraria2.modelos.Cliente;
import com.mycompany.livraria2.modelos.FormaPagamento;
import com.mycompany.livraria2.modelos.Livro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Livraria2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Verificar se o cliente tem cadastro
        System.out.println("Você já é cliente cadastrado? (S/N)");
        String respostaCadastro = scanner.nextLine();
        Cliente cliente;
        if (respostaCadastro.equalsIgnoreCase("S")) {
            cliente = new Cliente("Maria", "maria@example.com", "987654321");
        } else {
            System.out.println("Digite seu nome:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Digite seu e-mail:");
            String emailCliente = scanner.nextLine();
            System.out.println("Digite seu telefone:");
            String telefoneCliente = scanner.nextLine();
            cliente = new Cliente(nomeCliente, emailCliente, telefoneCliente);
        }

        // Cadastrar livros disponíveis
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 50.0);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, 45.0);
        Livro livro3 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967, 55.0);

        // Criar lista de livros disponíveis
        List<Livro> livrosDisponiveis = new ArrayList<>();
        livrosDisponiveis.add(livro1);
        livrosDisponiveis.add(livro2);
        livrosDisponiveis.add(livro3);

        // Exibir livros disponíveis
        System.out.println("Livros Disponíveis:");
        for (int i = 0; i < livrosDisponiveis.size(); i++) {
            Livro livro = livrosDisponiveis.get(i);
            System.out.println((i + 1) + ". " + livro.getTitulo() + " - Preço: R$ " + livro.getPreco());
        }

        // Cliente escolhe os livros a serem comprados
       List<Livro> livrosSelecionados = new ArrayList<>();
while (true) {
    System.out.println("Digite o número do livro que deseja comprar (0 para finalizar):");
    int escolha = scanner.nextInt();
    scanner.nextLine(); // Consumir a quebra de linha

    if (escolha == 0) {
        break;
    } else if (escolha > 0 && escolha <= livrosDisponiveis.size()) {
        livrosSelecionados.add(livrosDisponiveis.get(escolha - 1));
    }
}

        // Calcular o valor total da compra
        double valorTotalCompra = 0;
        for (Livro livro : livrosSelecionados) {
            valorTotalCompra += livro.getPreco();
        }
        System.out.println("Valor Total da Compra: R$ " + valorTotalCompra);

       // Escolher forma de pagamento (Débito ou Crédito)
System.out.println("Escolha a forma de pagamento (D - Débito / C - Crédito):");
String formaPagamentoEscolhida = scanner.next();
FormaPagamento formaPagamento;
if (formaPagamentoEscolhida.equalsIgnoreCase("D")) {
    formaPagamento = new FormaPagamento("Débito", "123456789");
} else {
    formaPagamento = new FormaPagamento("Crédito", "987654321");
}

// Registrar a venda
Date dataVenda = new Date();
Venda venda = new Venda(cliente, dataVenda, formaPagamento);
for (Livro livro : livrosSelecionados) {
    venda.adicionarItem(livro, 1); // Adiciona 1 unidade de cada livro selecionado
}

// Exibir mensagem de venda finalizada
System.out.println("Venda Finalizada");
    }
}
