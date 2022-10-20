package shop.platform.machinmarket.data_products;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

import org.hibernate.Session;
import shop.platform.machinmarket.data_clients.Client;

@Component
public class ProductDao {



private  SFUtil util;

public ProductDao(SFUtil util) {
        this.util = util;
    }

    public Product findById(int id){
        try (Session session = util.getSession()){
            session.beginTransaction();
            Product p = session.get(Product.class, id);
            session.getTransaction().commit();
            return p;
        }
    }



    public ArrayList<Product> findAll(){
        try(Session session = util.getSession()){
            session.getTransaction();
            ArrayList<Product> list = (ArrayList<Product>) session.createQuery("SELECT p FROM Product p").getResultList();
            session.getTransaction().commit();
            return list;

        }
    }

    public void deletById(int id){
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
