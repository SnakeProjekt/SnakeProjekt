
import java.awt.*;
import java.awt.event.*;

public class Oberflaeche extends Frame implements KeyListener {
    private Essen e;
    Label l1;  // Label (=Text)

   
    public Oberflaeche() {
        // Fenster erzeugen
        setTitle("Snake");
        setSize(800,600); // Breite und Höhe
        setLocation(0,0); // Linke obere Ecke
        setVisible(true);
        setLayout(null);

        // Damit man das Fenster rechts oben schließen kann
        addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(1);
                }
            });
        // Tastatureingaben aktivieren
        addKeyListener(this);
        // Essen 
        int x = (int)(Math.random()*getWidth());
        int y = (int)(Math.random()*getHeight());
        e = new Essen();
        e.setVisible(true);
        e.setSize(10,10);
        e.setLocation(x, y);
        add(e);
   
        
    }

    public void keyPressed(KeyEvent w)
    {
        if(w.getKeyCode() == KeyEvent.VK_RIGHT) {
            setBackground(Color.red);
        }
        if(w.getKeyCode() == KeyEvent.VK_A) {
            setBackground(new Color(255,220,100)); //Rot,Grün,Blau
        }
    }

    public void keyTyped(KeyEvent w) {}

    public void keyReleased(KeyEvent w) {}

}


