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
}
