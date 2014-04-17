class Queen extends Piece {
	
	public Queen() {

	}

	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        for (int i = -1; i <= 1; i++) {
        	for (int j = -1; j <= 1; j++) {
        		int scalar = 1;
                        // Position position = new Position(super.position().x(), super.position().y());
        		while (super.position().x() + (i * scalar) <= 8 && super.position().y() + (j * scalar) <= 8 && super.position().x() + (i * scalar) >= 0 && super.position().y() + (j * scalar) >= 0 && super.getPiece(new Position(super.position().x() + (i * scalar), super.position().y() + (j * scalar))) == null) {
        		      if (super.board.checkCheck(d, super.team()))
        		              d.add(new Position(super.position().x() + (i * scalar), super.position().y() + (j * scalar)));
                              scalar++;
                        }
                        if (super.getPiece(new Position(super.position().x() + (i * scalar), super.position().y() + (j * scalar))) != null) {
                           d.add(new Position(super.position().x() + (i * scalar), super.position().y() + (j * scalar)));     
                        }
        	}
        }
        d.add(super.position());
        return d;
	}

}