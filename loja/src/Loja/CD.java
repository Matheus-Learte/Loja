package Loja;

public class CD extends Produto {
    private String autor, gravadora;
    int trilhas, ano;

    CD(int code, String titulo, String autor, int trilhas, String gravadora, int ano) {
        super(code, titulo);

        this.autor = autor;
        this.trilhas = trilhas;
        this.gravadora = gravadora;
        this.ano = ano;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getGravadora() {
        return this.gravadora;
    }

    public int getTrilhas() {
        return this.trilhas;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAutor(String aux) {
        this.autor = aux;
    }

    public void setGravadora(String aux) {
        this.gravadora = aux;
    }

    public void setTrilhas(int aux) {
        this.trilhas = aux;
    }

    public void setAno(int aux) {
        this.ano = aux;
    }
}
