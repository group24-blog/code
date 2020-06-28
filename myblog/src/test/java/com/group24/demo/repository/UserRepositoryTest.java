package com.group24.demo.repository;
import com.group24.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    //读取数据库中
   @Test
    void findAll()
    {   System.out.println(userRepository.findByAccount("shengziwei").getPassword());
       if(userRepository.findByAccount("shengziwie")==null);
       System.out.println("fail");
       //System.out.println(userRepository.findById(1));
        System.out.println(userRepository.findAll().get(0).getAccount());
    }
    //保存到数据库
    @Test
  void save(){
        User user=new User();
        user.setAccount("微");
        user.setPassword("1234567");
        user.setTime(new Date());
        User user1=userRepository.save(user);

    }

}
