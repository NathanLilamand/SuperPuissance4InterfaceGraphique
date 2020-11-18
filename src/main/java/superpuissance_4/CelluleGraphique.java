/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance_4;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Marc L
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee;
    // image a charger
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png"));
    
    public CelluleGraphique (Cellule uneCellule){
        celluleAssociee=uneCellule;
    }
    
    @Override
    public void paintComponent (Graphics G) {
        super.paintComponent(G);
        setIcon(img_vide); // on attribue cellulevide.png
        
    }
}
