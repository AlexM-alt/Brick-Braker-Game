import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay(); // placing the class inside the program frame
        obj.setBounds( 10,10,700,600 ); //method is used in such a situation to set the position and size
        obj.setTitle( "Breakout Ball" ); // title
        obj.setResizable( false );  // for this method ussers dont have a permission to change size frame
        obj.setVisible( true ); //makes the Window visible.
        obj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        obj.add( gamePlay );
    }
}
