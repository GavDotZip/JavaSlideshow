import java.awt.Container;
import java.awt.Image;
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
        container = getContentPane();
        buttonPanel = new JPanel();
        buttons = new JButton[3];
        buttons[0] = new JButton("");
        buttons[1] = new JButton("");
        buttons[2] = new JButton("");

        for(int i=0; i<buttons.length; i++) {
            buttons[i].setPreferredSize(getPreferredSize(new Dimension(240, 30)));
            buttonPanel.add(buttons[i]);
        }

        slideshowComboBox.setMaximumRowCount(4);
        slideshowComboBox = new JComboBox<>(slideshows);
        slideshowComboBox.addItemListener(
            new ItemListener() {
                public void itemStateChanged(ItemEvent event) {
                    if(event.getStateChange() == ItemEvent.SELECTED) {
                        if(slideshowComboBox.getSelectedIndex() == 0) {
                            list = emptyList;
                            slideshow = 0;
                            container.setBackground(colors[0]);
                        }
                        else if(slideshow.getSelectedIndex() == 1) {
                            list = kantoList;
                            slideshow = 1;
                            container.setBackground(colors[background1]);
                        }
                        else if(slideshow.getSelectedIndex() == 2) {
                            list = johtoList;
                            slideshow = 2;
                            container.setBackground(colors[background2]);
                        }
                        else if(slideshow.getSelectedIndex() == 3) {
                            list = hoennList;
                            slideshow = 3;
                            container.setBackground(colors[background3]);
                        }
                    }
                }
                
            });


        );
    }

    public void setImageSize(int i) {
        Image newImage = (new ImageIcon(list[i])).getImage().getScaledInstance(400, 250, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);
        label.setIcon(newIcon);
    }

    public static void main(String args[]) {
        slides slideshow = new slides();
        slideshow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
