/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code ServantProPolohu} představují ...
 * The {@code ServantProPolohu} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class ServantProPolohu
{
    public ServantProPolohu()
    {
    }
    
    public void PosunVozidloO(IOvládáníPolohy vozidlo, int x)
    {
     vozidlo.pohybuj(x);
     System.out.println(vozidlo.getPozice());
     //System.out.println(IOvládáníPolohy.ukázkováHodnota);
    }
    
    public void Lokace(IOvládáníPolohy vozidlo)
    {
     System.out.println("Poloha vozidla je " + vozidlo.getPozice() + ".");
    }
}
