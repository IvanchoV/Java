/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Auto} představují objekty aut se svými metodami.
 *
 * @author  Vladislav Ivancho
 * @version 0.00.0001 — 2019-09-10
 */
public class Auto implements IOvládáníMotoru, IOvládáníPolohy
{
boolean bezi;
int xPos;

public Auto()
{
 bezi = false;
 xPos = 0;
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
