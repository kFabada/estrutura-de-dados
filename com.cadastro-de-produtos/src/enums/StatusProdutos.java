package enums;

public enum StatusProdutos {
    PROCESSANDO(0),
    PENDENTE(1),
    PRONTOVENDA(2);

     int valor;

     StatusProdutos(int valor){
        this.valor = valor;
    }

    public int getStatusProdutos(){
         return valor;
    }
}
