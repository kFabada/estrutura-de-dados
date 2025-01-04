package pilha;

import java.util.Comparator;

public class Conta  implements Comparable<Conta>{
    private String titulo;
    private double valor;


    public Conta(String titulo, double valor) {
        this.titulo = titulo;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    @Override
    public int compareTo(Conta conta2) {
        return CharSequence.compare(this.titulo, conta2.titulo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titulo='" + titulo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
