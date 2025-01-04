package modulo1;

import java.lang.reflect.Array;

public class VetorGenericos <T> {

    //vetor tem um tipo unico não ter varios elementos do mesmo tipo

    private T[] elementos;
    private int tamanho;

    //Melhor maneira para arrays de tipo generico
    public VetorGenericos(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    //Maneira 2 de ter um vetor de tipo generico
    public VetorGenericos(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[])Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public void adicionaE(T elemento){
        aumetarCapacidade();
        for (int i=0; i<elementos.length; i++){
            if (elementos[i] == null){
                elementos[i] = elemento;
                break;
            }
        }
    }

    public void adicionaA(T elemento) throws Exception {
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
    public boolean adiciona(T elemento){
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    //adicionar em qualquer posicao
    public boolean adiciona(int posicao,T elemento ) {
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


    public T busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("posicao invalida");
        }
        return this.elementos[posicao];
    }


    //busca sequencial pode ser um boolean tambem
    public int busca(T elemento){
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
            T[] elementosNovos =  (T[]) new Object[this.elementos.length * 2];
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

    public boolean contem(T elemento){

        return busca(elemento) > -1;
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
