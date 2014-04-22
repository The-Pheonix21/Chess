import java.util.ArrayList;

 class Knight extends Piece {
	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        d.add(new Position(super.position.x() + 1, super.position.y() +2));
        d.add(new Position(super.position.x() + 2, super.position.y() +1));
        d.add(new Position(super.position.x() + 2, super.position.y() -1));
        d.add(new Position(super.position.x() + 1, super.position.y() -2));

        d.add(new Position(super.position.x() - 1, super.position.y() +2));
        d.add(new Position(super.position.x() - 2, super.position.y() +1));
        d.add(new Position(super.position.x() - 2, super.position.y() -1));
        d.add(new Position(super.position.x() - 1, super.position.y() -2));

        for (Position p : d) {
        	if (super.board.getPiece(p) != null && super.board.getPiece(p).team() == super.team()) {
        		d.remove(d.indexOf(p));
        	}
        }

        return d;
	}
}
