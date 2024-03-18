package service;

import domain.Card;
import domain.Result;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service {
    List<String> drawCard = new ArrayList<>();
    List<String> pickMyCardResult = new ArrayList<>();
    List<String> pickComputerCardResult = new ArrayList<>();
    List<Integer> resultList = new ArrayList<>();

    // 카드 만들기
    @Override
    public List<Card> makeCard() {
        List<Card> deck = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if(i == 2 || i == 5 || i == 6) {
                Card card = new Card(i, false);
                deck.add(card);
            } else {
                Card card = new Card(i, true);
                deck.add(card);
            }
        }
        return deck;
    }
}