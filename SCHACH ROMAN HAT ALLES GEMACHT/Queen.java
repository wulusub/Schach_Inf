/*

@author Robert, Sönke, Roman

@version 1007

 */

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Queen{
    public ImageIcon image;
    private int col, row;
    private int[][][] matrix;
    public boolean set;
    public Queen(int x , int y , String path , int[][][] matrix_board){
        col = x;
        row = y;
        matrix = new int[8][8][2];
        matrix = matrix_board;
        image = new ImageIcon("images/"+ path + ".png");
    }
//Methoden zur Rückgabe der Position
    public int x(){
        return matrix[col][row][0];    //Aufruf der Matrix zur Rückgabe der gespeicherten Position
    }
    public int y(){
        return matrix[col][row][1];    //Aufruf der Matrix zur Rückgabe der gespeicherten Position
    }
//Methode zur Koordinatenneuzuordnug
    public void changeCords(int colx, int rowy){
        col = colx;
        row = rowy;
    }
}
