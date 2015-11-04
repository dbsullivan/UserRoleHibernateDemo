package edu.madisoncollege.enterprisejava.persistence;

import edu.madisoncollege.enterprisejava.entity.UserRole;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author paulawaite
 * @version 1.0 10/21/15.
 */
public class UserRoleDao {

    /* Method to CREATE a userRole in the database */
    public Integer addUserRole(UserRole userRole) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer userRoleId = null;
        try {
            tx = session.beginTransaction();
            userRoleId = (Integer) session.save(userRole);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return userRoleId;
    }
}