/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code ServantProMotor} představují ...
 * The {@code ServantProMotor} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class ServantProMotor
{
    
public ServantProMotor()
{
    
}

public void nastratuj(IOvládáníMotoru vozidlo)
{
    vozidlo.nastartuj();
}

public void vypni(IOvládáníMotoru vozidlo)
{
    vozidlo.vypni();
}

public void stavMotoru(IOvládáníMotoru vozidlo)
{
    if (vozidlo.getBezi())
    {
     System.out.println(vozidlo + " motor běží.");
    }
    else
    {
     System.out.println(vozidlo + " motor vypnutý.");   
    }
}



//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}
