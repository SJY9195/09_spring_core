package com.ohgiraffers.section03.annotationconfig.subsection02;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext(
                "section03/annotationconfig/subsection02/xml/spring-context.xml"
        );

        String[] beanNames = context.getBeanDefinitionNames();
        for(String bean : beanNames) {
            System.out.println("bean = " + bean);
        }

        MemberDAO memberDAO = context.getBean(MemberDAO.class);
        System.out.println(memberDAO.selectMember(1));
        System.out.println(memberDAO.insertMember(new MemberDTO(3,"user03","pass03", "홍석삼")));
        System.out.println(memberDAO.selectMember(3));

        // bean이 뭔지, 의존성 주입이라는게 뭔지, bean을 어떻게 관리하는지를 아는게 중요하다 !!!!
    }
}
