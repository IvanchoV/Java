
/**
 * Interakce s domem namalovaným v Javě.
 * 
 * @author Vladislav Ivancho 
 * @version ()
 */
public class Dům
{
    Obdélník zeď;
    Obdélník komín;
    Obdélník vrch;
    Trojúhelník střecha;
    Obdélník okno1;
    Obdélník tyč1;
    Obdélník tyč2;
    Obdélník okno2;
    Obdélník tyč3;
    Obdélník tyč4;
    Obdélník dveře;
    Obdélník klika;
    Elipsa podokno;
    Elipsa okno3;
    
    /**
     * Vykreslí dům s vychozími atributy a pomocí pevné pozice od základního obdélníku.
     */
    public Dům()
    {
       zeď = new Obdélník(100,100,100,100,Barva.MODRÁ);
       komín = new Obdélník(zeď.getX()+5,zeď.getY()-50,15,45,Barva.HNĚDÁ);
       vrch = new Obdélník(zeď.getX(),zeď.getY()-50,25,10,Barva.ČERNÁ);
       střecha = new Trojúhelník(zeď.getX()-10,zeď.getY()-55,120,60,Barva.ČERVENÁ);
       okno1 = new Obdélník(zeď.getX()+5,zeď.getY()+35,25,25,Barva.BÍLÁ);
       tyč1 = new Obdélník(zeď.getX()+16,zeď.getY()+35,2,25,Barva.ČERNÁ);
       tyč2 = new Obdélník(zeď.getX()+5,zeď.getY()+47,25,2,Barva.ČERNÁ);
       okno2 = new Obdélník(zeď.getX()+70,zeď.getY()+35,25,25,Barva.BÍLÁ);
       tyč3 = new Obdélník(zeď.getX()+81,zeď.getY()+35,2,25,Barva.ČERNÁ);
       tyč4 = new Obdélník(zeď.getX()+70,zeď.getY()+47,25,2,Barva.ČERNÁ);
       dveře = new Obdélník(zeď.getX()+35,zeď.getY()+35,30,65,Barva.HNĚDÁ);
       klika = new Obdélník(zeď.getX()+35,zeď.getY()+65,7,3,Barva.ZLATÁ);
       podokno = new Elipsa(zeď.getX()+35,zeď.getY()-30,30,30,Barva.ČERNÁ);
       okno3 = new Elipsa(zeď.getX()+37,zeď.getY()-28,26,26,Barva.BÍLÁ);
    }
    
    /**
     * Vykreslí dům se zvolenými barvami uživatele a pozicování je stejné, jak v předchozí medotě.
     */
    public Dům(Barva Zeď, Barva Komín, Barva Vrch, Barva Střecha, Barva Okno1, Barva Tyč1, Barva Tyč2,
               Barva Okno2, Barva Tyč3, Barva Tyč4, Barva Dveře, Barva Klika, Barva Podokno, Barva Okno3)
    {
       zeď = new Obdélník(100,100,100,100,Zeď);
       komín = new Obdélník(zeď.getX()+5,zeď.getY()-50,15,45,Komín);
       vrch = new Obdélník(zeď.getX(),zeď.getY()-50,25,10,Vrch);
       střecha = new Trojúhelník(zeď.getX()-10,zeď.getY()-55,120,60,Střecha);
       okno1 = new Obdélník(zeď.getX()+5,zeď.getY()+35,25,25,Okno1);
       tyč1 = new Obdélník(zeď.getX()+16,zeď.getY()+35,2,25,Tyč1);
       tyč2 = new Obdélník(zeď.getX()+5,zeď.getY()+47,25,2,Tyč2);
       okno2 = new Obdélník(zeď.getX()+70,zeď.getY()+35,25,25,Okno2);
       tyč3 = new Obdélník(zeď.getX()+81,zeď.getY()+35,2,25,Tyč3);
       tyč4 = new Obdélník(zeď.getX()+70,zeď.getY()+47,25,2,Tyč4);
       dveře = new Obdélník(zeď.getX()+35,zeď.getY()+35,30,65,Dveře);
       klika = new Obdélník(zeď.getX()+35,zeď.getY()+65,7,3,Klika);
       podokno = new Elipsa(zeď.getX()+35,zeď.getY()-30,30,30,Podokno);
       okno3 = new Elipsa(zeď.getX()+37,zeď.getY()-28,26,26,Okno3);    
    }
    
    /**
     * Vykreslí dům na zadaných souřadnicích a od toho se odvíjí pozicování.
     */
    public Dům(int x, int y)
    {
       zeď = new Obdélník(x,y,100,100,Barva.MODRÁ);
       komín = new Obdélník(zeď.getX()+5,zeď.getY()-50,15,45,Barva.HNĚDÁ);
       vrch = new Obdélník(zeď.getX(),zeď.getY()-50,25,10,Barva.ČERNÁ);
       střecha = new Trojúhelník(zeď.getX()-10,zeď.getY()-55,120,60,Barva.ČERVENÁ);
       okno1 = new Obdélník(zeď.getX()+5,zeď.getY()+35,25,25,Barva.BÍLÁ);
       tyč1 = new Obdélník(zeď.getX()+16,zeď.getY()+35,2,25,Barva.ČERNÁ);
       tyč2 = new Obdélník(zeď.getX()+5,zeď.getY()+47,25,2,Barva.ČERNÁ);
       okno2 = new Obdélník(zeď.getX()+70,zeď.getY()+35,25,25,Barva.BÍLÁ);
       tyč3 = new Obdélník(zeď.getX()+81,zeď.getY()+35,2,25,Barva.ČERNÁ);
       tyč4 = new Obdélník(zeď.getX()+70,zeď.getY()+47,25,2,Barva.ČERNÁ);
       dveře = new Obdélník(zeď.getX()+35,zeď.getY()+35,30,65,Barva.HNĚDÁ);
       klika = new Obdélník(zeď.getX()+35,zeď.getY()+65,7,3,Barva.ZLATÁ);
       podokno = new Elipsa(zeď.getX()+35,zeď.getY()-30,30,30,Barva.ČERNÁ);
       okno3 = new Elipsa(zeď.getX()+37,zeď.getY()-28,26,26,Barva.BÍLÁ);   
    }
    
    /**
     * Změní velikost objektů a poté je zobrazí.
     */
    public void ZmenitVelikost(int z)
    {
       zeď.setRozměr(z*100,z*100);
       komín.setRozměr(z*15,z*45);
       vrch.setRozměr(z*25,z*10);
       střecha.setRozměr(z*120,z*60);
       okno1.setRozměr(z*25,z*25);
       tyč1.setRozměr(z*2,z*25);
       tyč2.setRozměr(z*25,z*2);
       okno2.setRozměr(z*25,z*25);
       tyč3.setRozměr(z*2,z*25);
       tyč4.setRozměr(z*25,z*2);
       dveře.setRozměr(z*30,z*65);
       klika.setRozměr(z*7,z*3);
       podokno.setRozměr(z*30,z*30);
       okno3.setRozměr(z*26,z*26);
       
       zeď.zobraz();
       komín.zobraz();
       vrch.zobraz();
       střecha.zobraz();
       okno1.zobraz();
       tyč1.zobraz();
       tyč2.zobraz();
       okno2.zobraz();
       tyč3.zobraz();
       tyč4.zobraz();
       dveře.zobraz();
       klika.zobraz();
       podokno.zobraz();
       okno3.zobraz();
    }
    
    /**
     * Lze aktivně pro uživatele nastavit barvu pro všechny objekty a poté je hned zobrazit.
     */
    public void SetBarvaDum(Barva Zeď, Barva Komín, Barva Vrch, Barva Střecha, Barva Okno1, Barva Tyč1, Barva Tyč2,
                            Barva Okno2, Barva Tyč3, Barva Tyč4, Barva Dveře, Barva Klika, Barva Podokno, Barva Okno3)
    {
        zeď.setBarva(Zeď);
        komín.setBarva(Komín);
        vrch.setBarva(Vrch);
        střecha.setBarva(Střecha);
        okno1.setBarva(Okno1);
        tyč1.setBarva(Tyč1);
        tyč2.setBarva(Tyč2);
        okno2.setBarva(Okno2);
        tyč3.setBarva(Tyč3);
        tyč4.setBarva(Tyč4);
        dveře.setBarva(Dveře);
        klika.setBarva(Klika);
        podokno.setBarva(Podokno);
        okno3.setBarva(Okno3);
        
        zeď.zobraz();
        komín.zobraz();
        vrch.zobraz();
        střecha.zobraz();
        okno1.zobraz();
        tyč1.zobraz();
        tyč2.zobraz();
        okno2.zobraz();
        tyč3.zobraz();
        tyč4.zobraz();
        dveře.zobraz();
        klika.zobraz();
        podokno.zobraz();
        okno3.zobraz();
    }
    
    /**
     * Posune dům směrem doprava a poté ho hned zobrazí.
     */
    public void PosunVpravo()
    {
        zeď.posunVpravo();
        komín.posunVpravo();
        vrch.posunVpravo();
        střecha.posunVpravo();
        okno1.posunVpravo();
        tyč1.posunVpravo();
        tyč2.posunVpravo();
        okno2.posunVpravo();
        tyč3.posunVpravo();
        tyč4.posunVpravo();
        dveře.posunVpravo();
        klika.posunVpravo();
        podokno.posunVpravo();
        okno3.posunVpravo();
        
        zeď.zobraz();
        komín.zobraz();
        vrch.zobraz();
        střecha.zobraz();
        okno1.zobraz();
        tyč1.zobraz();
        tyč2.zobraz();
        okno2.zobraz();
        tyč3.zobraz();
        tyč4.zobraz();
        dveře.zobraz();
        klika.zobraz();
        podokno.zobraz();
        okno3.zobraz();
    }
    
    /**
     * Posune dům směrem doleva a poté ho hned zobrazí.
     */
    public void PosunVlevo()
    {
        zeď.posunVlevo();
        komín.posunVlevo();
        vrch.posunVlevo();
        střecha.posunVlevo();
        okno1.posunVlevo();
        tyč1.posunVlevo();
        tyč2.posunVlevo();
        okno2.posunVlevo();
        tyč3.posunVlevo();
        tyč4.posunVlevo();
        dveře.posunVlevo();
        klika.posunVlevo();
        podokno.posunVlevo();
        okno3.posunVlevo();
        
        zeď.zobraz();
        komín.zobraz();
        vrch.zobraz();
        střecha.zobraz();
        okno1.zobraz();
        tyč1.zobraz();
        tyč2.zobraz();
        okno2.zobraz();
        tyč3.zobraz();
        tyč4.zobraz();
        dveře.zobraz();
        klika.zobraz();
        podokno.zobraz();
        okno3.zobraz();
    }
    
    /**
     * Posune dům směrem nahoru a poté ho hned zobrazí.
     */
    public void PosunNahoru()
    {
        zeď.posunVzhůru();
        komín.posunVzhůru();
        vrch.posunVzhůru();
        střecha.posunVzhůru();
        okno1.posunVzhůru();
        tyč1.posunVzhůru();
        tyč2.posunVzhůru();
        okno2.posunVzhůru();
        tyč3.posunVzhůru();
        tyč4.posunVzhůru();
        dveře.posunVzhůru();
        klika.posunVzhůru();
        podokno.posunVzhůru();
        okno3.posunVzhůru();
        
        zeď.zobraz();
        komín.zobraz();
        vrch.zobraz();
        střecha.zobraz();
        okno1.zobraz();
        tyč1.zobraz();
        tyč2.zobraz();
        okno2.zobraz();
        tyč3.zobraz();
        tyč4.zobraz();
        dveře.zobraz();
        klika.zobraz();
        podokno.zobraz();
        okno3.zobraz();
    }
    
    /**
     * Posune dům směrem dolů a poté ho hned zobrazí.
     */
    public void PosunDolu()
    {
        zeď.posunDolů();
        komín.posunDolů();
        vrch.posunDolů();
        střecha.posunDolů();
        okno1.posunDolů();
        tyč1.posunDolů();
        tyč2.posunDolů();
        okno2.posunDolů();
        tyč3.posunDolů();
        tyč4.posunDolů();
        dveře.posunDolů();
        klika.posunDolů();
        podokno.posunDolů();
        okno3.posunDolů();
        
        zeď.zobraz();
        komín.zobraz();
        vrch.zobraz();
        střecha.zobraz();
        okno1.zobraz();
        tyč1.zobraz();
        tyč2.zobraz();
        okno2.zobraz();
        tyč3.zobraz();
        tyč4.zobraz();
        dveře.zobraz();
        klika.zobraz();
        podokno.zobraz();
        okno3.zobraz();
    }
    
    /**
     * Posune dům podle zadané hodnoty x vodorovně a poté ho hned zobrazí.
     */
    public void PosunVodorovně(int x)
    {
        zeď.posunVpravo(x);
        komín.posunVpravo(x);
        vrch.posunVpravo(x);
        střecha.posunVpravo(x);
        okno1.posunVpravo(x);
        tyč1.posunVpravo(x);
        tyč2.posunVpravo(x);
        okno2.posunVpravo(x);
        tyč3.posunVpravo(x);
        tyč4.posunVpravo(x);
        dveře.posunVpravo(x);
        klika.posunVpravo(x);
        podokno.posunVpravo(x);
        okno3.posunVpravo(x);
        
        zeď.zobraz();
        komín.zobraz();
        vrch.zobraz();
        střecha.zobraz();
        okno1.zobraz();
        tyč1.zobraz();
        tyč2.zobraz();
        okno2.zobraz();
        tyč3.zobraz();
        tyč4.zobraz();
        dveře.zobraz();
        klika.zobraz();
        podokno.zobraz();
        okno3.zobraz();
    }
    
    /**
     * Posune dům podle zadané hodnoty y svisle a poté ho hned zobrazí.
     */
    public void PosunSvisle(int y)
    {
        zeď.posunDolů(-y);
        komín.posunDolů(-y);
        vrch.posunDolů(-y);
        střecha.posunDolů(-y);
        okno1.posunDolů(-y);
        tyč1.posunDolů(-y);
        tyč2.posunDolů(-y);
        okno2.posunDolů(-y);
        tyč3.posunDolů(-y);
        tyč4.posunDolů(-y);
        dveře.posunDolů(-y);
        klika.posunDolů(-y);
        podokno.posunDolů(-y);
        okno3.posunDolů(-y);
        
        zeď.zobraz();
        komín.zobraz();
        vrch.zobraz();
        střecha.zobraz();
        okno1.zobraz();
        tyč1.zobraz();
        tyč2.zobraz();
        okno2.zobraz();
        tyč3.zobraz();
        tyč4.zobraz();
        dveře.zobraz();
        klika.zobraz();
        podokno.zobraz();
        okno3.zobraz();
    }
    
    /**
     * Posune okno1 podle uživatel v domě a okmažitě zobrazí.
     */
    public void PosunOkna1(int x, int y)
    {
        okno1.posunDolů(-y);
        okno1.posunVpravo(x);
        tyč1.posunDolů(-y);
        tyč1.posunVpravo(x);
        tyč2.posunDolů(-y);
        tyč2.posunVpravo(x);
        
        zeď.zobraz();
        komín.zobraz();
        vrch.zobraz();
        střecha.zobraz();
        okno1.zobraz();
        tyč1.zobraz();
        tyč2.zobraz();
        okno2.zobraz();
        tyč3.zobraz();
        tyč4.zobraz();
        dveře.zobraz();
        klika.zobraz();
        podokno.zobraz();
        okno3.zobraz();
    }
    
    /**
     * Posune okno2 podle uživatel v domě a okmažitě zobrazí.
     */
    public void PosunOkna2(int x, int y)
    {
        okno2.posunDolů(-y);
        okno2.posunVpravo(x);
        tyč3.posunDolů(-y);
        tyč3.posunVpravo(x);
        tyč4.posunDolů(-y);
        tyč4.posunVpravo(x);
        
        zeď.zobraz();
        komín.zobraz();
        vrch.zobraz();
        střecha.zobraz();
        okno1.zobraz();
        tyč1.zobraz();
        tyč2.zobraz();
        okno2.zobraz();
        tyč3.zobraz();
        tyč4.zobraz();
        dveře.zobraz();
        klika.zobraz();
        podokno.zobraz();
        okno3.zobraz();
    }
    
    /**
     * Posune dveře podle uživatel v domě a okmažitě zobrazí.
     */
    public void PosunDveri(int x, int y)
    {
        dveře.posunDolů(-y);
        dveře.posunVpravo(x);
        klika.posunDolů(-y);
        klika.posunVpravo(x);
        
        zeď.zobraz();
        komín.zobraz();
        vrch.zobraz();
        střecha.zobraz();
        okno1.zobraz();
        tyč1.zobraz();
        tyč2.zobraz();
        okno2.zobraz();
        tyč3.zobraz();
        tyč4.zobraz();
        dveře.zobraz();
        klika.zobraz();
        podokno.zobraz();
        okno3.zobraz();
    }
    
    public void ZnicKomin()
    {
        for(int i = 0;i<5;i++)
        {
        komín.posunVpravo(-4);
        vrch.posunVpravo(-5);
        IO.čekej(100);
            for(int j = 0;j<22;j++)
            {
            komín.posunDolů(1);
            vrch.posunDolů(1);
            IO.čekej(100);
            }
        }
    }
}