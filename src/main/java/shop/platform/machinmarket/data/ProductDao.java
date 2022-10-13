package shop.platform.machinmarket.data;

import org.hibernate.SessionFactory;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shop.platform.machinmarket.prod.Product;

import javax.annotation.PostConstruct;
import javax.security.auth.login.Configuration;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
@Component
public class ProductDao implements  ProdDao{



private  SFUtil util;

public ProductDao(SFUtil util) {
        this.util = util;
    }

    public Product findById(Long id){
        try (Session session = util.getSession()){
            session.beginTransaction();
            Product p = session.get(Product.class, id);
            session.getTransaction().commit();
            return p;
        }
    }



    public List<Product> findAll(){
        try(Session session = util.getSession()){
            session.getTransaction();
            List<Product> list = session.createQuery("SELECT p FROM Product p").getResultList();
            session.getTransaction().commit();
            return list;

        }
    }

    public void deletById(Long id){
       try (Session session = util.getSession()){
           session.getTransaction();
           Product p = session.get(Product.class , id);
           session.remove(p);
           session.getTransaction().commit();
       }
    }
  public void  saveOrUpdate(Product product){
      try (Session session = util.getSession()){
          session.getTransaction();
          session.save(product);
          session.getTransaction().commit();

      }
  }

    public ProductDao() {
    }
}
