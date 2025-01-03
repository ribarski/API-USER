package modificadoresestaticos.classes;

public class Cliente {
    // 0 - Bloco de inicialização estatico é executado apenas uma vez apos jvm carregar a classe
    // 1 - Alocar espaço na memoria para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com sus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - o Construtor é executado

    private static int[] parcelas;

    static {
        parcelas = new int[100];
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {

    }


    public static int[] getParcelas() {
        return parcelas;
    }
}


