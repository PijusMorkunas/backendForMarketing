package controllers;

import entity.Firm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import repositories.FirmRepository;
@Controller

public class FirmController {
    @Autowired
    private FirmRepository firmRepository;
    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("firm", new Firm());
        return "firmRegister";
    }
    @PostMapping("/saving")
    public String savingFirmRegistration(Firm firm){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(firm.getPassword());
    firm.setPassword(encodedPassword);
    firmRepository.save(firm);
    return "/login";
    }
}
