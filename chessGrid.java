import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class chessGrid extends JFrame implements MouseListener{
    JLayeredPane layeredPane;
    JPanel chessBoard;

    public chessGrid(String title){
    super(title);
    Dimension boardSize = new Dimension(600, 600);
    Dimension boardwButton = new Dimension(600,700);

    layeredPane = new JLayeredPane();
    getContentPane().add(layeredPane);
    layeredPane.setPreferredSize(boardwButton);
    layeredPane.addMouseListener(this);
    // layeredPane.addMouseMotionListener(this);
    JButton teamW = new JButton("White");
    teamW.setBackground(Color.red);
    teamW.setBounds (625,600,75,50);
    teamW.setVisible(true);

    JButton teamB = new JButton("Black");
    teamB.setBackground(Color.black);
    teamB.setBounds (625,600,75,50);
    teamB.setVisible(true);

    // TextField winLossCounter = new JTextField("Win" +w+ "loss" +l+);
    // win
    JButton surrender = new JButton("Surrender");
    surrender.setBackground(Color.red);
    surrender.setBounds(50,625,100,50);
    surrender.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
    });
    layeredPane.add(surrender, new Integer(1));
    chessBoard = new JPanel();
    layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
    chessBoard.setLayout( new GridLayout(8, 8) );
    chessBoard.setPreferredSize( boardSize );
    chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);
    JButton [] square = new JButton[64];
     for (int i = 0; i < 64; i++) {
      square[i]=new JButton("");
     chessBoard.add( square[i] );
      int row = (i / 8) % 2;
      if (row == 0) 
       square[i].setBackground( i % 2 == 0 ? Color.black : Color.white );
     else
       square[i].setBackground( i % 2 == 0 ? Color.white : Color.black );
    }
  }
     public void mousePressed(MouseEvent e){

     }
     public void mouseReleased(MouseEvent e) {
       
     }
     public void mouseClicked(MouseEvent e) {
  
     }
     public void mouseEntered(MouseEvent e){
  
     }
     public void mouseExited(MouseEvent e) {
  
     }
    public static void main(String[] args) {
        JFrame frame = new chessGrid("Chess Board");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE );
        frame.pack();
        frame.setResizable(true);
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
     }
}