import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class TvorbaDotazy {
    //udelat getry a setry pro majitele a psi
    public static void main( String[ ] args ) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("majitel.odb");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction( ).begin( );
        
        //Create Department Entity
        
        //Store Department
        Pes pes1 = new Pes(1,"Rex");
        Pes pes2 = new Pes(2,"Alík");
        Pes pes3 = new Pes(1,"Pes");
        Pes pes4 = new Pes(3,"Jack");
        //Create Employee1 Entity
        Majitel majitel1 = new Majitel();
        majitel1.setJmeno("Jirka");
        majitel1.setPrijmeni("Novák");
        majitel1.addPes(pes1);
        majitel1.addPes(pes3);
        
        //Create Employee2 Entity
        Majitel majitel2 = new Majitel();
        majitel2.setJmeno("Jan");
        majitel2.setPrijmeni("Lehký");
        majitel2.addPes(pes2);
        //Create Employee3 Entity
        Majitel majitel3 = new Majitel();
        majitel3.setJmeno("Tomáš");
        majitel3.setPrijmeni("Zahradník");
        majitel2.addPes(pes4);
        
        //Store Employees
        em.persist(majitel1);
        em.persist(majitel2);
        em.persist(majitel3);
        em.persist(pes1);
        em.persist(pes2);
        em.persist(pes3);
        em.persist(pes4);
        //em.persist(pes1);
        /*Query q1 = em.createQuery("SELECT c FROM Majitel c");
        List list1 = q1.getResultList();
        for(Object element : list1) {
            Majitel mjtl = (Majitel)element;
            System.out.println(mjtl.getJmeno());
        }*/
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }
}