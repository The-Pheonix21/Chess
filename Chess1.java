import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.io.*;

public class Chess1 extends JFrame implements MouseListener, MouseMotionListener{
   
    JLayeredPane layeredPane;
    JPanel chessBoard;
    JLabel chessPiece;
    int xAdjustment;
    int yAdjustment;
    Position oldpos;
    Board board;
    Boolean turn = true;

    public Chess1(String title){


    super(title);
    Dimension boardSize = new Dimension(800, 800);

    layeredPane = new JLayeredPane();
    getContentPane().add(layeredPane);
    layeredPane.setPreferredSize(boardSize);
    layeredPane.addMouseListener(this);
    layeredPane.addMouseMotionListener(this);

    chessBoard = new JPanel();
    layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
    chessBoard.setLayout( new GridLayout(8, 8) );
    chessBoard.setPreferredSize( boardSize );
    chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);
     for (int i = 0; i < 64; i++) {
     JPanel square = new JPanel( new BorderLayout() );
     chessBoard.add( square );
      int row = (i / 8) % 2;
      if (row == 0)
     square.setBackground( i % 2 == 0 ? Color.black : Color.white );
     else
     square.setBackground( i % 2 == 0 ? Color.white : Color.black );
     }
    JLabel piece = new JLabel( new ImageIcon("img" + File.separator + "3.png") );
    JPanel panel = (JPanel)chessBoard.getComponent(0);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("img" + File.separator + "5.png"));
    panel = (JPanel)chessBoard.getComponent(1);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("img" + File.separator + "4.png"));
        panel = (JPanel)chessBoard.getComponent(2);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "1.jpg"));
        panel = (JPanel)chessBoard.getComponent(3);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "2.png"));
        panel = (JPanel)chessBoard.getComponent(4);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "4.png"));
        panel = (JPanel)chessBoard.getComponent(5);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "5.png"));
        panel = (JPanel)chessBoard.getComponent(6);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "3.png"));
        panel = (JPanel)chessBoard.getComponent(7);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "6.png"));
        panel = (JPanel)chessBoard.getComponent(8);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "6.png"));
        panel = (JPanel)chessBoard.getComponent(9);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "6.png"));
        panel = (JPanel)chessBoard.getComponent(10);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "6.png"));
        panel = (JPanel)chessBoard.getComponent(11);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "6.png"));
        panel = (JPanel)chessBoard.getComponent(12);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "6.png"));
        panel = (JPanel)chessBoard.getComponent(13);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "6.png"));
        panel = (JPanel)chessBoard.getComponent(14);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "6.png"));
        panel = (JPanel)chessBoard.getComponent(15);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "12.png"));
        panel = (JPanel)chessBoard.getComponent(48);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "12.png"));
        panel = (JPanel)chessBoard.getComponent(49);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "12.png"));
        panel = (JPanel)chessBoard.getComponent(50);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "12.png"));
        panel = (JPanel)chessBoard.getComponent(51);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "12.png"));
        panel = (JPanel)chessBoard.getComponent(52);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "12.png"));
        panel = (JPanel)chessBoard.getComponent(53);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "12.png"));
        panel = (JPanel)chessBoard.getComponent(54);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "12.png"));
        panel = (JPanel)chessBoard.getComponent(55);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "9.png"));
        panel = (JPanel)chessBoard.getComponent(56);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "11.png"));
        panel = (JPanel)chessBoard.getComponent(57);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "10.png"));
        panel = (JPanel)chessBoard.getComponent(58);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "7.png"));
        panel = (JPanel)chessBoard.getComponent(59);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "8.png"));
        panel = (JPanel)chessBoard.getComponent(60);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "10.png"));
        panel = (JPanel)chessBoard.getComponent(61);
        panel.add(piece);        
        piece = new JLabel(new ImageIcon("img" + File.separator + "11.png"));
        panel = (JPanel)chessBoard.getComponent(62);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("img" + File.separator + "9.png"));
        panel = (JPanel)chessBoard.getComponent(63);
        panel.add(piece);
        
               
      board = new Board();
      new King(board, false, new Position(4, 0));
      new King(board, true, new Position(4, 7));
      for (int i = 0; i<8; i++) {
        new Pawn(board, false, new Position(i, 1));
      }
      for (int i = 0; i<8; i++) {
        new Pawn(board, true, new Position(i, 6));
       }
       new Rook(board, false, new Position(0,0));
       new Rook(board, false, new Position(7,0));
       new Rook(board, true, new Position(0,7));
       new Rook(board, true, new Position(7,7));

       new Knight(board, false, new Position(1,0));
       new Knight(board, false, new Position(6,0));
       new Knight(board, true, new Position(1,7));
       new Knight(board, true, new Position(6,7));

       new Bishop(board, false, new Position(2,0));
       new Bishop(board, false, new Position(5,0));
       new Bishop(board, true, new Position(2,7));
       new Bishop(board, true, new Position(5,7));

       new Queen(board, false, new Position(3, 0));
       new Queen(board, true, new Position(3, 7));

    }

    public void paint(Graphics g) {
        super.paint(g);
    }

    public void mousePressed(MouseEvent e)
    {
        if (turn) {
              chessPiece = null;
            Component c =  chessBoard.findComponentAt(e.getX(), e.getY());
             if (c instanceof JPanel) 
             return;
             Point parentLocation = c.getParent().getLocation();
            xAdjustment = parentLocation.x - e.getX();
            yAdjustment = parentLocation.y - e.getY();
            chessPiece = (JLabel)c;
            chessPiece.setLocation(e.getX() + xAdjustment, e.getY() + yAdjustment);
            chessPiece.setSize(chessPiece.getWidth(), chessPiece.getHeight());
            layeredPane.add(chessPiece, JLayeredPane.DRAG_LAYER);
            oldpos = peanut(e.getX(), e.getY());
        }
    }
   
    public void mouseDragged(MouseEvent me) {
        if (chessPiece == null) return;
         chessPiece.setLocation(me.getX() + xAdjustment, me.getY() + yAdjustment);
     }
     
    public void mouseReleased(MouseEvent me) {
        ArrayList<Position> pm = new ArrayList<Position>();
        pm = board.getPiece(  oldpos ).possibleMoves();
        Boolean brat = false;
        for (int i = 0; i < pm.size(); i++) {
            if (pm.get(i).equals(peanut(me.getX() + xAdjustment, me.getY() + yAdjustment))) {
                brat = true;
            }
        }
        if (brat && board.getPiece(  oldpos ).move(peanut(me.getX(), me.getY()))) {
            if(chessPiece == null) return;

             chessPiece.setVisible(false);
            Component c =  chessBoard.findComponentAt(me.getX(), me.getY());
            if (c instanceof JLabel){
                Container parent = c.getParent();
                parent.remove(0);
                parent.add(chessPiece);
            }
            else {
                Container parent = (Container)c;
                parent.add( chessPiece );
            }
            chessPiece.setVisible(true);
        } else {
            if(chessPiece == null) return;
            chessPiece.setLocation(oldpos.x() * 100, oldpos.y() * 100);
        }
        if(chessPiece == null) return;
    }
    public void mouseClicked(MouseEvent e) {
  
    }
    public void mouseMoved(MouseEvent e) {
   }
    public void mouseEntered(MouseEvent e){
  
    }
    public void mouseExited(MouseEvent e) {
  
    }
    public static void main(String[] args) {
        JFrame frame = new Chess1("Chess Board");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE );
        frame.pack();
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
     }

     public Position peanut(int x, int y) {
        return new Position(x / 100, y / 100);
     }
}
