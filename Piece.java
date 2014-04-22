import java.util.ArrayList;

import java.awt.*;

import java.io.File;
import java.io.IOException;


public class Piece {
	Position position;
	Boolean team;
	Board board;
	Image i;

	ArrayList<Position> check = new ArrayList<Position>();

    public Piece(Board b, Boolean t, Position p){
        team = t;
        position = p;
        board = b;
        board.addToGrid(this);
    }

    public Piece(Board b, Boolean t, Position p, Image i){
        team = t;
        position = p;
        board = b;
        this.i = i;
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
		if (board.checkCheck(check), super.team()) {
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
