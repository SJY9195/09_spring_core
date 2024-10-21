package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //Primary가 없으면 기준이 없어지므로 에러가 뜬다! (같은종류(동일한타입)의 Component가 여러개이므로)
public class Charmander implements Pokemon  {

    @Override
    public void attack() {
        System.out.println("파이리 불꽃");
    }
}
