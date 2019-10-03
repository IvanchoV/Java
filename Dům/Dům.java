/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Dům} představují ...
 * The {@code Dům} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Dům
{
    private Suterén světla;
    private Přízemí místnosti;
    private Poschodí patra;
    private Půda okna;
    
    public void setSvětla(Suterén světla) {
     this.světla = světla;   
    }
    
    public void setMístnosti(Přízemí místnosti) {
     this.místnosti = místnosti;   
    }
    
    public void setPatra(Poschodí patra) {
     this.patra = patra;   
    }
    
    public void setOkna(Půda okna) {
     this.okna = okna;   
    }
    
    @Override
    public String toString() {
         int početSvětel = null;
         int početMístností = null;
         int početPoschodí = null;
         int početOken = null;
        if (this.card != null) {
            phoneNumber = "Obsahuji SIM kartu s telefonnim cislem: " + card.phoneNumber + "."; //primy pristup k fieldum vnitrni tridy
        } else {
            phoneNumber = "Neobsahuji zadnou SIM kartu.";
        }
        return "Jsem mobilni telefon a mam imei: " + imei + ". " + phoneNumber;
    }

    public static class Suterén{
     private int početSvětel;
     
     public Suterén(int početSvětel) {
         this.početSvětel = početSvětel;
     }
     
     public void setPočetSvětel(int početSvětel) {
         this.početSvětel = početSvětel;
     }
     
     public int getPočetSvětel() {
         return početSvětel;
     }
    }
    
    public static class Přízemí{
     private int početMístností;
     
     public Přízemí(int početMístností) {
         this.početMístností = početMístností;
     }
     
     public void setPočetMístností(int početMístností) {
         this.početMístností = početMístností;
     }
     
     public int getPočetMístností() {
         return početMístností;
     }    
    }
    
    public static class Poschodí{
     private int početPoschodí;
     
     public Poschodí(int početPoschodí) {
         this.početPoschodí = početPoschodí;
     }
     
     public void setPočetPoschodí(int početPoschodí) {
         this.početPoschodí = početPoschodí;
     }
     
     public int getPočetPoschodí() {
         return početPoschodí;
     }       
    }
    
    public static class Půda{
     private int početOken;
     
     public Půda(int početOken) {
         this.početOken = početOken;
     }
     
     public void setPočetOken(int početOken) {
         this.početOken = početOken;
     }
     
     public int getPočetOken() {
         return početOken;
     }      
    }
}
