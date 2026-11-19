package b4hive;

import java.util.HashMap;
import java.util.Map;

public class AparenciaFactory {
    private static final Map<String, Aparencia> aparencias = new HashMap<>();

    public static Aparencia getAparencia(String nome, String cor) {
        String chave = nome + "|" + cor;
        Aparencia aparencia = aparencias.get(chave);
        if (aparencia == null) {
            aparencia = new Aparencia(nome, cor);
            aparencias.put(chave, aparencia);
        }
        return aparencia;
    }

    public static int getTotalAparencias() {
        return aparencias.size();
    }
}
