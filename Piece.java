import java.util.ArrayList;
import java.awt.*;
class Piece {
	Position position;
	Boolean team;
	Board board;
	ArrayList<Position> check = new ArrayList<position>();
    public Piece(Board b, Boolean t, Position p){
        team = t;
        position = p;
        board = b;
    }

	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        d.add(position);
        return d;
	}

	public void removeFromGrid(){
		position = new Position(-1, -9);
	}

	public Boolean move(Position p){
		check.clear();
		check.add(position());
		check.add(p);
		if (board.checkCheck(check)) {
			board.removeFromGird(p);
			position = p;
			return true;			
		}
		return false;
	}

	public Position position(){
	        return position;    
	}

	public Boolean team(){
		return team;
	}

	public Board board() {
		return board;
	}

    

}
