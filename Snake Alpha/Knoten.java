/**
 * @author Moritz
 */

public class Knoten extends Listenelement{
    private Listenelement naechster;
    private Koerper koerper;

    public Knoten(Koerper k){
        naechster = new Abschluss();
        koerper = k;
    }
    
    public Listenelement einfuegen(Koerper k) {
        return naechster.einfuegen(k);
    }
    public int anzahl(){
        return naechster.anzahl()+1;
    }

}