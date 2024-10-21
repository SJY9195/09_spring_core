package com.ohgiraffers.section03.annotationconfig.subsection01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection03") //Configuration을 가져올 기능하는 객체
@ComponentScan(basePackages = "com.ohgiraffers.common")   //common 하위에 있는 DAO를 불러오는것!
public class ContextConfiguration {

}
