/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Dělení} představují ...
 * The {@code Dělení} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Dělení implements IPočítej
{
double z;

    public Dělení()
    {
    }
    
    public void pocitej(double x, double y)
    {
        z = x / y;    
        System.out.println("Výsledek je " + z + ".");
    }
}
