import java.util.List;
import java.util.Date;
import java.util.Iterator;

import edu.madisoncollege.enterprisejava.entity.UserRole;
import edu.madisoncollege.enterprisejava.persistence.UserRoleDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserRoleDriver {
    public static void main(String[] args) {
        UserRoleDao dao = new UserRoleDao();
        UserRole userRole = new UserRole(0, "abc123", "General");
        dao.addUserRole(userRole);
    }
}