package b4hive;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private final List<Personagem> personagens = new ArrayList<>();

    public void adicionarPersonagem(String nome, String nomeAparencia, String cor) {
        Aparencia aparencia = AparenciaFactory.getAparencia(nomeAparencia, cor);
        personagens.add(new Personagem(nome, aparencia));
    }

    public List<String> obterPersonagens() {
        List<String> descricoes = new ArrayList<>();
        for (Personagem personagem : personagens) {
            descricoes.add(personagem.obterDescricao());
        }
        return descricoes;
    }
}
