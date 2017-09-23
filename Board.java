package chess;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame
{
    //Size declaration
    public final int W = 600;
    public final int H = 600;
    JButton boardCell[][] = new JButton[9][9];
    //Board f;
    
    //Constructor
    public Board(String title)
    {
        //f = new Board(title);
        setTitle(title);
        setSize(new Dimension(W, H));
        setMinimumSize(new Dimension(W, H));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 9));
        drawBoard();
        setVisible(true);
    }
    
    public void drawBoard()
    {
        for(int row = 8; row >= 0; row--)
        {
            for(int col = 0; col <= 8; col++)
            {
                if(col == 0) //cot dau tien de danh so thu tu
                {
                    JLabel text = new JLabel(String.format("%c", '0'+row));
                    text.setHorizontalAlignment(SwingConstants.CENTER);
                    add(text);
                    continue;
                }
                if(col != 0 && row == 0) //hang cuoi cung de danh so thu tu
                {
                    JLabel text = new JLabel(String.format("%c", 'a'+col-1));
                    text.setHorizontalAlignment(SwingConstants.CENTER);
                    add(text);
                    continue;
                }
                JButton b = new JButton();
                b.setMargin(new Insets(0, 0, 0, 0));
                //coloring the button
                if((row % 2 == 1 && col % 2 == 1) || (row % 2 == 0 && col % 2 == 0))
                    //black
                    b.setBackground(Color.BLACK);
                else //white
                    b.setBackground(Color.WHITE);
                boardCell[row][col] = b;
                boardCell[row][col].setVisible(true);
                add(boardCell[row][col]);
            }
        }
        System.out.println("Board created!");
    }
        
}
