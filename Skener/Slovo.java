/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */

/*******************************************************************************
 * Instance třídy {@code Slovo} představují ...
 * The {@code Slovo} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Slovo
{

char koncovka;
char koncovka2;

    public Slovo(String slovo)
    {
        DejPlural(slovo);
    }

    public boolean IsSamohlaska(String slovo)
    {
        switch(slovo.charAt(slovo.length() - 1))
        {
            case 'a': koncovka = 'a'; return true;
            case 'e': koncovka = 'e';  return true;
            case 'i': koncovka = 'i';   return true; 
            case 'o': koncovka = 'o';   return true;
            case 'u': koncovka = 'u';   return true;
            case 'y': koncovka = 'y';   return true;
            default: koncovka = slovo.charAt(slovo.length() - 1); return false;
        }
    }

    public String DejPlural(String slovo)
    {
        koncovka = slovo.charAt(slovo.length()-1);
        koncovka2 = slovo.charAt(slovo.length()-2);
        if(IsSamohlaska(slovo) ==false )
        {
            if(koncovka == 's' || koncovka == 'x' || koncovka == 'z' || 
                (koncovka == 'h' && koncovka2 =='c') || (koncovka == 'h' && koncovka2 =='s'))
            {
                return slovo+"es";
            }
            else
            {
                return slovo+"s";
            }
            
        }
        else
        {
            switch(koncovka)
            {
                case 'y': if(IsSamohlaska(String.valueOf(koncovka2)) == false)
                          {
                            StringBuilder slovo2 = new StringBuilder(slovo);
                            slovo2.setCharAt(slovo.length()-1,'i');
                            return slovo2+"es";
                            
                          }
                          else
                          {
                              return slovo+"s";
                          }
                case 'o':
                            if(IsSamohlaska(String.valueOf(koncovka2)) == false)
                          {
                            StringBuilder slovo2 = new StringBuilder(slovo);
                            slovo2.setCharAt(slovo.length()-1,'o');
                            return slovo2+"es";
                          }
                          else
                          {
                              return slovo+"s";
                          }                         
                case 'e' : if(koncovka == 'e' && koncovka2 == 'f')
                {
                    StringBuilder slovo2 = new StringBuilder(slovo);
                    slovo2.setCharAt(slovo.length()-2, 'v');
                    return slovo2+"s";
                }
                
            }
            return slovo+"s";
        }
    }
}
