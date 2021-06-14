package edu.bit.ex.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MemberVO {

    private String username;
    private String password;
    private int enabled;
    
    // 권한
    private List<AuthVO> authList;
    
    
}