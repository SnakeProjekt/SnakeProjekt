/**
 * @author Ludwig
 */

public class Körper {
    private int x,y;
    
    public Körper(int xa, int ya)
    {
        x = xa;
        y = ya;
    }

    public void bewege(int xn, int yn) {
        x = xn;
        y = yn;
    }
    
    public int gibX() {
        return x;
    }
    
    public int gibY() {
        return y;
    }
}