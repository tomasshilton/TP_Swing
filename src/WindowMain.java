import javax.swing.*;
import java.awt.*;

/**
 * Created by JoseRojas on 6/3/17.
 */
public class WindowMain extends JFrame {

    public WindowMain(String name){
        super(name);
        Toolkit myScreen= Toolkit.getDefaultToolkit();
        Dimension sizeScreen = myScreen.getScreenSize();
        int hightScreen = sizeScreen.height;
        int widthSreen = sizeScreen.width;
        setBounds(widthSreen/4, hightScreen/4, widthSreen/2, hightScreen/2);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setVisible(true);
        //setResizable(false);
        setExtendedState(Frame.MAXIMIZED_BOTH);

        PanelButtonMain pB = new PanelButtonMain();
        pB.setLayout(new BoxLayout(pB, BoxLayout.Y_AXIS));
        add(pB);
    }
}
