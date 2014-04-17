class King extends Piece {
	
	public King() {

	}

	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        for (int i = -1; i <= 1; i++) {
        	for (int j = -1; j <= 1; j++) {
        		if (position.x() + i <= 8 && position.y() + j <= 8 && super.board.checkCheck() && position.x() + i >= 0 && position.y() + j >= 0)
        			d.add(new Position(super.position.x() + i, super.position.y() + j));
        	}
        }
        d.add(super.position);
        return d;
	}



}