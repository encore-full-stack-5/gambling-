package service;

import domain.Card;

import java.util.ArrayList;
import java.util.List;

public interface Service {
    // 카드 만들기
    List<Card> makeCard();

    // 카드 뽑기
    List<String> draw();
    List<String> pickMyCardList();
    List<String> pickComputerCardList();

    List<Integer> start();
    String result();
}