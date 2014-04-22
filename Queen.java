import java.util.ArrayList;

class Queen extends Piece {

	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        d.add(super.position());
        for (int i = -1; i <= 1; i++) {
        	for (int j = -1; j <= 1; j++) {
        		int scalar = 1;
                Position position = new Position(super.position().x() + (i * scalar), super.position().y() + (j * scalar));
        		while (super.position().x() + (i * scalar) <= 8 && super.position().y() + (j * scalar) <= 8 && super.position().x() + (i * scalar) >= 0 && super.position().y() + (j * scalar) >= 0 && super.getPiece(position) == null) {
        		      d.add(position);
                              scalar++;
                        }
                        if (super.getPiece(position) != null && super.getPiece(position).team() == !super.team()) {
                           d.add(position);     
                        }
        	}
        }
        return d;
	}

}