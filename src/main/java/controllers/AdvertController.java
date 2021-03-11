package controllers;

import entity.Advert;
import entity.Firm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import services.AdvertService;
import services.FirmService;
@Controller

public class AdvertController {
    @Autowired
    private AdvertService advertService;
        @Autowired
    private FirmService firmService;

    @RequestMapping("/saveAdvert/{id}")
    public String saveAdvert(Model model, @PathVariable(name = "id")Long id, Advert advert, Firm firm){
        advertService.save(firm, advert);
        return "redirect:/home";
    }
    @RequestMapping("/deleteAdvert/{id}")
    public String deleteAdvert(@PathVariable(name = "id") Long id) {
        advertService.delete(id);
        return "redirect:/home";
    }

}
