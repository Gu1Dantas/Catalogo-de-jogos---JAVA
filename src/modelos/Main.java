package modelos;

import br.com.gui.screenmatch.calculos.Filtro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("Batman Arkham nigth", 172.5, 2009, "Ação");
        System.out.println(jogo1.getNome());
        System.out.println(jogo1.getAnoDeLancamento());
        System.out.println(jogo1.getGenero());
        System.out.println(jogo1.getHorasJogadas());
        System.out.println(jogo1.getClassificacao());

        Jogo jogo2 = new Jogo("Batman Arkham City", 65.8, 2005, "Ação");
        System.out.println(jogo2.getNome());
        System.out.println(jogo2.getAnoDeLancamento());
        System.out.println(jogo2.getGenero());
        System.out.println(jogo2.getHorasJogadas());
        System.out.println(jogo2.getClassificacao());

        Jogo jogo3 = new Jogo("Roube um brainrot", 9, 2026, "Pcds");
        System.out.println(jogo3.getNome());
        System.out.println(jogo3.getHorasJogadas());
        System.out.println(jogo3.getClassificacao());

        Filtro filtro = new Filtro();
        filtro.filtrar(jogo1);
        filtro.filtrar(jogo2);

        Dlc dlc = new Dlc("Batman: Arrow", jogo1, 12);
        filtro.filtrar(dlc);

        ArrayList<Jogo> lista = new ArrayList<>();
        lista.add(jogo1);
        lista.add(jogo2);
        lista.add(jogo3);
        for (Jogo j : lista){
            System.out.println(j.getNome());
        }
    }
}
