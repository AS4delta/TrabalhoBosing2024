package com.mycompany.livraria2;

import com.mycompany.livraria2.modelos.Cliente;
import com.mycompany.livraria2.modelos.FormaPagamento;
import com.mycompany.livraria2.modelos.Livro;
import java.util.Date;

public class Venda {
    private Cliente cliente;
    private Livro livro;
    private Date dataVenda;
    private FormaPagamento formaPagamento;

    public Venda(Cliente cliente1, Date dataVenda1, FormaPagamento formaPagamento1) {
        // Construtor vazio
    }

    public Venda(Cliente cliente, Livro livro, Date dataVenda, FormaPagamento formaPagamento) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataVenda = dataVenda;
        this.formaPagamento = formaPagamento;
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    // Método toString para imprimir os detalhes da venda
    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", livro=" + livro +
                ", dataVenda=" + dataVenda +
                ", formaPagamento=" + formaPagamento +
                '}';
    }

    double calcularValorTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void adicionarItem(Livro livro, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
