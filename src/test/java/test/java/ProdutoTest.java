package test.java;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import dao.IProdutoDao;
import dao.ProdutoDao;
import domain.Produto;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void Cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Notebook Acer Predator Helios 300");
        produto.setPreco(8549.99);
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}