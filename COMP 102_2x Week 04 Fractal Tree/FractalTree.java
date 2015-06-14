import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class FractalTree extends JFrame {
    private int maxLength = 10;
 
    public FractalTree() {
        setLocation(500,50);
        setSize(800,700);
        setTitle("Fractal Tree");      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new TreePanel());
        setVisible(true); 
    }
}

class TreePanel extends JPanel {

    private int maxLength = 10;
    
    private void drawFractalTree(Graphics g, int x1, int y1, double angle, int level) {
        
        // stopping condition
        if (level <= 0) return;
        
        // calculate the location of the next node
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * level * maxLength);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * level * maxLength);
        
        // set the color for drawing in the current branch
        setLineColor(g, level);
        
        // draw the current branch
        g.drawLine(x1, y1, x2, y2);

        // code before this line must not be submitted
        // draw the tree in different orientations by recursive calls
        drawFractalTree(g, x2, y2, angle - 30, level - 1);
        drawFractalTree(g, x2, y2, angle - 15, level - 1);
        drawFractalTree(g, x2, y2, angle + 15, level - 1);
        drawFractalTree(g, x2, y2, angle + 30, level - 1);
    }
 
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 700);
        drawFractalTree(g, 400, 500, -90, 9);       
    }
    
    public void setLineColor(Graphics g, int i) {
        switch (i) {
            
            case 1: g.setColor(Color.GREEN); break;
            case 2: g.setColor(Color.YELLOW); break;
            case 3: g.setColor(Color.ORANGE); break;
            case 4: g.setColor(Color.CYAN); break;
            case 5: g.setColor(Color.MAGENTA); break;
            case 6: g.setColor(Color.PINK); break;
            case 7: g.setColor(Color.RED); break;
            case 8: g.setColor(Color.BLUE); break;
            case 9: g.setColor(Color.GRAY); break;
            default: g.setColor(Color.BLACK); break;
        }
    }
}
