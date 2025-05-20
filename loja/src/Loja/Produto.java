package Loja;

public class Produto {
    private int codigo, estoque;
    private String nome;

    Produto(int code, String nome) {
        this.codigo = code;
        this.nome = nome;
        this.estoque = 1;
    }

    protected int getCodigo() {
        return this.codigo;
    }

    protected void setCodigo(int aux) {
        this.codigo = aux;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String aux) {
        this.nome = aux;
    }

    public void setEstoque(int aux) {
        this.estoque = aux;
    }

    public int getEstoque() {
        return this.estoque;
    }

}