class Pawn extends Piece{
	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        ArrayList<Position> check = new ArrayList<Position>();
        for (int i = 0; i<3; i++) {
        	check.clear();
        	check.add(super.position);
        	Position temp = new Position(super.position.x() - 1 + i, super.position.y() + 1));
			check.add(temp);
            if(temp.x() >= 0 && temp.x()<=7 && temp.y() >= 0  && temp.y()<=7 && super.board.checkCheck(check, super.team)){
            	if (temp.x() == position.x() && super.board.getPiece(temp) == null) {
            		d.add(temp);
            	}
            	if(super.board.getPiece() != null && super.board.getPiece().team() == !super.team()){
            		d.add(temp);
            	}
            }
        }
        return d;
	}
}
