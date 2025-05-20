package Loja;

public class DVD extends Produto {
    private String diretor, idioma, genero, nacionalidade;
    private int ano;

    DVD(int code, String nome, String diretor, String idioma, String genero, int ano, String country) {
        super(code, nome);

        this.diretor = diretor;
        this.idioma = idioma;
        this.genero = genero;
        this.ano = ano;
        this.nacionalidade = country;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public int getAno() {
        return this.ano;
    }
}
