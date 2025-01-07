package lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaTeste<T> {
    private String[] array;
    private ArrayList<Produto> lista;
    private int tamanho = 0;

    public ListaTeste(int capacidade) {
        lista = new ArrayList<>( capacidade);
        this.tamanho = capacidade;

    }



    public void adicionarProduto(Produto item) {
        int arrsize = lista.size();
        if (arrsize  <= tamanho - 1){
            lista.add(item);

        }else{
            throw new RuntimeException("Tamanho da lista esta cheia");
        }

    }

    @Override
    public String toString() {
        return
                "Produto = "  + lista + '\n';
    }
}


