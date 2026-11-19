package b4hive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void personagensComAparenciaIgualCompartilhamObjeto() {
        Aparencia primeira = AparenciaFactory.getAparencia("Mago-Teste", "Azul");
        Aparencia segunda = AparenciaFactory.getAparencia("Mago-Teste", "Azul");

        assertSame(primeira, segunda);
    }

    @Test
    void jogoCriaPersonagensComAparenciasDiferentes() {
        Jogo jogo = new Jogo();
        jogo.adicionarPersonagem("Luna", "Cavaleiro-Teste", "Prateada");
        jogo.adicionarPersonagem("Davi", "Cavaleiro-Teste", "Prateada");

        assertEquals(
                List.of(
                        "Personagem{nome='Luna', aparencia='Cavaleiro-Teste', cor='Prateada'}",
                        "Personagem{nome='Davi', aparencia='Cavaleiro-Teste', cor='Prateada'}"),
                jogo.obterPersonagens());
    }
}
