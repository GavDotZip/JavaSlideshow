import java.awt.Container;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class slides extends JFrame {
    //define parameters for JFrame
    private Container container;
    private String slideshows[] = {"Please Select: ", "Kanto", "Johto", "Hoenn"};
    private JComboBox slideshowComboBox;
    private Timer timer;
    private int i = 0;
    private JLabel label;
    private JPanel buttonPanel;
    private JPanel buttons[];
    private JPanel comboPanel;
    private String[] list = new String[3];
    private String[] emptyList = new String[3];

    //constructor for class
    public slides() {
        super("Choose your region");
    }

}