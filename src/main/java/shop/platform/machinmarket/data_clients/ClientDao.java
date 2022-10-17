package shop.platform.machinmarket.data_clients;

import org.hibernate.Session;

import shop.platform.machinmarket.data_products.SFUtil;
import shop.platform.machinmarket.data_products.Product;

import java.util.ArrayList;

public class ClientDao {

    private  SFUtil util;

    public ClientDao(SFUtil util) {
        this.util = util;
    }

    public ClientDao() {
    }

    public Client findById(Long id){
        try (Session session = util.getSession()){
            session.beginTransaction();
            Client c = session.get(Client.class, id);
            session.getTransaction().commit();
            return c;
        }
    }



    public ArrayList<Client> findAll(){
        try(Session session = util.getSession()){
            session.getTransaction();
            ArrayList<Client> list = (ArrayList<Client>) session.createQuery("SELECT c FROM Client c").getResultList();
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
}
