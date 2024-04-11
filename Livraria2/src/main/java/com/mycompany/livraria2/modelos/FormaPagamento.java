
package com.mycompany.livraria2.modelos;


public class FormaPagamento {
    
    private String tipo;
    private String numero;

    public FormaPagamento() {
        // Construtor vazio
    }

    public FormaPagamento(String tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
       }

          
