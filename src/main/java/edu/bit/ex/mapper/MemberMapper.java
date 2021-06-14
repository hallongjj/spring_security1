package edu.bit.ex.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.bit.ex.vo.MemberVO;
import edu.bit.ex.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Mapper
public interface MemberMapper {

    public MemberVO getMember(String username);

}