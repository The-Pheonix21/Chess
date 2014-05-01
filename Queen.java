import java.util.ArrayList;

class Queen extends Piece {

	public Queen(Board b, Boolean t, Position p){
		super(b, t, p);
	}
	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        for (int i = -1; i <= 1; i++) {
        	for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {
                    j++;
                }
        		int scalar = 1;
                Position position = new Position(super.position().x() + (i * scalar), super.position().y() + (j * scalar));
        		while (position.x() <= 7 && position.y() <= 7 && position.x() >= 0 && position.y() >= 0 && super.board.getPiece(position) == null) {
                                if(!position.equals(super.position())){
        			      d.add(position);
        			}
        		    
                    scalar++;
                    position = new Position(super.position().x() + (i * scalar), super.position().y() + (j * scalar));
                }
                if (super.board.getPiece(position) != null && super.board.getPiece(position).team() == !super.team()) {
                        if(!position.equals(super.position())){
        			      d.add(position);
        		}
               
                }
        	}
        }
        return d;
	}

}
