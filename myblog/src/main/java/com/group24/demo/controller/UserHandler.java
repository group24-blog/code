package com.group24.demo.controller;

        import com.group24.demo.entity.User;
        import com.group24.demo.repository.UserRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.List;


@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;

   @PostMapping("/login")
    public Boolean login(@RequestBody User user) {
       System.out.println(user.getAccount());
       System.out.println(user.getPassword());
       User userCheck = userRepository.findByAccount(user.getAccount());
       System.out.println(user.getAccount());
       System.out.println(userCheck);
       if (userCheck.getPassword().equals(user.getPassword()))
           return true;
       else
           return false;
   }
   @GetMapping("/get_user_info")
    public User getInfo(User user) {
       System.out.println(user.getAccount());
       User userCheck = userRepository.findByAccount(user.getAccount());
      return userCheck;
        }

   @PostMapping("/register")
    public Boolean register(@RequestBody User user)
        { User userCheck=new User();
        userCheck.setAccount(user.getAccount());
        userCheck.setPassword(user.getPassword());
        userCheck.setTime(new Date());
        userCheck.setEmail(user.getEmail());
        userCheck.setSex(user.getSex());
        if(userRepository.save(userCheck)!=null)
            return true;
        else
            return false;
        }

        @PostMapping("/register_check")
        public Boolean  registerCheck(@RequestBody User user)
        { User userCheck = userRepository.findByAccount(user.getName());
            if(userCheck==null)
                return true;
            else
                return false;
        }
}
