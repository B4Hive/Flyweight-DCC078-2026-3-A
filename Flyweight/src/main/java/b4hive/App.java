package b4hive;

public class App {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.adicionarPersonagem("Luna", "Cavaleiro", "Prateada");
        jogo.adicionarPersonagem("Davi", "Cavaleiro", "Prateada");
        jogo.adicionarPersonagem("Maya", "Arqueira", "Verde");

        for (String personagem : jogo.obterPersonagens()) {
            System.out.println(personagem);
        }
    }
}
