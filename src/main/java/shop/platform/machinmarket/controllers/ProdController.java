package shop.platform.machinmarket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.platform.machinmarket.data_products.Product;
import shop.platform.machinmarket.data_products.ProductDao;
import shop.platform.machinmarket.data_products.ProductDto;

import java.util.ArrayList;

@RestController
public class ProdController {

    private ProductDto productDto;
    private ProductDao productDao;

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ProductDto showProductById(@RequestParam(name = "id") Integer id){
       Product p = productDao.findById(id);
        productDto = new ProductDto(p.getId(),p.getTitle(),p.getPrice());
        return productDto;
    }
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Product> showAllProducts(){
        return productDao.findAll();
    }

    @RequestMapping(value = "/products}", method = RequestMethod.POST)

    public void addProduct(@RequestParam(name = "id")Integer id,@RequestParam(name = "id") String title,@RequestParam(name = "id") Integer price){
        Product p = new Product(id,title,price);
        productDao.saveOrUpdate(p);

    }

    @RequestMapping(value = "/products/delete/{id}}", method = RequestMethod.POST)
    @ResponseBody
    public void productDelet(@RequestParam(name = "id") Integer id){
     productDao.deletById(id);

    }

}
