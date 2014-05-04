import java.util.ArrayList;

import java.awt.*;

import java.io.File;
import java.io.IOException;


public class Piece {
	Position position;
	Boolean team;
	Board board;
	Image i;
	Boolean firstMove = true;

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

	public Position moveTo(Position p) {
		Position temp = this.position;
		position = p;
		return temp;
	}

	public Boolean move(Position p){
		check.clear();
		check.add(position());
		check.add(p);
		System.out.println("move called"); 
		if (board.checkCheck(check, this.team())) {
			return false;
		}

		board.removeFromGird(p);
		position = p;
		firstMove = false;
		return true;	
	}

	public Boolean firstMove(){
		return firstMove;
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
