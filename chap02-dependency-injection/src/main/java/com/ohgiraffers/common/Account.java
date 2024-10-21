package com.ohgiraffers.common;

public interface Account {   //인터페이스 = 가전제품 리모컨!!!

    String getBalance(); // 잔액

    String deposit(int money); // 입금

    String withDraw(int money); // 출금

}
