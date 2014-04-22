import java.util.ArrayList;

class King extends Piece {
	
	public King() {

	}

	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        d.add(super.position());
        for (int i = -1; i <= 1; i++) {
        	for (int j = -1; j <= 1; j++) {
                        Postion p = new Position(super.position().x() + i, super.position().y() + j);
                        c.add(position);
        		if (position().x() + i <= 8 && position().y() + j <= 8  && position.x() + i >= 0 && position.y() + j >= 0 && (super.board.getPiece(position) == null || super.board.getPiece(position).team() == !super.team()))
        			d.add(position);
                        c.remove(1);
        	}
        }
        return d;
	}


}