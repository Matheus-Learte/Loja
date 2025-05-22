package Loja;

public abstract class Produto {
    private int estoque;
    private String nome;
    private long codigo;

    Produto(long code, String nome) {
        this.codigo = code;
        this.nome = nome;
        this.estoque = 0;
    }

    protected long getCodigo() {
        return this.codigo;
    }

    protected void setCodigo(long aux) {
        this.codigo = aux;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String aux) {
        this.nome = aux;
    }

    public boolean setEstoque(int aux) {
        if (this.estoque + aux < 0) {
            return false;
        } else
            this.estoque += aux;
        return true;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public abstract String toString();

}