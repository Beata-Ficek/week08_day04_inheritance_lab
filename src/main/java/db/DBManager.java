package db;

        import models.Administrator;
        import models.Employee;
        import models.Manager;
        import org.hibernate.Criteria;
        import org.hibernate.HibernateException;
        import org.hibernate.Session;
        import org.hibernate.criterion.Restrictions;

        import java.util.List;

public class DBManager {

    private  static Session session;

    public static List<Administrator> getAdministratorsManager(Manager manager){
        List<Administrator> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Administrator.class);
//            cr.createAlias("managers", "manager"); // ADDED
            cr.add(Restrictions.eq("manager", manager)); // ADDED
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }


    public static void addAdministratorToManager(Administrator administrator, Manager manager) {
        manager.addAdministrator(administrator);
        DBHelper.update(manager);
        administrator.setManager(manager);
        DBHelper.update(administrator);
    }




}
