package Loja;

public class Livro extends Produto {
    private String autor, editora, idioma;
    private int ano, edicao, paginas;

    Livro(int code, String nome, String autor, String editora, int Ano, int edicao, int paginas, String idioma) {
        super(code, nome);

        this.autor = autor;
        this.editora = editora;
        this.ano = Ano;
        this.edicao = edicao;
        this.paginas = paginas;
        this.idioma = idioma;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public int getAno() {
        return this.ano;
    }

    public int getEdicao() {
        return this.edicao;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setAutor(String aux) {
        this.autor = aux;
    }

    public void setEditora(String aux) {
        this.editora = aux;
    }

    public void setIdioma(String aux) {
        this.idioma = aux;
    }

    public void setAno(int aux) {
        this.ano = aux;
    }

    public void setEdicao(int aux) {
        this.edicao = aux;
    }

    public void setPaginas(int aux) {
        this.paginas = aux;
    }
}
