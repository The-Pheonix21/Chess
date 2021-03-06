import java.util.ArrayList;

class Board {
	ArrayList<Piece> pieces = new ArrayList<Piece>();
	ArrayList<Piece> kings = new ArrayList<Piece>();
	ArrayList<Position> exclude = new ArrayList<Position>();
	Piece ofEight;

	public Piece getPiece(Position p){
		boolean returnPiece;
		if(exclude.size() == 2 && exclude.get(1).equals(p)){
 			System.out.println("ofEight");
 			return ofEight;
 		}
		for (Piece pi : pieces) {
			returnPiece = true;
			if(pi.position().equals(p)){
				if(exclude.size() > 1){
					if(exclude.get(0).equals(p)){
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
		ofEight = getPiece(possibleMove.get(0));
		if(ofEight == null){
			System.out.println("Broken");
		}
		ArrayList<Position> allPossibleMoves = new ArrayList<Position>();
		ArrayList<Position> temp = new ArrayList<Position>();
		team = !team; 
		exclude.add(possibleMove.get(0));
		exclude.add(possibleMove.get(1));
		for (Piece p : pieces) {
			if (p.team() == team && !(p.position().equals(possibleMove.get(1)))) {
				temp = p.possibleMoves();
			}
			for (Position d : temp ) {
				allPossibleMoves.add(d);
			}
		}
		System.out.println("all positions colected");

		for (Position p : allPossibleMoves) {
			for (Piece king : kings) {
				if(p.equals(exclude.get(1)) && king.position().equals(exclude.get(0))){
					exclude.clear();
					return true;
				}
				if(king.team() != team && king.position().equals(p) && !p.equals(exclude.get(0))){
					exclude.clear();
					return true;
					
				}
			}
		}
		
		exclude.clear();
		return false; 	
	}

	public boolean removeFromGird(Position p){
		Piece kill = getPiece(p);
		if (kill == null) {
			return false;
		}
		if (kill == kings.get(0) || kill == kings.get(1)) {
			//win(!(kill.team()));
		}
		pieces.remove(pieces.indexOf(kill));
		return true;


	}

	public void addToGrid(Piece p){
		pieces.add(p);
		if (kings.size() < 2) {
			kings.add(p);
		}
	}
}
