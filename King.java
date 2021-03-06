import java.util.ArrayList;

class King extends Piece {
	public King(Board b, Boolean t, Position p){
		super(b, t, p);
	}

	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        for (int i = -1; i <= 1; i++) {
        	for (int j = -1; j <= 1; j++) {
                        Position position = new Position(super.position().x() + i, super.position().y() + j);
        		if (position().x() + i <= 8 && position().y() + j <= 8  && position.x() + i >= 0 && position.y() + j >= 0 && (super.board.getPiece(position) == null || super.board.getPiece(position).team() == !super.team()))
        			if(!position.equals(super.position())){
        			      d.add(position);
        			}
        	}
        }
        return d;
	}


}
