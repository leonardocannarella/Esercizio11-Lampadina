
/**
 * Led
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 28/11/2019)
 */
public class Led
{
    private Lampadina led[];
    private int dim;
    
    public Led(int dim)
    {
        setDim(dim);
        led = new Lampadina[dim];
    }
    
    private void setDim(int d)
    {
        dim=d;
    }
    
    public String inserisciL(Lampadina l, int posizione)
    {
        try
        {
           if(led[posizione]==null)
           {
               led[posizione]=l;
               return "Lampadina inserita!";
           }
           else
           {
               throw new FullPositionException();
           }
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            return "Posizione non valida!";
        }
        catch(FullPositionException exception)
        {
            return "Posizione già occupata!";
        }
    }
    
    public String rimuoviL(int posizione)
    {
        try
        {
           if(led[posizione]!=null)
           {
               led[posizione]=null;
               return "Lampadina rimossa!";
           }
           else
           {
               throw new EmptyPositionException();
           }
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            return "Posizione non valida!";
        }
        catch(EmptyPositionException exception)
        {
            return "Posizione già vuota!";
        }
    }
    
    public String accendiTutto()
    {
        int i=0;
        
        for(i=0; i<dim; i++)
        {
            if(led[i]!=null)
            {
                led[i].lightOn();
            }
        }
        
        return "Led accesi!";
    }
    
    public String spegniTutto()
    {
        int i=0;
        
        for(i=0; i<dim; i++)
        {
            if(led[i]!=null)
            {
                led[i].lightOff();
            }
        }
        
        return "Led spenti!";
    }
    
    public String accendiPari()
    {
        int i=0;
        
        for(i=0; i<dim; i=i+2)
        {
            if(led[i]!=null)
            {
                led[i].lightOn();
            }
        }
        
        return "Led pari accesi!";
    }
    
    public String accendiDispari()
    {
        int i=0;
        
        for(i=1; i<dim; i=i+2)
        {
            if(led[i]!=null)
            {
                led[i].lightOn();
            }
        }
        
        return "Led dispari accesi!";
    }
    
    public String spegniPari()
    {
        int i=0;
        
        for(i=0; i<dim; i=i+2)
        {
            if(led[i]!=null)
            {
                led[i].lightOff();
            }
        }
        
        return "Led pari spenti!";
    }
    
    public String spegniDispari()
    {
        int i=0;
        
        for(i=1; i<dim; i=i+2)
        {
            if(led[i]!=null)
            {
                led[i].lightOff();
            }
        }
        
        return "Led dispari spenti!";
    }
}
