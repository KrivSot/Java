import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/*******************************************************************************
 * Instance třídy {@code Majitel} představují ...
 * The {@code Majitel} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
@Entity
public class Majitel
{
    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    int id;
    String jmeno;
    String prijmeni;
    @OneToMany
    ArrayList<Pes> seznamPsu = new ArrayList<Pes>();
    
    public Majitel()//predelat na entitny, přidat relační vztahy (1:1, 1:N, M:N)
    {
        
    }
    
    public Majitel(int i, String jmeno, String prijmeni)
    { 
        this.id = i;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }
    
    public void pridejPsa(Pes pes)
    {
        seznamPsu.add(pes);
    }
    
    public String getJmeno()
    {
        return jmeno;
    }
}