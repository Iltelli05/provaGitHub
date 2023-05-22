import java.util.*;
public class Magazzino implements Costanti{
    private HashMap<Integer, Operazione> operazioni = new HashMap<Integer, Operazione>(MASSIMO_OPERAZIONI);
    public void nuovoIngresso(double importo, int quantita, String descrizione){
        Operazione o = new Operazione(importo, quantita, descrizione);
        operazioni.put(o.getCodice(), o);
    }
    public void nuovaUscita(double importo, int quantita, String descrizione){
        Operazione o = new Operazione(importo, quantita, descrizione);
        operazioni.remove(o.getCodice());
    }
}