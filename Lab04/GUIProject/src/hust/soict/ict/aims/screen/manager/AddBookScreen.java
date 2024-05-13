package hust.soict.ict.aims.screen.manager;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.store.Store;


public class AddBookScreen extends AddScreen implements ActionListener{
    private JTextField titleInput;
    private JTextField categoryInput;
    private JTextField costInput;
    private JTextField authorsInput;
    public AddBookScreen(Store store){
        super(store);
        setTitle("Add Book");
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

        JLabel costLabel = new JLabel("Enter cost: ");
        costInput = new JTextField(30);
        addComponents(center, costLabel, costInput, gbc);

        JLabel authorsLabel = new JLabel("Enter authors' name: ");
        authorsInput = new JTextField(30);
        addComponents(center, authorsLabel, authorsInput, gbc);

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

    @Override
    public void actionPerformed(ActionEvent e){
        String item = e.getActionCommand();
        if (item.equals("Add Book")){
            JOptionPane.showMessageDialog(this, "You are adding one!!!");
        }
        else if (item.equals("Add CD")){
            dispose();
            new AddCDScreen(store);
        }
        else if (item.equals("Add DVD")){
            dispose();
            new AddDVDScreen(store);
        }
        else if (item.equals("Submit")){
            String title = titleInput.getText();
            String category = categoryInput.getText();
            float cost = Float.parseFloat(costInput.getText());
            ArrayList<String> authors = new ArrayList<String>();
            String author = authorsInput.getText();
            String temp = "";
            for (int i = 0; i < author.length(); i++){
                if (author.charAt(i) != ','){
                    temp += author.charAt(i);
                }
                else {
                    authors.add(temp);
                    temp = "";
                }
            }
            Book book = new Book(title, category, cost, authors);
            store.addMedia(book);
            JOptionPane.showMessageDialog(this, "The book has been added successfully!!!");
            dispose();
            new StoreMangagerScreen(store);

        }
        else{
            dispose();
            new StoreMangagerScreen(store);
        }
    }
}
