package shop.platform.machinmarket.data_products;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@AllArgsConstructor
//@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "title")
    String title;
    @Column(name = "price")
    int price;


    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id +", Надвание ='" + title + '\'' + ", Цена =" + price;
    }
}
