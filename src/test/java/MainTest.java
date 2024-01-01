import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final ByteArrayInputStream inputStream = new ByteArrayInputStream(
            "Amanda, F\nLucas, M\nJulia, F\nCarla, F\nSair\n".getBytes());

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
        System.setIn(inputStream);
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(System.in);
    }

    @Test
    public void testeNomesFemininos() {
        List<String> dados = Arrays.asList("Amanda, F", "Lucas, M", "Julia, F", "Carla, F");
        List<String> nomesFemininos = Main.filtrarNomesFemininos(dados);

        assertEquals(Arrays.asList("Amanda", "Julia", "Carla"), nomesFemininos);
    }
}
