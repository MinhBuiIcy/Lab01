package hust.soict.ict.aims.screen.manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.screen.manager.MediaStore.PlayButtonListener;
import hust.soict.ict.aims.store.Store;

public class StoreMangagerScreen extends Screen implements ActionListener, PlayButtonListener{
    public StoreMangagerScreen(Store store){
        super(store);
        setTitle("Store");
    }

    @Override
    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (int i = 0; i < 9; i++){
            MediaStore cell = new MediaStore(mediaInStore.get(i), this);
            center.add(cell);
        }

        return center;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String item = e.getActionCommand();
        if (item.equals("Add Book")){
            dispose();
            new AddBookScreen(store);
        }
        else if (item.equals("Add CD")){
            dispose();
            new AddCDScreen(store);
        }
        else if (item.equals("Add DVD")){
            dispose();
            new AddDVDScreen(store);
        }
        else if (item.equals("Play")){

        }
        else{
            JOptionPane.showMessageDialog(this, "This is the store!!!");
        }
    }

    public void play(Media media){
        JOptionPane.showMessageDialog(this, "Currently playing " + media.getTitle() + "\nEnjoy!!!");
    }
}
