package geometrie.projet;

import java.awt.Color;
import javax.swing.SingleSelectionModel;

final class Cylindre extends Cercle {
	
	float hauteur = 12 ;

    public Cylindre() {
    
    }
    //1
      public Cylindre(float rayon,float hauteur) {
        super(rayon);
        this.hauteur=hauteur;
    }
      //2

    public Cylindre(Color c) {
        super(c);
    }
      //3

    public Cylindre(float rayon, int abs, int ord, Color c,float hauteur) {
        super(rayon, abs, ord, c);
         this.hauteur=hauteur;
    }
    
      
	
	float volume() {
		return super.surface()*hauteur ;
	}
	
	@Override
	protected float surface() {
		
		return (float) (2*Math.PI*rayon*hauteur) ;
		
	}
	
	 public static void main (String arg[]) {
		
		Cylindre c = new Cylindre() ;
		//c..couleur
		System.out.println(c.hauteur + " " + c.couleur + " " + c.rayon) ;
		System.out.println("volume :" +c.volume()) ;
		System.out.println("surface :" +c.surface()) ;
		c.afficher() ;
		//c.setP(new);
                
                // objet x
                
                                      Point x =new Point(1,2);
                                      System.out.println(x.toString());
                                      
                                      
                 // c1  et c2
                                      Cylindre c1 = new Cylindre(5, 15, 20, Color.blue, 8);  
                                      Cylindre c2= new Cylindre(8, 5, 15, Color.blue, 8);        
             
	//tableau
                                             Rectangle r1= new Rectangle(12, 25, 2, 3, Color.red);
                                              Rectangle r2= new Rectangle(20, 10, 5, 10, Color.green);

                                              Cercle c5 =new Cercle(12, 10, 10, Color.yellow);
                                              
                                              Cylindre c3= new Cylindre(14, 4, 14, Color.white, 8);        
                                              Cylindre c4= new Cylindre(14, 4, 14, Color.green, 8);        

                                 Forme []tabForme={r1,r2,c5,c3,c4};
                                 
    
         
         }

}