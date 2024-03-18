package gambling;

import domain.Result;
import service.ServiceImpl;

import java.util.*;

public class Gambling {
    public static void main(String[] args) {

        ServiceImpl serviceImpl= new ServiceImpl();
        serviceImpl.makeCard();
        serviceImpl.draw();
        serviceImpl.pickMyCardList();
        serviceImpl.pickComputerCardList();
        serviceImpl.start();
        serviceImpl.result();

        // 결과 출력
        System.out.println("내 카드: " + serviceImpl.pickMyCardList());
        System.out.println("컴퓨터 카드: " + serviceImpl.pickComputerCardList());
        System.out.println("========================================");
        System.out.println("나: " + serviceImpl.start().get(0).toString());
        System.out.println("컴퓨터: " + serviceImpl.start().get(1).toString());
        System.out.println("========================================");
        System.out.println(serviceImpl.result());

//        String list = String.valueOf(serviceImpl.draw());

//        System.out.println(list);
//        System.out.println(serviceImpl.pickMyCardList());
//        System.out.println(serviceImpl.pickComputerCardList());


//        System.out.println("===========================================");
//        System.out.println("내 점수: " + "(" + myResult + ") " + myScore + "\n컴퓨터 점수: " + "(" + computerResult + ") " + computerScore);
//        System.out.println("===========================================");
    }
}