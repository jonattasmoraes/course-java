package br.com;

import br.com.dao.ContratoDao;
import br.com.dao.IContratoDao;
import br.com.dao.mocks.ContratoDaoMock;
import br.com.service.ContratoService;
import br.com.service.IContratoService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContratoServiceTest {
    // salvar
    @Test
    public void salvar() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        assertEquals("Sucesso", retorno);
    }

    @Test
    public void EsperaErroSalvarBanco() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        assertThrows(UnsupportedOperationException.class, () -> {
            service.salvar();
        });
    }

    // buscar
    @Test
    public void buscarContratoExistenteTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        assertEquals("Contrato encontrado", retorno);
    }

    @Test
    public void EsperaErroBuscarContratoBanco() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        assertThrows(UnsupportedOperationException.class, () -> {
            service.buscar();
        });
    }

    // excluir
    @Test
    public void excluirContratoExistenteTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        assertEquals("Contrato excluido", retorno);
    }

    @Test
    public void EsperaErroExcluirContratoBanco() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        assertThrows(UnsupportedOperationException.class, () -> {
            service.excluir();
        });
    }

    // atualizar
    @Test
    public void atualizarContratoExistenteTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        assertEquals("Contrato atualizado", retorno);
    }

    @Test
    public void EsperaErroAtualizarContratoBanco() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        assertThrows(UnsupportedOperationException.class, () -> {
            service.atualizar();
        });
    }
}
