package shop.platform.machinmarket.saport;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Transient;
@Component
public class Basket {

    private  static final Basket BASKET = new Basket();

    public Basket getBASKET() {
        return BASKET;
    }


    private Basket(){

    }

    public static Basket getBasket(){
        return BASKET;
    }

}
