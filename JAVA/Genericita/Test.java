/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Třída {@code Test} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Test
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        try{
       SingleLinkedList seznam = new SingleLinkedList();
       //naplnění hodnotami
       seznam.add(1);
       seznam.add(2);
       seznam.add(3);
       seznam.add(4);
       seznam.add(5);
       seznam.add(6);
       seznam.add(7);

       //vymaže se 4-tý prvek
       seznam.remove(3);

       seznam.add(80);
       System.out.println(seznam);
       System.out.println("Velikost seznamu = "+seznam.size());
       System.out.println("Třetí položka seznamu = "+seznam.get(2));
       }
       catch(IllegalArgumentException | IndexOutOfBoundsException e){
          System.out.println(e.getMessage());
       }
    }
    }
