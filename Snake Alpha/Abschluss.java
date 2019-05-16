/**
 * @author Moritz
 */

public class Abschluss extends Listenelement{
    public Listenelement einfuegen(Koerper k){
        return new Knoten(k);
    }
    public int anzahl(){
        return 0;
    }
}
