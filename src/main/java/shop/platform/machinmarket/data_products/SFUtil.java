package shop.platform.machinmarket.data_products;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SFUtil {
    private SessionFactory factory;

    public void init(){
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }

    public Session getSession(){
       return factory.getCurrentSession();
    }

    public void shotdown(){
        if (factory!=null){
            factory.close();
        }
    }
}