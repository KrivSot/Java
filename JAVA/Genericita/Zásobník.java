import java.util.*;

/*******************************************************************************
 * Instance třídy {@code Zásobník} představují ...
 * The {@code Zásobník} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Zásobník<T1>
{
    
    private T1 promenna1;
    int pocet = 0;
    private Node first;
    private Node last;
    private int size;
    //ArrayList<String> list = new ArrayList<String>();
    
    public Zásobník(int maximalni_pocet)
    {
        this.pocet = maximalni_pocet;
    }
    
    public void add(T1 prv) {
        Node n = new Node(prv);
        if (size == 0) {
            this.first = n;
            this.first.previous = null;
            this.last = n;
            size++;
        } else if(pocet > size) {
            T1 prvek = get(size-1);
            Node j = new Node(prvek);
            this.last.next = n;
            this.last.next.previous = j;
            this.last = n;
            size++;
        }
        else
        {
            System.out.println("zásobník je plný");
        }        
    }
    
    /**
     * Smaze prvek na indexu i
     * @param i index mazaneho prvku
     * @throws IndexOutOfBoundsException pokud je i vyssi nebo rovna delce seznamu
     * @throws IllegalArgumentException pokud je i zaporne
     */
    public void remove(int i) {
        if (i >= size) {
            throw new IndexOutOfBoundsException("Mimo meze index:" + i + ", size:" + this.size);
        }
        if (i < 0) {
            throw new IllegalArgumentException("Index mensi nez 0");
        }
        if (i == 0) {
            first = first.next;
        } else {
            Node curr = first;
            for (int j = 0; j < i - 1; j++) { //najdeme predchozi
                curr = curr.next;
            }
            curr.next = curr.next.next; //a mazany prvek vynechame
            if (i == size - 1) { //pokud mazeme posledni
                last = curr;
            }
        }
        size--;
    }
    
    public int size() {
        return this.size;
    }
    
    public T1 get(int i) {
        if (i >= size) {
            throw new IndexOutOfBoundsException("Mimo meze index:" + i + ", size:" + this.size);
        }
        if (i < 0) {
            throw new IllegalArgumentException("Index mensi nez 0");
        }
        Node prvek = first;
        for (int j = 0; j < i; j++) {
            prvek = prvek.next;
        }
        return prvek.objekt;
    }
    
    /*public void vloz()throws InterruptedException
    {
        if(pocet != pocetvz)
        {
            System.out.println("Kolik nábojů chcete vložit ?");
            Scanner sc = new Scanner(System.in);
            int pocetn = Integer.valueOf(sc.next());
            for(int i = 0;i<pocetn;i++)
            {
                if(this.pocet > pocetvz)
                {
                    list.add("náboj");
                    this.pocetvz++;
                    System.out.println("Vložili jste jednu náboj");
                    Thread.sleep(500);
                }
                else
                {
                    System.out.println("Zásobník je plný"); i = pocetn; break;
                }
            }
        }
        else
        {
            System.out.println("Zásobník je plný");
        }
    }
    
    public void vyndej()throws InterruptedException
    {
        if(pocetvz > 0)
        {
            System.out.println("Kolik nábojů chcete vyndat ?");
            Scanner sc = new Scanner(System.in);
            int pocetn = Integer.valueOf(sc.next());
            for(int i = 0;i<pocetn;i++)
            {
                if(pocetvz > 0)
                {
                    list.remove(list.size() - 1);
                    this.pocetvz--;
                    System.out.println("Vyndali jste jednu náboj");
                    Thread.sleep(500);
                }
                else
                {
                    System.out.println("Zásobník je prázdný"); i = pocetn; break;
                }
            }
        }
        else
        {
            System.out.println("Zásobník je prázdný");
        }
    }*/
    
    private class Node {

        private T1 objekt;
        private Node next;
        private Node previous;

        private Node(T1 value) {
            this.objekt = value;
        }
    }
}
