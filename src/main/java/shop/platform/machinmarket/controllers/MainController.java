package shop.platform.machinmarket.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import shop.platform.machinmarket.prod.Product;
import shop.platform.machinmarket.repo.Repo;
import shop.platform.machinmarket.servise.ShopServise;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final ShopServise servise;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!!!";
    }

    @GetMapping("/calcul")
    @ResponseBody
    public int c(@RequestParam(name = "gggggg") int a, @RequestParam(required = false, defaultValue = "0") int b) {
        return a + b;
    }

    @GetMapping("/product/{name}/info")
    @ResponseBody
    public String info(@PathVariable(name = "name") String id) {
        return "Product id = " + id;
    }


    @GetMapping("/mainfront")
    public String page(Model model) {
        model.addAttribute("product", new Product(1,"Engine", 5000000.0));
        return "index.html";
    }
    @GetMapping("/allprod")
    public String menu(Model model){
        model.addAttribute("detail", servise.all());
        return "details.html";
    }

}
