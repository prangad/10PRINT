import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TENPRINTGUI extends JFrame {
    private static int FPS = 60;
    private TENPRINTPANEL mainPanel;

    Timer animationTimer = new Timer(1000/FPS, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainPanel.repaint();
        }
    });

    public TENPRINTGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel = new TENPRINTPANEL();
        add(mainPanel);

        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        animationTimer.start();
    }
}
