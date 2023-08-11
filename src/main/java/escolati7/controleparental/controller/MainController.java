package escolati7.controleparental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import escolati7.controleparental.interfaces.UserRepository;

import escolati7.controleparental.model.PasswordModel;
import escolati7.controleparental.model.UserModel;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class MainController {
    
    @Autowired
    //private UserRepository userRepository;

    @GetMapping(path="/testeSenha")
    public String oi(){
        PasswordModel password = new PasswordModel();
        return password.getPassword();
    }

}
