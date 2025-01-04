package modulo1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VetorEpUm  {

    private String[] elementos;
    private int tamanho;

    public VetorEpUm(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

   public void adicionaE(String elemento){
       aumetarCapacidade();
        for (int i=0; i<elementos.length; i++){
            if (elementos[i] == null){
                elementos[i] = elemento;
                break;
            }
        }
    }

    public void adicionaA(String elemento) throws Exception {
        aumetarCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
        else{
            throw new Exception("Vetor Cheio");
        }
    }

    //adicionar no final
    public boolean adiciona(String elemento){
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    //adicionar em qualquer posicao
    public boolean adiciona(int posicao,String elemento ) {
        aumetarCapacidade();
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("posicao invalida");
        }

        //mover todos os elementos
        for (int i=tamanho; i>= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }


    public String busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("posicao invalida");
        }
        return this.elementos[posicao];
    }


    //busca sequencial pode ser um boolean tambem
    public int busca(String elemento){
        for (int i=0; i <this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }

        }
        return -1;
    }


    public int tamanho(){
        return this.tamanho;
    }

    //aumentar capacidade array
    private void aumetarCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for(int i=0; i < this.elementos.length; i++ ){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //remover elementos
    public void removerElemento(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("posicao invalida");
        }
        for(int i=posicao; i<tamanho-1; i++  ){
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }
    



    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();

    }
}

