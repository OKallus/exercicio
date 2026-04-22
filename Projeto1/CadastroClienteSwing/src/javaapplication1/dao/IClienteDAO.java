package javaapplication1.dao;

import javaapplication1.domain.Cliente;

import java.util.Collection;


public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public Cliente excluir(String cpf);

    public Boolean alterar(Cliente cliente);

    public Cliente consultar(String cpf);

    public Collection<Cliente> buscarTodos();
}
