
/**
 * Lampadario
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 21/11/2019)
 */
public class Lampadario
{
    private Lampadina a;
    private Lampadina b;
    private Lampadina c;
    
    public Lampadario()
    {
        a=null;
        b=null;
        c=null;
    }
    
    public String inserisciLamp(Lampadina a1, Lampadina a2, Lampadina a3)
    {
        if((a==null)&&(b==null)&&(c==null))
        {
            a=a1;
            b=a2;
            c=a3;
            return "Lampadine inserite con successo!";
        }
        else
            return "Lampadario già pieno.";
    }
    
    public String togliLamp()
    {
       if((a!=null)&&(b!=null)&&(c!=null))
        {
            a=null;
            b=null;
            c=null;
            return "Lampadine rimosse con successo!";
        }
        else
            return "Lampadario già vuoto.";
    }
    
    public String accendi(int n)
    {
        if((a!=null)&&(b!=null)&&(c!=null))
        {
            if((n>0)&&(n<4))
            {
                switch(n)
                {
                    case 1:
                        a.lightOn();
                        break;
                    case 2:
                        a.lightOn();
                        b.lightOn();
                        break;
                    case 3:
                        a.lightOn();
                        b.lightOn();
                        c.lightOn();
                        break;
                }
                return "Ho acceso "+ n + " lampadine.";
            }
            return "Parametro errato.";
        }
        else
            return "Il lampadario non ha tre lampadine.";
    }
    
    public String spegni(int n)
    {
        if((a!=null)&&(b!=null)&&(c!=null))
        {
            if((n>0)&&(n<4))
            {
                switch(n)
                {
                    case 1:
                        a.lightOff();
                        break;
                    case 2:
                        a.lightOff();
                        b.lightOff();
                        break;
                    case 3:
                        a.lightOff();
                        b.lightOff();
                        c.lightOff();
                        break;
                }
                return "Ho spento "+ n + " lampadine.";
            }
            return "Parametro errato.";
        }
        else
            return "Il lampadario non ha tre lampadine.";
    }
}
