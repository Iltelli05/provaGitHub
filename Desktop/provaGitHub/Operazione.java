import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class Operazione{
    private int codice;
    private double importo;
    private int quantita;
    private String descrizione;
    private static int ultimoCodice = 0;
    public Operazione(double importo, int quantita, String descrizione){
        this.codice = codice;
        this.importo = importo;
        this.quantita = quantita;
        this.descrizione = descrizione;
        ultimoCodice++;
        this.ultimoCodice = ultimoCodice;
    }
    public void setDescrizione(String descrizione){ this.descrizione = descrizione; }
    public int getCodice(){ return codice; }
    public double getImporto(){ return importo; }
    public int getQuantita(){ return quantita; }
    public String getDescrizione(){ return descrizione; }
    public int getUltimoCodice(){ return ultimoCodice; }
    public String toString(){
        String line = "";
        line +="L'operazione sul prodotto numero: "+getCodice()+", ovvero "+getDescrizione()+" al costo "+getImporto()+", la sua disponibilità "+getQuantita();
        return line;
    }
}
