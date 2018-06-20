import java.util.ArrayList;

/**
 * Verwalte den Bestand eines Unternehmens.
 * Der Bestand ist beschrieben durch einen oder
 * mehrere Artikel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bestandsverwalter
{
    // Das Lager mit den Artikeln
    private ArrayList<Artikel> lager;
    
    
    /**
     * Initialisiere den Bestandsverwalter.
     */
    public Bestandsverwalter()
    {
        lager = new ArrayList<Artikel>();
    }

    /**
     * F�hre einen neuen Artikel im Lager ein.
     * @param artikel Der Artikel, der neue eingef�hrt werden soll.
     */
    public void neuerArtikel(Artikel name)
    {
        for(Artikel artikel: lager)
        {
            if(name.gibName() != artikel.gibName())
            {
                lager.add(name);
            }
            else
            {
                System.out.println("Fehler : Artikel existiert bereits");
            }
        }
        
    }
    
    /**
     * Nimm eine Lieferung eines Artikels in das Lager auf.
     * Erh�he den Lagerbestand um die angegebene Menge.
     * @param nummer Die Artikelnummer des Artikels.
     * @param menge Die angelieferte Menge.
     */
    public void aufnehmen(int nummer, int menge)
    {
        //Artikel artikel = ;
        //artikel.erhoeheBestand(menge);
        for(Artikel artikel: lager)
        {
            if(artikel.gibNummer()== nummer)
            {
                artikel.erhoeheBestand(menge);
            }
        }
    }
    
    /**
     * Versuche einen Artikel mit der angegebenen Nummer im
     * Bestand zu finden.
     * @param nummer die Nummer des zu findenden Artikels.
     * @return den gefundenen Artikel oder null, falls kein
     *         passender Artikel gefunden wird.
     */
    public Artikel findeArtikel(int nummer)
    {
        for(Artikel artikel: lager)
        {
            if(artikel.gibNummer()== nummer)
            {
                return artikel;
            }
        }
        return null;
    }
    
    /**
     * Finde einen Artikel mit der angegebenen Nummer und
     * liefere seine aktuelle Menge im Bestand.
     * Wenn die Nummer auf keinen Artikel passt, wird
     * Null zur�ckgeliefert.
     * @param nummer die Nummer des Artikels.
     * @return die Menge des Artikels im Bestand.
     */
    public int mengeImBestand(int nummer)
    {
        for(Artikel artikel: lager)
        {
            if(artikel.gibNummer()== nummer)
            {
                return artikel.gibBestand();
            }
        }
        return 0;
    }

    /**
     * Informationen �ber alle Artikel ausgeben.
     */
    public void alleArtikelAnzeigen()
    {
        for(Artikel artikel: lager)
        {
            System.out.println(artikel.toString());
            
        }
        
    }
    
    public Artikel bestandsverwalter(int menge)
    {
        for(Artikel artikel: lager)
        {
            if(artikel.gibBestand()> menge)
            {
                return artikel;
            }
        }
        return null;
    }
}
