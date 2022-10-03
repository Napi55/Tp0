package geometrie.projet;

import geometrie.projet.Point;
import java.awt.Color;

abstract class Forme {
	//varible d'instance
	protected Color couleur = Color.RED ;
	
	private Point p = new Point (20 , 20) ;
	//static
	final  void changerCouleur ( Color c ) {
		couleur = c ;
	}
	
	protected abstract float surface ();
    
	void afficher () {
		System.out.println(this.toString());
	}
        

    @Override
    public String toString() {
        return  "Les cordonnes sont :(" + p.abs + ", " + p.ord+")";
    }
        
	
	public Point getP () {
		return p;
	}
	
	public void setP (Point p) {
		this.p=p ;
	}
	
	
}