package br.com.gui.screenmatch.calculos;

public class Filtro {
    public void filtrar(Classificavel classificavel) {
        int nota = classificavel.getClassificacao();

        if (nota >= 5){
            System.out.println("Muito bom");
        } else if (nota >=4) {
            System.out.println("Bom");
        } else {
            System.out.println("Em baixa");
        }
    }
}