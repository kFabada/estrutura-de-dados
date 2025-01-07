package enumeracao;

public enum DiasDaSemana  {
    TERCA(2),
    QUARTA(3),
    SEGUNDA(1),
    SEXTA(5),
    SABADO(6),
    DOMINGO(6),
    QUINTA(4);

    private int valor;

   DiasDaSemana(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }
}
