package umMuitos;

import java.util.HashSet;
import java.util.Set;

public class Produtos {
        private String nome;
        private Double preco;
        private HashSet<Produtos>listaProduto;

        public Produtos(String nome, Double preco){
            this.nome = nome;
            try{
                setPreco(preco);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Double getPreco() {
            return preco;
        }

        public void setPreco(Double preco) throws Exception {
            if (preco <= 0){
                throw new Exception("Preço não pode ser 0 ");
            }
            this.preco = preco;
        }

        public HashSet<Produtos> getListaProduto() {
            return listaProduto;
        }

        public void setListaProduto(HashSet<Produtos> listaProduto) {
            this.listaProduto = listaProduto;
        }
}
