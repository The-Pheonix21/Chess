class Rook extends Piece {
	
	public Rook(){

	}

		public ArrayList<Position> possibleMoves(){
	        ArrayList<Position> d = new ArrayList<Position>();
	        ArrayList<Position> check = new ArrayList<Position>();
	        for (int i = 0; i; i++) {
	        	check.clear();
	        	check.add(super.position);
	        }
	        return d;
	    }

}