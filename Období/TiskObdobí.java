/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */

import java.util.*;
import java.awt.Color;


/*******************************************************************************
 * Třída {@code TiskObdobí} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class TiskObdobí
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        for(Období obd : Období.values())
        System.out.println(obd + "   " + obd.ordinal() + " " + obd.getParametry());
        
        EnumSet<Období> set0 = EnumSet.allOf(Období.class);
        System.out.println("Set0 obsahuje všechny období: " + set0);
        EnumSet<Období> set1 = EnumSet.of(Období.JARO);
        System.out.println("Set1: " + set1);
        EnumSet<Období> set2 = EnumSet.complementOf(set1);
        System.out.println("Set2 obsahuje to co neobsahuje set1: " + set2);
        EnumSet<Období> set3 = EnumSet.range(Období.LÉTO, Období.ZIMA);
        System.out.println("Set3 obsahuje rozsah: " + set3);
        
        for (Období obd: Období.values())
        {
            System.out.println(obd + "  " + obd.činnosti(obd));
        }
    }
}
