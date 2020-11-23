/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance_4;

public class Joueur {

    String Nom, Couleur;
    Jeton[] ListeJeton = new Jeton[21];
    int nombreDesintegrateurs, nombreJetonsRestant;

    public Joueur(String sonNom, String saCouleur) { //constructeur
        Nom = sonNom;
        Couleur = saCouleur;
    }
    public Joueur(String sonNom) { //constructeur avec que le nom
    Nom = sonNom;
    }

    public void genererJeton() { // permet de generer tous les jetons avec la couleur defini
        for (int i = 0; i < 21; i++) {
            ListeJeton[i] = new Jeton(Couleur);
        }
    }

    public void affecterCouleur(String nouvelleCouleurDuJoueur) {
        Couleur = nouvelleCouleurDuJoueur;
    }

    public void ajouterJetonDansSaListeJeton(Jeton jetonPasseEnParametreAAjouter) {
       ListeJeton[positionDernierDuJetonNonNull()+1] = jetonPasseEnParametreAAjouter;
    }


    public void obtenirDesintegrateur() {
        nombreDesintegrateurs++;
    }

    public boolean utiliserDesintegrateur() {
        if (nombreDesintegrateurs > 0) {
            nombreDesintegrateurs--;
            return true;
        }
        return false;
    }

    public int positionDernierDuJetonNonNull() { // dans sa liste de jeton au joueur
        for (int i = 20; i >= 0; i--) {
            if (ListeJeton[i] != null) {
                return i;
            }
        }
        return -1;
    }
    
    
    void ajouterJeton(Jeton un_jeton){
        ListeJeton[nombreJetonsRestant++] = un_jeton;
    }
    
}
