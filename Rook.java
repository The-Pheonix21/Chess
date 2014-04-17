class Rook extends Piece {
	
	public Rook(){

	}

		public ArrayList<Position> possibleMoves(){
	        ArrayList<Position> d = new ArrayList<Position>();
	        for (int i = ; i; i++) {
	        	Position temp = new Position(super.position.x(), super.position.y());
	        	if (temp.x() >=  && temp.x()<= && temp.y() >=   && temp.y()<=) {
	        		
	        	}
	        return d;
	    }

}