package javaapplication1.dao;

import javaapplication1.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO {

    private Map<String, Cliente> map;

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public Cliente excluir(String cpf) {
        return this.map.remove(cpf);
    }

    @Override
    public Boolean alterar(Cliente cliente) {
        Cliente clienteCadrastrado = this.map.get(cliente.getCpf());
        if (clienteCadrastrado != null){
            clienteCadrastrado.setNome(cliente.getNome());
            clienteCadrastrado.setTel(cliente.getTel());
            clienteCadrastrado.setNumero(cliente.getNumero());
            clienteCadrastrado.setEnd(cliente.getEnd());
            clienteCadrastrado.setCidade(cliente.getCidade());
            clienteCadrastrado.setEstado(cliente.getEstado());
            return true;
        }
        return false;
    }

    @Override
    public Cliente consultar(String cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
