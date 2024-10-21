package com.ohgiraffers.section01.subsection01.field;

import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {  //Application이 Controller 역할!
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.ohgiraffers.section01"  //BookService 와 BookDAOImple 에 있는 Bean 2개를 갖고 온것이다!
        );

        BookService bookService = context.getBean(BookService.class);
        List<BookDTO> bookDTOList = bookService.selectAllBook();
        for (BookDTO book : bookDTOList) {
            System.out.println("book = " + book);
        }

        System.out.println(bookService.selectOneBook(1));

    }
}
