/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RandomTree;

/**
 *
 * @author kemal
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
 
public class RandomTree extends JFrame {
 
    public RandomTree() {
        super("Fractal Tree");
        setBounds(100, 100, 800, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
    private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0) return;
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
        g.drawLine(x1, y1, x2, y2);
        drawTree(g, x2, y2, angle - Math.random()*20, depth - 1);
        drawTree(g, x2, y2, angle + Math.random()*40, depth - 1);
    }
 
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        drawTree(g, 400, 500, -90, 9);
    }
 
    public static void main(String[] args) {
        new RandomTree().setVisible(true);
    }
}
