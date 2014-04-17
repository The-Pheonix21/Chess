import java.util.ArrayList;

public class Board {
	ArrayList<Piece> pieces = new ArrayList<Piece>();
	ArrayList<Piece> kings = new ArrayList<Piece>();
	ArrayList<Position> exclude = new ArrayList<Position>();

	public Piece getPiece(Position p){
		boolean returnPiece;
		for (Piece pi : p) {
			returnPiece = true;
			if(pi.position().equals(p)){
				for (int i = 0; i<exclude.size(); i++) {
					if(exclude.get(i).equals(p)){
						returnPiece = false;
					}
				}
				if (returnPiece) {
					return pi;
				}				
			}
		}
		return null;

	}

	public boolean checkCheck(ArrayList<Position> possibleMove, boolean team){
		ArrayList<Position> allPossibleMoves = new ArrayList<Position>();
		ArrayList<Position> temp = new ArrayList<Position>();
		team = !team; 
		exclude.add(possibleMove.get(0));
		for (Piece p : pieces) {
			if (p.team() == team && !(p.position().equals(possibleMove.get(1))) {
				temp = p.possibleMoves();
			}
			for (Position d : temp ) {
				allPossibleMoves.add(d);
			}
		}
		exclude.clear();
		for (Position p : allPossibleMoves) {
			for (Piece king : kings) {
				if(king.team() == team && king.position().equals(p)){
					return false;
				}
			}
		}
		return true; 	


	}	
}
