import java.util.ArrayList;
 class Pawn extends Piece{
 	
	public Pawn(Board b, Boolean t, Position p){
		super(b, t, p);
	}
 	
	public ArrayList<Position> possibleMoves(){
        ArrayList<Position> d = new ArrayList<Position>();
        int tea = -1;
        if(super.team()){
        	tea = 1;
        }
       
        for (int i = 0; i<3; i++) {
        	
        	
        	Position temp = new Position(super.position.x() - 1 + i, super.position.y() + (1 * tea));
			
            if(temp.x() >= 0 && temp.x()<=7 && temp.y() >= 0  && temp.y()<=7){
            	if (temp.x() == position.x() && super.board.getPiece(temp) == null) {
            		d.add(temp);
            	}
            	if(super.board.getPiece(temp) != null && super.board.getPiece(temp).team() == !super.team()){
            		d.add(temp);
            	}
            }
        }
        return d;
	}
}
