import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;


public class TvorbaDotazy {
    //udelat getry a setry pro majitele a psi
    public static void main( String[ ] args ) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Majitel.odb" );
        EntityManager em = emfactory.createEntityManager( );
        em.getTransaction( ).begin( );
        
        //Create Department Entity
        Department department = new Department();
        department.setName("Propagace");
        
        //Store Department
        em.persist(department);
      
        //Create Employee1 Entity
        Majitel majitel1 = new Majitel();
        majitel1.setEname("Jirka");
        majitel1.setSalary(30000.0);
        majitel1.setDeg("Vedoucí oddělení");
        employee1.setDepartment(department);
        
        //Create Employee2 Entity
        Employee employee2 = new Employee();
        employee2.setEname("Renata");
        employee2.setSalary(43000.0);
        employee2.setDeg("Mladší programátor");
        employee2.setDepartment(department);
        
        //Create Employee3 Entity
        Employee employee3 = new Employee();
        employee3.setEname("Petr");
        employee3.setSalary(50000.0);
        employee3.setDeg("Starší programátor");
        employee3.setDepartment(department);
        
        //Store Employees
        em.persist(employee1);
        em.persist(employee2);
        em.persist(employee3);
        
        Query q1 = em.createQuery("SELECT c FROM Majitel c");
        List list1 = q1.getResultList();
        for(Object element : list1) {
            Majitel mjtl = (Majitel)element;
            System.out.println(mjtl.getJmeno());
            
        }
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }
}
