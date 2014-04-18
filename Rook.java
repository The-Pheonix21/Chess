import java.util.ArrayList;

class Rook extends Piece {
	
	public Rook(){

	}

	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        for (int i = 0; i>8; i++) {
        	Position temp = new Position(super.position.x()+1, super.position.y()+1);
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
        for (int i = 0; i>8; i++) {
        	Position temp = new Position(super.position.x()+1, super.position.y()-1);
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
        for (int i = 0; i>8; i++) {
        	Position temp = new Position(super.position.x()-1, super.position.y()+1);
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
        for (int i = 0; i>8; i++) {
        	Position temp = new Position(super.position.x()-1, super.position.y()-1);
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