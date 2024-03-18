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
        @Override
    public List<String> draw() {
        List<Card> deck = makeCard();
        List<String> drawCardList = new ArrayList<>();
        String drawDeck = "";
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * 9);
            deck.get(index);

            int uniqueCk = (int) (Math.random() * 2);

            if (uniqueCk == 0) {
                drawDeck = String.valueOf(makeCard().get(index).getMonth());
            } else {
                drawDeck = makeCard().get(index).getMonth() + "U";
            }

            drawCardList.add(drawDeck);

            for (int j = 0; j < i; j++) {
                if (drawCardList.get(i).equals(drawCardList.get(j))) {
                    drawCardList.remove(j);
                    i--;
                }
            }
        }

        return drawCard = drawCardList;
    }
}