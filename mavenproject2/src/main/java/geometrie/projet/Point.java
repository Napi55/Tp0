package geometrie.projet;

public class Point {
	
	int abs , ord ;
	
	public Point(int abs, int ord) {
		this.abs = abs;
		this.ord = ord;
	}

    @Override
    public String toString() {
        return "Les cordonnes sont :(" + abs + " ," + ord+")";
    }
        
}