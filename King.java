import java.util.ArrayList;

class King extends Piece {
	
	public King() {

	}

	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        ArrayList<Position> c = new ArrayList<Position>();
        d.add(super.position());
        c.add(super.position());
        for (int i = -1; i <= 1; i++) {
        	for (int j = -1; j <= 1; j++) {
                        c.add(new Position(super.position().x() + i, super.position().y() + j));
        		if (position().x() + i <= 8 && position().y() + j <= 8 && super.board.checkCheck(c, super.team()) && position.x() + i >= 0 && position.y() + j >= 0)
        			d.add(new Position(super.position().x() + i, super.position().y() + j));
                        c.remove(1);
        	}
        }
        return d;
	}



}