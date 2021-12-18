package christmasTree;
import javax.swing.JFrame;

public class Frame extends JFrame{
    Panel p ;Frame() {
        p = new Panel() ;
        add(p) ;
        setBounds(400, 200, 800, 800) ;
        setVisible(true) ;
        validate() ;
        setDefaultCloseOperation(Frame.EXIT_ON_CLOSE) ;
    }

}
