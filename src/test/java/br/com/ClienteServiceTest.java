package br.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import br.com.dao.ClienteDao;
import br.com.dao.mocks.ClienteDaoMock;
import br.com.service.ClienteService;

public class ClienteServiceTest {
    // salvar
    @Test
    public void salvarTeste() {

        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        assertEquals("Sucesso", retorno);
    }

    @Test
    public void erroAoSalvarTeste() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        assertThrows(UnsupportedOperationException.class, () -> {
            service.salvar();
        });
    }

    // buscar
    @Test
    public void buscarClienteExistenteTeste() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String resultado = service.buscar();
        assertEquals("Cliente encontrado", resultado);
    }

    @Test
    public void buscarClienteNaoExistenteTeste() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        assertThrows(UnsupportedOperationException.class, () -> {
            service.buscar();
        });
    }

    // excluir
    @Test
    public void excluirClienteExistenteTeste() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String resultado = service.excluir();
        assertEquals("Cliente excluido com sucesso", resultado);
    }

    @Test
    public void excluirClienteNaoExistenteTeste() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        assertThrows(UnsupportedOperationException.class, () -> {
            service.excluir();
        });
    }

    // atualizar
    @Test
    public void atualizarClienteExistenteTeste() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String resultado = service.atualizar();
        assertEquals("Cliente atualizado com sucesso", resultado);
    }

    @Test
    public void atualizarClienteNaoExistenteTeste() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        assertThrows(UnsupportedOperationException.class, () -> {
            service.atualizar();
        });
    }
}
