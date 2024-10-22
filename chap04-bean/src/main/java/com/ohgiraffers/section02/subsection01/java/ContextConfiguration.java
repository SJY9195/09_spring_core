package com.ohgiraffers.section02.subsection01.java;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵", 1000, new Date());
    }

    @Bean
    public Product milk(){
        return new Beverage("딸기우유", 1500, 500);
    }

    @Bean
    public Product water(){
        return new Beverage("지리산암반수", 1000, 500);
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }

    @Bean(initMethod = "openShop", destroyMethod = "closeShop")  //컨테이너가 생성되고 빈에 넣을 첫번째 객체가 initMethod! 완료,종료시킬땐 destroyMethod!
    public Owner owner(){                                        // Bean의 위치는 상관없이 다 등록된다!
        return new Owner();                                      // ex)채팅방 입장, 종료 //가비지컬렉터가 수거해가는 시점에 destroyMethod가 발동되므로, 일반적으로 종료될땐 발동x하므로, 다운캐스팅시켜야한다!
    }
}