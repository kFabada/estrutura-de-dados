package lista;

public class Produto {
    private String nome;
    private double preco;


    public Produto(String nome, double preco){
        this.nome = nome;
        setPreco(preco);
    }

    protected void print(){

    }

    public final void setPreco(double preco) {
        if (preco < 0){
            throw  new IllegalArgumentException("Preco nao pode ser negativo");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
