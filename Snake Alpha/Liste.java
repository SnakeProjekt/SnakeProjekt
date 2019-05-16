/**
 * @author Moritz
 */

public class Liste{
    private Listenelement anfang;
    
    public Liste(){
        anfang = new Abschluss();
    }
    
    public void hinzufuegen(Koerper k){
        anfang = anfang.einfuegen(k);
    }
    
    public int anzahl(){
        return anfang.anzahl();
    }
}