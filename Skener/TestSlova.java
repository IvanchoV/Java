

public class TestSlova
{
     public static void main(String[] args)
    {
        Slovo sl1 = new Slovo("kiss");
        System.out.println(sl1.DejPlural("kiss"));

        System.out.println("Expected: kisses");
        System.out.println(sl1.DejPlural("phase"));
        System.out.println("Expected: phases");
        System.out.println(sl1.DejPlural("dish"));
        System.out.println("Expected: dishes");
        System.out.println(sl1.DejPlural("massage"));
        System.out.println("Expected: massages");
        System.out.println(sl1.DejPlural("witch"));
        System.out.println("Expected: witches");
        System.out.println(sl1.DejPlural("judge"));
        System.out.println("Expected: judges");
        System.out.println(sl1.DejPlural("lap"));
        System.out.println("Expected: laps");
        System.out.println(sl1.DejPlural("cat"));
        System.out.println("Expected: cats");
        System.out.println(sl1.DejPlural("clock"));
        System.out.println("Expected: clocks");
        System.out.println(sl1.DejPlural("cuff"));
        System.out.println("Expected: cuffs");
        System.out.println(sl1.DejPlural("death"));
        System.out.println("Expected: deaths");
        System.out.println(sl1.DejPlural("boy"));
        System.out.println("Expected: boys");
        System.out.println(sl1.DejPlural("girl"));
        System.out.println("Expected: girls");
        System.out.println(sl1.DejPlural("chair"));
        System.out.println("Expected: chairs");
        System.out.println(sl1.DejPlural("day"));
        System.out.println("Expected: days");
        System.out.println(sl1.DejPlural("monkey"));
        System.out.println("Expected: monkeys");
        System.out.println(sl1.DejPlural("bath"));
        System.out.println("Expected: baths");
        System.out.println(sl1.DejPlural("cherry"));
        System.out.println("Expected: cherries");
        System.out.println(sl1.DejPlural("knife"));
        System.out.println("Expected: knives");
        System.out.println(sl1.DejPlural("radio"));
        System.out.println("Expected: radios");
    }
}
