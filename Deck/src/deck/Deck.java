package deck;

import java.util.Random;

/**
 *
 * @author Ismael Leal Ferreyra
 */
public class Deck {

    public static void main(String[] args) {

        String[] palo = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] carta = {"A", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "J", "Q", "K"};
        String[] color = {"negro","rojo"};

        int iPalo = (int) (Math.random() * 4);
        int iCarta = (int) (Math.random() * 13);
        int iColor = (int) (Math.random()* 2);
        
        System.out.println("La carta aleatoria es " + carta[iCarta] + " de " + palo[iPalo]+ " de " + color[iColor]);
    }

}
