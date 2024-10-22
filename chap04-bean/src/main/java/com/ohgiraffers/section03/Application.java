package com.ohgiraffers.section03;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("section03/xmlconfig/spring-context.xml");

        Product carpBread = (Product) context.getBean("carpBread");
        Product milk = (Product) context.getBean("milk");
        Product water = (Product) context.getBean("water");

        // 첫 번째 손님이 쇼핑 카트를 꺼낸다..
        ShoppingCart cart = (ShoppingCart) context.getBean("cart");
        cart.addItem(carpBread);
        cart.addItem(milk);
        System.out.println("cart 에 담긴 물품 : " + cart.getItems());

        // 두 번째 손님이 카트를 꺼낸다.
        ShoppingCart cart2 = (ShoppingCart) context.getBean("cart");
        cart2.addItem(water);
        System.out.println("cart2 에 담긴 물품 : " + cart2.getItems());

        ((GenericXmlApplicationContext)context).close(); //다운캐스팅!(자식이 부모자료형을 받는것) (GenericXmlPllacationContext자료형으로)
    }
}
