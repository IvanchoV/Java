/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code UniServant} představují ...
 * The {@code UniServant} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class UniServant extends ServantProMotor
{
    public UniServant()
    {
        
    }
    
    public void PosunVozidloO(IOvládáníPolohy vozidlo, int x)
    {
     vozidlo.pohybuj(x);
     System.out.println(vozidlo.getPozice());
     //System.out.println(IOvládáníPolohy.ukázkováHodnota);
    }
}
