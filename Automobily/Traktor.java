/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Traktor} představují ...
 * The {@code Traktor} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Traktor implements IOvládáníMotoru, IOvládáníPolohy
{
boolean bezi;
int xPos;
boolean hydraulika;

public Traktor()
{
 bezi = false;
 xPos = 0;
 hydraulika = true;
}
  
  
public void nastartuj()
{
 bezi = true;
}
    
public void vypni()
{
 bezi = false;
}

public boolean getBezi()
{
 return this.bezi;   
}

public void zapniHydrauliku()
{
 hydraulika = true;   
}

public void vypniHydrauliku()
{
 hydraulika = false;   
}

public void pohybuj(int x)
{
 xPos = xPos + x;
}

public int getPozice()
{
 return this.xPos;   
}



//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}
