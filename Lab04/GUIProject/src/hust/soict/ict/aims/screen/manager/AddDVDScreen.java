package hust.soict.ict.aims.screen.manager;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.store.Store;

public class AddDVDScreen extends Screen implements ActionListener{
    private JTextField titleInput;
    private JTextField categoryInput;
    private JTextField directorInput;
    private JTextField lengthInput;
    private JTextField costInput;
    public AddDVDScreen(Store store){
        super(store);
        setTitle("Add DVD");
    }

    @Override
    JPanel createCenter() {
        JPanel center = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel titleLabel = new JLabel("Enter title: ");
        titleInput = new JTextField(30);
        addComponents(center, titleLabel, titleInput, gbc);

        JLabel categoryLabel = new JLabel("Enter category: ");
        categoryInput = new JTextField(30);
        addComponents(center, categoryLabel, categoryInput, gbc);

        JLabel directorLabel = new JLabel("Enter director: ");
        directorInput = new JTextField(30);
        addComponents(center, directorLabel, directorInput, gbc);

        JLabel lengthLabel = new JLabel("Enter length: ");
        lengthInput = new JTextField(30);
        addComponents(center, lengthLabel, lengthInput, gbc);

        JLabel costLabel = new JLabel("Enter cost: ");
        costInput = new JTextField(30);
        addComponents(center, costLabel, costInput, gbc);

        JButton submitButton = new JButton("Submit");
        submitButton.setPreferredSize(new Dimension(200, 40));
        submitButton.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 5;
        center.add(submitButton, gbc);

        return center;
    }

    private void addComponents(JPanel panel, Component label, Component textField, GridBagConstraints gbc) {
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(label, gbc);
        gbc.gridx++;
        panel.add(textField, gbc);
    }

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
            JOptionPane.showMessageDialog(this, "You are adding one!!!");
            
        }
        else if (item.equals("Submit")){
            String title = titleInput.getText();
            String category = categoryInput.getText();
            String director = directorInput.getText();
            int length = Integer.parseInt(lengthInput.getText());
            float cost = Float.parseFloat(costInput.getText());

            DigitalVideoDisc digitalVideoDisc = new DigitalVideoDisc(title, category, director, length, cost);
            store.addMedia(digitalVideoDisc);
            JOptionPane.showMessageDialog(this, "The DVD has been added successfully!!!");
            dispose();
            new StoreMangagerScreen(store);
        }
        else{
            dispose();
            new StoreMangagerScreen(store);
        }
    }

}
