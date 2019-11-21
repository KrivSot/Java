import java.util.*;

/*******************************************************************************
 * Instance třídy {@code Zásobník} představují ...
 * The {@code Zásobník} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class SingleLinkedList <T1>
{
    
    private T1 promenna1;
    int pocet = 50;
    //int pocetsedadel = 0;
    private Node first;
    private Node last;
    private Node previous;
    private Node PocetSedadel;
    private int size;
    //ArrayList<String> list = new ArrayList<String>();
    
    public SingleLinkedList(/*int maximalni_pocet_aut*/)
    {
        //this.pocet = maximalni_pocet_aut;
    }
    
    public void add(T1 znacka/*, T1 PocetSedadel*/) {
        Node n = new Node(znacka);
        //Node f = new Node(PocetSedadel);
        if (size == 0) {
            this.first = n;
            //this.PocetSedadel = f;
            //this.first.PocetSedadel = f;
            this.first.previous = null;
            this.last = n;
            size++;
        } else if(pocet > size) {
            this.previous = last;
            //this.PocetSedadel.next = f;
            //this.last.PocetSedadel = f;
            this.last.next = n;
            this.last = n;
            this.last.previous = previous;
            size++;
        }
        else
        {
            System.out.println("Garáž je plná.");
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
            first.previous = null;
        } else {
            Node curr = first;
            for (int j = 0; j < i - 1; j++) { //najdeme predchozi
                curr = curr.next;
                curr.previous = curr.previous.previous;
            }
            curr.next = curr.next.next;
            curr.next.previous = curr.next.previous;//a mazany prvek vynechame
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
    
    public void addFirst(T1 znacka)
    {
        Node n = new Node(znacka);
        this.first.previous = n;
        n.next = this.first;
        this.first = n;
        this.first.previous = null;
        size++;
    }
    
    public void addLast(T1 znacka)
    {
        Node n = new Node(znacka);
        this.previous = last;
        this.last.next = n;
        this.last = n;
        this.last.previous = previous;
        size++;
    }
    
    public void removeFirst() {
        first = first.next;
        first.previous = null;
        size--;
    }
    
    public void removeLast() {
        this.last = last.previous;
        size--;
    }
   
    public T1 getFirst() {
        Node prvek = first;
        return prvek.objekt;
    }
    
    public T1 getLast() {
        Node prvek = first;
        for (int j = 0; j < size -1; j++) {
            prvek = prvek.next;
        }
        return prvek.objekt;
    }
    
    /*public void set(int i,T1 znacka)
    {
        Node curr = first;
        Node n = new Node(znacka);
            for (int j = 0; j < i - 1; j++) { //najdeme predchozi
                n = curr.next;
            }
        this.last = n;
        //curr.next.previous = n;//a mazany prvek vynechame
    }*/
    
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
        private Node PocetSedadel;

        private Node(T1 value) {
            this.objekt = value;
        }
    }
}
