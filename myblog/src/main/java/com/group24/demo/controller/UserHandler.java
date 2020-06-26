package com.group24.demo.controller;

        import com.group24.demo.entity.User;
        import com.group24.demo.repository.UserRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;


@RestController
@RequestMapping("/login")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;

   @PostMapping("/user")
    public String login(@RequestBody User user){
      String check=userRepository.findByName(user.getName()).getPassword();
      System.out.println(check);
      if(check==null)
          return "fail";
      else
          return check;
        }
}
