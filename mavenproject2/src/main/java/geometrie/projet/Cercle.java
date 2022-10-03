package geometrie.projet;



import geometrie.projet.Forme;
import geometrie.projet.Point;
import java.awt.Color;

public class Cercle extends Forme {

	protected float rayon ;

    public Cercle() {
    }
//1
    public Cercle(float rayon) {
        this.rayon = rayon;
    }
    //2
         public Cercle(int abs,int ord) {
    this.setP( new Point (abs , ord));
    }
         ///3
             public Cercle(Color c) {
    this.couleur=c;
    }
             //4
             
    public Cercle(float rayon,int abs,int ord,Color c) {
        this(rayon);
        this.setP( new Point (abs , ord));
        this.couleur=c;
    }
	
	@Override
	protected float surface() {
		return (float) Math.PI*rayon*rayon ;
	}
}