
package thenimkowsystem;

/**
 *
 * @author Julieth
 */
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MovieDetailsFrame extends JFrame {
    public MovieDetailsFrame(String title, String director, String genre, List<String> cast) {
        setTitle(title);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Title: " + title);
        JLabel directorLabel = new JLabel("Director: " + director);
        JLabel genreLabel = new JLabel("Genre: " + genre);
        JLabel castLabel = new JLabel("Cast: " + String.join(", ", cast));

        panel.add(titleLabel);
        panel.add(directorLabel);
        panel.add(genreLabel);
        panel.add(castLabel);

        add(panel);
        setVisible(true);
    }
}
