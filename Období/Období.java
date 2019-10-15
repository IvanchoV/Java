/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */


import java.util.*;

/*******************************************************************************
 * Instance výčtového typu {@code Období} představují ...
 * The {@code Období} enum type instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public enum Období
{
    JARO ("Máj, vyženeme husy v háj", 12),
    LÉTO ("Prázdniny", 27),
    PODZIM ("Listopad - měsíc knihy", 15),
    ZIMA ("Únor bílý - pole sílí", 10);
    
    private final String poznámka;
    private final int PocetSlunecnichDnu;
    
    private Období(String str, int pSD)
    {
        this.poznámka = str;
        this.PocetSlunecnichDnu = pSD;
    }
    
    public String getParametry()
    {
        return this.poznámka + " " + this.PocetSlunecnichDnu;
    }
    
    public static String činnosti( Období období )
    {
        switch( období )
        {
            case JARO:   return "kvete";
            case LÉTO:   return "zraje";
            case PODZIM: return "plodí";
            case ZIMA:   return "spí";
            default:     throw new IllegalArgumentException("Neočekávaná hodnota parametru období= " + období);
        }
    }
}
