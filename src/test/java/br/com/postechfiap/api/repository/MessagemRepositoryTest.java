package br.com.postechfiap.api.repository;

import br.com.postechfiap.api.model.Menssagem;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

public class MessagemRepositoryTest {
    @Mock
    private MessagemRepository messagemRepository;

    AutoCloseable openMocks;

    @BeforeEach
    void setup() {
        openMocks = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        openMocks.close();
    }

    @Test
    void devePermitirRegsitrarMenssagem() {
        var menssagem = Menssagem.builder()
                .id(UUID.randomUUID())
                .usuario("Filomena")
                .conteudo("Olá, eu sou a Filomena!")
                .build();
        when(messagemRepository.save(any(Menssagem.class))).thenReturn(menssagem);

        var menssagemRistrada = messagemRepository.save(menssagem);
        assertThat(menssagemRistrada)
                .isNotNull()
                .isEqualTo(menssagem);
        verify(messagemRepository, times(1)).save(any(Menssagem.class));
    }

    @Test
    void devePermitirBuscarMenssagem() {
        fail("Not yet implemented");
    }

    @Test
    void devePermitirAlterarMenssagem() {
        fail("Not yet implemented");
    }

    @Test
    void devePermitirExcluirMenssagem() {
        fail("Not yet implemented");
    }

    @Test
    void devePermitirListarMenssagem() {
        fail("Not yet implemented");
    }
}
