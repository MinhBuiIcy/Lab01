package hust.soict.ict.aims.screen.manager;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.datatransfer.FlavorEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.media.Playable;

public class MediaStore extends JPanel{
    private Media media;
    private PlayButtonListener playButtonListener;
    public MediaStore(Media media, PlayButtonListener playButtonListener){
        this.media = media;
        this.playButtonListener = playButtonListener;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
        title.setAlignmentX(CENTER_ALIGNMENT);
        
        JLabel cost = new JLabel("" + media.getCost() + " $$");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        if (media instanceof Playable){
            JButton playButton = new JButton("Play");
            playButton.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent e) { 
                    playButtonListener.play(media);
                }      
            } 
        );
            container.add(playButton);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    public interface PlayButtonListener {
        void play(Media media);
    }
}
