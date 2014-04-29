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

	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        d.add(position);
        return d;
	}

	public Boolean move(Position p){
		check.clear();
		check.add(position());
		check.add(p);
		System.out.println("move called"); 
		if (board.checkCheck(check, team())) {
			return false;
		}

		board.removeFromGird(p);
		position = p;
		return true;	
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
