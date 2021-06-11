package edu.bit.ex.service;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.bit.ex.mapper.UserMapper;
import edu.bit.ex.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class UserService {

    @Autowired
    private BCryptPasswordEncoder passEncoder;

    @Inject
    private UserMapper userMapper;
    
    @Transactional(rollbackFor = Exception.class)
    public void addUser(UserVO userVO) {
       String password = userVO.getPassword();
       String encode = passEncoder.encode(password);

       userVO.setPassword(encode);

       userMapper.insertUser(userVO);
       userMapper.insertAuthorities(userVO);
    }
    

}