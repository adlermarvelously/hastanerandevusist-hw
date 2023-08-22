package com.merveadler.hastanerandevu.controllermvc;

import com.merveadler.hastanerandevu.constants.ProductsList;
import com.merveadler.hastanerandevu.model.ModelProductHome;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
@RequestMapping("/product")
public class ProductController {

    @GetMapping("")
    public ModelAndView home(){
        ModelAndView md = new ModelAndView("products/home");
        ModelProductHome model = new ModelProductHome();
        model.setTitle("Ürünler");
        model.setMenuList(Arrays.asList("Home","Products","Blog","About","Contact","Login","Register"));
        model.setUserName("Bir Kullanıcı");
        model.setUrunListesi(ProductsList.getProductList());
        md.addObject("model",model);
        return md;
    }
}
