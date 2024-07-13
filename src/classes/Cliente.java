/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author PC
 */
public class Cliente {
    private String agencia;
    private String conta;
    private String senha;

    public Cliente(String agencia, String conta, String senha) {
        this.agencia = agencia;
        this.conta = conta;
        this.senha = senha;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public String getSenha() {
        return senha;
    }
}
