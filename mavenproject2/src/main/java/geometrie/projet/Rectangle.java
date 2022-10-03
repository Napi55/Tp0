/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometrie.projet;
import java.awt.Color;

public class Rectangle extends Forme {
	
	protected float longueur = 10 , largeur = 15 ;

    //1
        public Rectangle(float longueur,float largeur) {
            this.longueur=longueur;
            this.largeur=largeur;
    }
        //2

    public Rectangle(int abs,int ord) {
    this.setP( new Point (abs , ord));
    }
    //3

    public Rectangle(Color c) {
    this.couleur=c;
    }
    //4

    public Rectangle(float longueur,float largeur,int abs,int ord,Color c) {
        this(longueur,largeur);
        this.setP( new Point (abs , ord));
        this.couleur=c;
    }
    
    
    
    
    
        
        
	
	void deplacer (int x , int y) {
		
		Point t = getP() ;
		    t.ord =+ x ;
		    t.abs =+ y ;
		    setP (t) ;       
	}
	
	@Override 
	protected float surface() {
		return longueur*largeur ;
	}
}