package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator(){
        return new PersonalAccount(20, "110-233-2222");
    }   //이게 없으면 호출시마다 계속 새로운 객체를 생성한다! 하지만 이게 있으면 싱글톤으로 생성된다!!

    @Bean
    public MemberDTO memberGenerator(){
        MemberDTO member = new MemberDTO(
                30, "홍석천", "010-2222-3333", "hong@gmail.com",
                accountGenerator());
        return member;
    }

}


