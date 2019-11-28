
/**
 * Test
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 21/11/2019)
 */
public class Test
{
    public static void main(String[] args)
    {
        Lampadina a,b,c;
        Lampadario l;
        Led striscia;
        
        a = new Lampadina(1, 10);
        b = new Lampadina(0, 10);
        c = new Lampadina(8, 5);
        l = new Lampadario();
        striscia = new Led(20);
        
        System.out.println(l.inserisciLamp(a,b,c));
        System.out.println(l.accendi(3));
        System.out.println(a.varLum("+",6));
        System.out.println(b.varLum("+",6));
        System.out.println(c.varLum("+",6));
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        
        System.out.println(striscia.inserisciL(a, 0));
        System.out.println(striscia.inserisciL(b, 0));
        System.out.println(striscia.rimuoviL(0));
        System.out.println(striscia.rimuoviL(0));
        System.out.println(striscia.inserisciL(a, 0));
        System.out.println(striscia.inserisciL(b, 1));
        System.out.println(striscia.inserisciL(c, 2));
        System.out.println(striscia.accendiTutto());
        System.out.println(striscia.spegniTutto());
    }
}
