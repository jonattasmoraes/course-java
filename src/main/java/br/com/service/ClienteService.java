package br.com.service;

import br.com.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

    public String buscar() {
        clienteDao.buscar();
        return "Cliente encontrado";
    }

    public String excluir() {
        clienteDao.excluir();
        return "Cliente excluido com sucesso";
    }

    public String atualizar() {
        clienteDao.atualizar();
        return "Cliente atualizado com sucesso";
    }
}
