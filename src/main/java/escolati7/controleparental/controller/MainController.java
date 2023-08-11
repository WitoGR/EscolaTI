package escolati7.controleparental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import escolati7.controleparental.interfaces.UserRepository;
import escolati7.controleparental.model.PasswordModel;
import escolati7.controleparental.model.UserModel;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class MainController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/testeSenha")
    public String oi(){
        PasswordModel password = new PasswordModel();
        return password.getPassword();
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String email){
        UserModel u = new UserModel();
        u.setEmail(email);
        userRepository.save(u);

        return "Saved";
    }

    public @ResponseBody Iterable<UserModel> getAllUsers(){
        return userRepository.findAll();
    }
}
