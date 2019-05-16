import java.awt.*;
public class Essen extends Canvas
{
public void paint ( Graphics stift)
{
stift.setColor(new Color(0,0,255));
stift.fillRect ( 0, 0 , getWidth()-1 , getHeight()-1);
}
}
