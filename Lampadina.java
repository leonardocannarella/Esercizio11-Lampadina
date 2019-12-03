
/**
 * Lampadina
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 21/11/2019)
 */
public class Lampadina
{
    private int codiceColore;
    private int luminosita;
    private boolean stato;
    private int lumMax;
    
    public Lampadina(int codiceColore, int lumMax)
    {
        setLumMax(lumMax);
        setCodiceColore(codiceColore);
        stato=false;
        luminosita=0;
    }
    
    public void setCodiceColore(int cod)
    {
        if((cod>0)&&(cod<5))
            codiceColore=cod;
        else if(cod<1)
            codiceColore=1;
        else
            codiceColore=4;
    }
    
    private void setLumMax(int lum)
    {
        if(lum>=10)
            lumMax=lum;
        else
            lumMax=10;
    }
    
    public String varLum(String segno, int n)
    {   
        if(stato==true)
        {
            if(n>0)
            {
                if(segno=="-")
                {
                    luminosita-=n;
                    if(luminosita<0)
                        luminosita=0;
                        
                    return "Luminosità diminuita di "+n;
                }
                else if(segno=="+")
                {
                    luminosita+=n;
                    if(luminosita>lumMax)
                        luminosita=lumMax;
                        
                    return "Luminosità aumentata di "+n;
                }
                else
                {
                    return "Parametri inseriti non validi!";
                }
            }
            else
            {
                return "Parametri inseriti non validi!";
            }
        }
        else
        {
            return "La lampadina è spenta.";
        }
    }
    
    public String lightOn()
    {
        stato=true;
        return "La lampadina è stata accesa.";
    }
    
    public String lightOff()
    {
        stato=false;
        return "La lampadina è stata spenta.";
    }
    
    public String getColore()
    {
        String s="";
        
        switch(codiceColore) {
            case 1:
                s="Bianco";
                break;
            case 2:
                s="Rosso";
                break;
            case 3:
                s="Blu";
                break;
            case 4:
                s="Giallo";
                break;
        }
        
        return "Colore: " + s + "\n";
    }
    
    public String getStato()
    {
        String s="";
        if(stato==true)
            s="accesa";
        else
            s="spenta";
        
        return "Stato: La lampadina è " + s + "\n";
    }
    
    public String getLuminosita()
    {
        if(stato==true)
            return "Luminosità: " + luminosita + "\n";
        else
            return "La lampadina è spenta!" + "\n";
    }
    
    public String toString()
    {
        return "LAMPADINA:\n" + getColore() + getStato() + getLuminosita();
    }
}
