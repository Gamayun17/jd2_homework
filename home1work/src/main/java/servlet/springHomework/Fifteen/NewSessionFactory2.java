package servlet.springHomework.Fifteen;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class NewSessionFactory2 {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration()
                        .configure("hibernate.cfg.xml")
                        .buildSessionFactory();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
