import java.util.ArrayList;
import java.awt.*;
class Piece {
	Position position;
	Boolean team;

    public Piece(Boolean t, Position p){
        team = t;
        position = p;
    }

	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        d.add(position);
        return d;
	}

	public void removeFromGrid(){
		position = new Position(-1, -9);
	}

	public void move(Position p){
		position = p;
	}
    

}
