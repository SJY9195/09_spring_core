package com.ohgiraffers.section01.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceField")
public class BookService {  // DAO에 명령 전달

    @Autowired // 필드 주입 (인터페이스 상속 받은게(구현할게) 하나 밖에 없으므로 자동 주입한다는 객체)  //이것이 BookDAOImpl에 있는 bookDAO를 불러온것!!!
    private BookDAO bookDAO; // 구현체가 있으며 구현체를 넣어준다는것!

    public List<BookDTO> selectAllBook(){
        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBook(int seq){
        return bookDAO.selectOneBook(seq);
    }

}
