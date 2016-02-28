import java.awt.*;

public class Face3 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(520, 180);
        Graphics g = panel.getGraphics();

        drawMultiFace(g, 10, 30);
    }

    public static void drawMultiFace(Graphics g, int x, int y) {
        for (int i = 0; i < 5; i++) {
            x = 10 + i * 100;
            g.setColor(Color.BLACK);
            g.drawOval(x,  y, 100, 100);
            g.setColor(Color.BLUE);
            g.fillOval(x+20, y+30, 20, 20);
            g.fillOval(x+60, y+30, 20, 20);
            g.setColor(Color.RED);
            g.drawLine(x+30, y+70, x+70, y+70);
        }
    }
}
