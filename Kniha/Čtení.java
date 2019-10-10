/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */
import java.util.Scanner;
import java.io.*;  
import java.nio.file.*;



/*******************************************************************************
 * Instance třídy {@code Čtení} představují ...
 * The {@code Čtení} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Čtení
{
    private String data;
    
    public Čtení(String fileName)throws Exception 
    {
        data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName))); 
    }
    
    public void Vypiš()
    {
        System.out.print('\u000c');
        System.out.println(data);
    }
    
    public int pocetSlova(String slovo)
    {
         int pocetSlova = 0;
         int DelkaTextuPoOdectu = this.data.replaceAll(slovo, "").length();
         pocetSlova = (this.data.length() - DelkaTextuPoOdectu) / slovo.length();
         return pocetSlova;
    }
    
    public void Kapitola(int kapitola)
    {
        System.out.print('\u000c');
        String znak = vratRimana(kapitola);
        boolean nalezeno1 = data.contains("CHAPTER " + znak);
        if(nalezeno1)
        {
         int začátek = data.indexOf("CHAPTER " + znak, 0);
         kapitola = kapitola + 1;
         znak = vratRimana(kapitola);
         boolean nalezeno2 = data.contains("CHAPTER " + znak);
         int konec;
         if(nalezeno2)
         {
             konec = data.indexOf("CHAPTER " + znak, začátek + 1);
         }
         else
         {
             konec = data.indexOf("THE END " + začátek + 1);
         }
         System.out.println(data.substring(začátek, konec));
        }
        else
        {
            System.out.println("Byl dosažen maximální počet kapitol.");
        }         
    }
    
    static String vratRimana(int cislo) {
       
        String riman[] = {"M", "XM", "CM", "D", "XD", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuffer vysledek = new StringBuffer();

        while (cislo>0) {
            for (int i=0; i<arab.length; i++) {
                if ((cislo-arab[i])>=0) {
                    cislo-=arab[i];
                    vysledek.append(riman[i]);
                    break;
                }                   
            }
        }
        
        return vysledek.toString();
    }
    
    public void Morseovka()
    {
    System.out.print('\u000c');
    Scanner input = new Scanner(System.in);    
    char[] znaky = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '?', ',', '!', '.', ';', '/', '=', '-'};
    String[] morseovka = { "|", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",  "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "..--..", "--..--", "--...-", ".-.-.-", "-.-.-.", "-..-.", "-....-"};
    String novýText = "";
    data = data.toLowerCase();
      
    for (int i = 0; i < data.length(); i++) {
      for (short j = 0; j < 45; j++) {
        if (data.charAt(i) == znaky[j]) {
          novýText += morseovka[j];
          novýText += "  ";
          break;
        }    
      }
    }
    System.out.println(novýText);
    }
}
