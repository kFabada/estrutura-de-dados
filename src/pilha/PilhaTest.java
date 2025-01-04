package pilha;

public class PilhaTest {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i=0; i < 3; i++ ){
            pilha.empilha(i);
        }

    }
}
