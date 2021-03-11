//package controllers;
//
//import entity.Client;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import repositories.ClientRepository;
//
//@Controller
//
//public class ClientController {
//    @Autowired
//    private ClientRepository clientRepository;
//    @GetMapping("/register")
//    public String showRegistrationForm(Model model){
//        model.addAttribute("client", new Client());
//        return "clientRegister";
//    }
//    @PostMapping("/saving")
//    public String savingFirmRegistration(Client client){
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encodedPassword = passwordEncoder.encode(client.getPassword());
//        client.setPassword(encodedPassword);
//        clientRepository.save(client);
//        return "/login";
//    }
//}
//