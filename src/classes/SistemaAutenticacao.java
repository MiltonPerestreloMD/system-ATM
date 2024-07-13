/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */

public class SistemaAutenticacao {
    private List<Cliente> clientes;

    public SistemaAutenticacao() {
        clientes = new ArrayList<>();
        // Adicionando alguns clientes para teste
        clientes.add(new Cliente("001", "aaaa", "senha123"));
        clientes.add(new Cliente("002", "bbbb", "senha123"));
        clientes.add(new Cliente("001", "cccc", "senha123"));
        clientes.add(new Cliente("002", "dddd", "senha123"));
    }

    public boolean autenticar(String agencia, String conta, String senha) {
        for (Cliente cliente : clientes) {
            if (cliente.getAgencia().equals(agencia) && 
                cliente.getConta().equals(conta) && 
                cliente.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
}
