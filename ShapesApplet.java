import java.awt.*;
import javax.swing.*;

public class ShapesApplet extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Rectangle
        g.drawRect(50, 50, 120, 70);

        // Circle
        g.drawOval(220, 50, 80, 80);

        // Line
        g.drawLine(50, 160, 300, 160);

        // Triangle
        int x[] = {100, 50, 150};
        int y[] = {190, 270, 270};

        g.drawPolygon(x, y, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometric Shapes");

        ShapesApplet panel = new ShapesApplet();
        frame.add(panel);

        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}