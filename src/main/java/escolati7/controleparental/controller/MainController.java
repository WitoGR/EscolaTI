package escolati7.controleparental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import escolati7.controleparental.model.PasswordModel;
import escolati7.controleparental.model.UserModel;
import escolati7.controleparental.repository.UserRepository;

@RestController
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
