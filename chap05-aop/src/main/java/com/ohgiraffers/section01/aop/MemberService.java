package com.ohgiraffers.section01.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
//Bean은 Spring의 객체이다!

@Service
public class MemberService {

    private final MemberDAO memberDAO;

    @Autowired
    public MemberService(MemberDAO memberDAO) { //Spring에서 memberDAO를 자동으로 넣어준다! (넣어준적이 없다)
        this.memberDAO = memberDAO;     //MemberService의 객체를 생성 할때 @Autowired를 보고 생성자 사용할 때 MemberDAO 객체를 넣어준다!
    }

    public Map<Integer, MemberDTO> selectMembers(){
        System.out.println("selectMembers 메소드 실행");
        return memberDAO.selectMembers();
    }

    public MemberDTO selectMember(int id){
        System.out.println("selectMember 메소드 실행");
        return memberDAO.selectMember(id);
    }

    @Override
    public String toString() {
        return "MemberService{" +
                "memberDAO=" + memberDAO +
                '}';
    }

}
