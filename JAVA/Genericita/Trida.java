/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Trida} představují ...
 * The {@code Trida} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Trida<T1,T2>
{

    private T1 promenna1;
    private T2 promenna2;
    
    public Trida(T1 promenna1, T2 promenna2)
    {
        this.promenna1 = promenna1;
        this.promenna2 = promenna2;
    }
    
    public void vypisAtributy()
    {
        System.out.println(this.promenna1);
        System.out.println(this.promenna2);
    }
    
    public void vypisAtribut1()
    {
        System.out.println(this.promenna1);
    }
    
    public void vypisAtribut2()
    {
        System.out.println(this.promenna2);
    }
    
    public boolean porovnej()
    {
        if(this.promenna1 == this.promenna2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
