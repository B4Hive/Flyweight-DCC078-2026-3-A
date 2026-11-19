package b4hive;

public class Personagem {
    private final String nome;
    private final Aparencia aparencia;

    public Personagem(String nome, Aparencia aparencia) {
        this.nome = nome;
        this.aparencia = aparencia;
    }

    public String obterDescricao() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", aparencia='" + aparencia.getNome() + '\'' +
                ", cor='" + aparencia.getCor() + '\'' +
                '}';
    }
}
