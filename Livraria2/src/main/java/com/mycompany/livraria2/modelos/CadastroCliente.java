package com.mycompany.livraria2.modelos;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {
    private List<Cliente> clientes; // Lista para armazenar os clientes

    public CadastroCliente() {
        this.clientes = new ArrayList<>();
    }

    // Classe interna Cliente para armazenar informações do cliente
    public static class Cliente {
        private String nome;
        private String endereco;
        private int cpf;
        private int cnpj;
        private String email;
        private int telefone;

        public Cliente(String nome, String endereco, int cpf, int cnpj, String email, int telefone) {
            this.nome = nome;
            this.endereco = endereco;
            this.cpf = cpf;
            this.cnpj = cnpj;
            this.email = email;
            this.telefone = telefone;
        }

        // Getters aqui (omitidos por brevidade)

        @Override
        public String toString() {
            return "Cliente{" +
                    "nome='" + nome + '\'' +
                    ", endereco='" + endereco + '\'' +
                    ", cpf=" + cpf +
                    ", cnpj=" + cnpj +
                    ", email='" + email + '\'' +
                    ", telefone=" + telefone +
                    '}';
        }
    }

    public void adicionarCliente(String nome, String endereco, int cpf, int cnpj, String email, int telefone) {
        Cliente cliente = new Cliente(nome, endereco, cpf, cnpj, email, telefone);
        this.clientes.add(cliente);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}