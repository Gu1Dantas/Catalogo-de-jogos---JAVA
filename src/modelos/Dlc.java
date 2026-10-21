package modelos;

import br.com.gui.screenmatch.calculos.Classificavel;

public class Dlc implements Classificavel {
    private String nome;
    private Jogo jogo;
    private double horasJogadas;

    public Dlc(String nome, Jogo jogo, double horasJogadas) {
        this.nome = nome;
        this.jogo = jogo;
        setHorasJogadas(horasJogadas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
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

    @Override
    public int getClassificacao() {
        if (horasJogadas < 5) {
            return 3;
        } else if (horasJogadas < 10) {
            return 4;
        } else {
            return 5;
        }
    }
}
