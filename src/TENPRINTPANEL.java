import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TENPRINTPANEL extends JPanel {
    private static int scale = 20;
    private static int xCount = 40;
    private static int yCount = 40;
    private ArrayList<Boolean> printSet;

    public TENPRINTPANEL() {
        super();
        setPreferredSize(new Dimension(xCount*scale, yCount*scale));
        setBackground(Color.BLACK);
        printSet = new ArrayList<Boolean>();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (printSet.size() <= xCount * yCount)
            printSet.add(Math.random() < .5);

        for (int i = 0; i < printSet.size()-1; i++) {
            int xIndex = i % xCount;
            int yIndex = i / xCount;
            int xPos = xIndex * scale;
            int yPos = yIndex * scale;

            g.setColor(new Color(255, (255/xCount) * xIndex, (255/yCount) * yIndex));

            if (printSet.get(i))
                g.drawLine(xPos, yPos, xPos + scale, yPos + scale);
            else
                g.drawLine(xPos, yPos + scale, xPos + scale, yPos);
        }
    }
}
