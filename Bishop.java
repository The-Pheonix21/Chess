import java.util.ArrayList;

class Bishop extends Piece {

	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        for (int i = 1; i<9; i++) {
        	Position temp = new Position(super.position.x()+i, super.position.y()+i);
        	if (super.board.getPiece(temp)!=null) {
	        	if (super.board.getPiece(temp).team()!=super.team()) {
	        		d.add(temp);
	        		i=9;
	        	}else{
	        		i=9;
	        	}
        	}
        	d.add(temp);
        }
        for (int i = 1; i<9; i++) {
        	Position temp = new Position(super.position.x()+i, super.position.y()-i);
        	if (super.board.getPiece(temp)!=null) {
	        	if (super.board.getPiece(temp).team()!=super.team()) {
	        		d.add(temp);
	        		i=9;
	        	}else{
	        		i=9;
	        	}
        	}
        	d.add(temp);
        }
        for (int i = 1; i<9; i++) {
        	Position temp = new Position(super.position.x()-i, super.position.y()+i);
        	if (super.board.getPiece(temp)!=null) {
	        	if (super.board.getPiece(temp).team()!=super.team()) {
	        		d.add(temp);
	        		i=9;
	        	}else{
	        		i=9;
	        	}
        	}
        	d.add(temp);
        }
        for (int i = 1; i<9; i++) {
        	Position temp = new Position(super.position.x()-i, super.position.y()-i);
        	if (super.board.getPiece(temp)!=null) {
	        	if (super.board.getPiece(temp).team()!=super.team()) {
	        		d.add(temp);
	        		i=9;
	        	}else{
	        		i=9;
	        	}
        	}
        	d.add(temp);
        }
        return d;
    }
}