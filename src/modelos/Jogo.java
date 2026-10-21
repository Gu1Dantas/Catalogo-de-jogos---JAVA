package modelos;

import br.com.gui.screenmatch.calculos.Classificavel;

public class Jogo implements Classificavel {
    private String nome;
    private double horasJogadas;
    private int anoDeLancamento;
    private String genero;

    public Jogo(String nome, double horasJogadas, int anoDeLancamento, String genero) {
        this.nome = nome;
        setHorasJogadas(horasJogadas);
        this.anoDeLancamento = anoDeLancamento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasJogadas() {
        return horasJogadas;
    }

    public void setHorasJogadas(double horasJogadas) {
        if (horasJogadas < 0) {
            throw new IllegalArgumentException("Não é possivel ter horas jogadas negativas");
        }
        this.horasJogadas = horasJogadas;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (horasJogadas < 50) {
            return 3;
        } else if (horasJogadas < 100) {
            return 4;
        } else {
            return 5;
        }
    }
}

