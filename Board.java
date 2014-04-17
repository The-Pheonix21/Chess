import java.util.ArrayList;

public class Board {
	
	ArrayList<Piece> pieces = new ArrayList<Piece>();

	public Piece getPiece(Position p){
		for (Piece pi : p) {
			if(pi.position().equals(p)){
				return pi;
			}
		}
		return null;

	}	
}
