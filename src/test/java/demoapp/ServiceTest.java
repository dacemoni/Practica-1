package demoapp;

import demoapp.service.NumeroParService;
import demoapp.service.SaludoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ServiceTest {

    @Autowired
    NumeroParService numeroPar;

    @Test
    public void contexLoads() throws Exception {
        assertThat(numeroPar).isNotNull();
    }

    @Test
    public void serviceSaludo() throws Exception {
        assertThat(numeroPar.esPar(5)).isEqualTo("El número 5 es impar");
    }
}
