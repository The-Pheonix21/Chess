import java.util.ArrayList;

 class Knight extends Piece {
 	
 	public Knight(Board b, Boolean t, Position p){
		super(b, t, p);
	}
 	
 	
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

        for (int i = 7; i>=0; i--) {
        	if (super.board.getPiece(d.get(i)) != null && super.board.getPiece(d.get(i)).team() == super.team()) {
        		d.remove(i);
        	}
        }

        return d;
	}
}
