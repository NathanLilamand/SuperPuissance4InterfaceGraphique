/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance_4;

/**
 *
 * @author Marc L
 */
public class Jeton {
    String Couleur;

    public Jeton(String UneCouleur) {

        Couleur = UneCouleur;
    }

    public String lireCouleur() {

        return Couleur;

    }
    public String afficherCouleur(){
        if (Couleur.equals("rouge")){
            return "R";
        }else {
            return "J";
        }
    }

    public void afficherLaCouleur() {
        System.out.println(" la couleur du jeton est :  " + Couleur);
    }
    
}
