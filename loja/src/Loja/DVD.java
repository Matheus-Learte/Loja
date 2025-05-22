package Loja;

public class DVD extends Produto {
    private String diretor, idioma, genero, nacionalidade;
    private int ano;

    DVD(long code, String nome, String diretor, String idioma, String genero, int ano, String country) {
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

    @Override
    public String toString() {
        String s = "";

        s += "DVD\nCódigo: " + this.getCodigo() +
                "\nTítulo: " + this.getNome() +
                "\nDiretor: " + this.diretor +
                "\nGênero: " + this.genero +
                "\nAno: " + this.ano +
                "\nNacionalidade: " + this.nacionalidade +
                "\nIdioma: " + this.idioma;

        return s;
    }
}
