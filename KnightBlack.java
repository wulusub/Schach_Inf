/*

@author Nick, Roman, Robert

@version 0407

 */

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class KnightBlack extends King {
    public ImageIcon image;
    public int posx,posy;
    public JFrame frame;
    

    public KnightBlack(int x , int y, String path, JFrame frame_con){
        super(x, y, path, frame_con);
        posx = x;
        posy = y;
        image = new ImageIcon("images/SS80x80.png");
    }


    //Bewegen nach Vorne-Links
    public int[] fwd_one(){
        if(posx-80 > 400 && posy-160 >0){
            fwd();
            diLU();
            return new int[]{posx-160, posy-80};
        } else{
            return new int[]{-1};
        }
    }

    //Bewegen nach Vorne-Rechts
    public int[] fwd_two(){
        if(posx+80 < 1200 && posy-160 >0){
            fwd();
            diRU();
            return new int[]{posx-160, posy+80};
        } else{
            return new int[]{-1};
        }
    }

    //Bewegen nach Links-Oben
    public int[] left_one(){
        if(posx-160 > 400 && posy-80 >0){
            swl();
            diLU();
            return new int[]{posx-160, posy-80};
        } else{
            return new int[]{-1};
        }
    }

    //Bewegen nach Links-Unten
     public int[] left_two(){
        if(posx-160 > 400 && posy+80 < 800){
            swl();
            diLL();
            return new int[]{posx-160, posy+80};
        } else{
            return new int[]{-1};
        }
    }

    //Bewegen nach Rechts-Oben
    public int[] right_one(){
        if(posx+160 < 800 && posy-80 >0){
            swr();
            diRU();
            return new int[]{posx+160, posy-80};
        } else{
            return new int[]{-1};
        }
    }

    //Bewegen nach Rechts-Unten
     public int[] right_two(){
        if(posx+160 < 800 && posy+80 < 800){
            swr();
            diRL();
            return new int[]{posx+160, posy+80};
        } else{
            return new int[]{-1};
        }
    }

    //Bewegen nach Unten-Links
    public int[] bwd_one(){
        if(posx-80 > 400 && posy+160 < 800){
            bwd();
            diLL();
            return new int[]{posx-80, posy+160};
        } else{
            return new int[]{-1};
        }
    }

    //Bewegen nach Unten-Rechts
    public int[] bwd_two(){
        if(posx+80 < 1200 && posy+160 < 800){
            bwd();
            diRL();
            return new int[]{posx+80, posy+160};
        } else {
            return new int[]{-1};
        }
    }
}
