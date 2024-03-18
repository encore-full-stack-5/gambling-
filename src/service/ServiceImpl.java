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
        return null;
    }

    @Override
    public List<String> pickMyCardList() {
        return null;
    }

    @Override
    public List<String> pickComputerCardList() {
        return null;
    }

    boolean uniqueCk = false;
    int myResult = 0;
    int computerResult = 0;
    @Override
    public List<Integer> start() {

        List<Integer> result = new ArrayList<>();

        List<String> normalMyCard = new ArrayList<>();
        List<String> normalComputerCard = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String myCard = pickMyCardResult.get(i).substring(0, 1);
            String computerCard = pickComputerCardResult.get(i).substring(0, 1);
            normalMyCard.add(myCard);
            normalComputerCard.add(computerCard);
        }

        List<String> pickMyCardList = pickMyCardResult;
        List<String> pickComputerCardList = pickComputerCardResult;

        for (int i = 0; i < 2; i++) {
            List<String> pickCardList = new ArrayList<>();
            List<String> normalCard = new ArrayList<>();
            if (i == 0) {
                pickCardList = pickMyCardList;
                normalCard = normalMyCard;
            } else {
                pickCardList = pickComputerCardList;
                normalCard = normalComputerCard;
            }
            if(pickCardList.get(0).contains("U") && pickCardList.get(1).contains("U")) { // 둘 다 "U"임?
                if (pickCardList.contains("3U") && pickCardList.contains("8U")) { // 3.8 광땡
                    if (i == 0) {
                        myResult = Result.SAMPAL.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.SAMPAL.getScore();
                        resultList.add(computerResult);
                    }
                } else if (pickCardList.contains("1U") && pickCardList.contains("8U")) { // 1.8 광땡
                    if (i == 0) {
                        myResult = Result.ILPAL.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.ILPAL.getScore();
                        resultList.add(computerResult);
                    }
                } else if (pickCardList.contains("1U") && pickCardList.contains("3U")) { // 1.3 광땡
                    if (i == 0) {
                        myResult = Result.ILSAM.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.ILSAM.getScore();
                        resultList.add(computerResult);
                    }
                } else if (pickCardList.contains("7U") && pickCardList.contains("4U")) { // 암행어사
                    if (i == 0) {
                        myResult = Result.AMHAENG.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.AMHAENG.getScore();
                        resultList.add(computerResult);
                    }
                } else if (pickCardList.contains("4U") && pickCardList.contains("9U")) { // 멍텅구리구사
                    if (i == 0) {
                        myResult = Result.MUNGSA.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.MUNGSA.getScore();
                        resultList.add(computerResult);
                    }
                } else if (pickCardList.contains("7U") && pickCardList.contains("3U")) { // 땡잡이
                    if(i == 0) {
                        myResult = Result.TTAENGJABI.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.TTAENGJABI.getScore();
                        resultList.add(computerResult);
                    }
                } else {
                    uniqueCk = true;
                }
            }
            if (!(pickCardList.get(0).contains("U") && pickCardList.get(1).contains("U")) || uniqueCk) { // 둘 다 "U"가 아님, 둘 중 하나 "U"일수도?
                if (normalCard.get(0).equals(normalCard.get(1))) {
                    switch (normalCard.get(0)) { // 땡
                        case "10":
                            if (i == 0) {
                                myResult = Result.TENGWANG.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.TENGWANG.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case "9":
                            if (i == 0) {
                                myResult = Result.NINEGWANG.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.NINEGWANG.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case "8":
                            if (i == 0) {
                                myResult = Result.EIGHTGWANG.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.EIGHTGWANG.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case "7":
                            if (i == 0) {
                                myResult = Result.SEVENGWANG.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.SEVENGWANG.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case "6":
                            if (i == 0) {
                                myResult = Result.SIXGWANG.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.SIXGWANG.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case "5":
                            if (i == 0) {
                                myResult = Result.FIVEGWANG.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.FIVEGWANG.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case "4":
                            if (i == 0) {
                                myResult = Result.FOURGWANG.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.FOURGWANG.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case "3":
                            if (i == 0) {
                                myResult = Result.THREEGWANG.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.THREEGWANG.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case "2":
                            if (i == 0) {
                                myResult = Result.TWOGWANG.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.TWOGWANG.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case "1":
                            if (i == 0) {
                                myResult = Result.ONEGWANG.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.ONEGWANG.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        default:
                            System.out.println("Switch Error");
                    }
                } else if (normalCard.contains("4") && normalCard.contains("9")) { // 일반 파토
                    if (i == 0) {
                        myResult = Result.PATO.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.PATO.getScore();
                        resultList.add(computerResult);
                    }
                } else if (normalCard.contains("1") && normalCard.contains("2")) { // 알리
                    if (i == 0) {
                        myResult = Result.ALLI.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.ALLI.getScore();
                        resultList.add(computerResult);
                    }
                } else if (normalCard.contains("1") && normalCard.contains("4")) { // 독사
                    if (i == 0) {
                        myResult = Result.DOKSA.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.DOKSA.getScore();
                        resultList.add(computerResult);
                    }
                } else if (normalCard.contains("1") && normalCard.contains("9")) { // 구삥
                    if (i == 0) {
                        myResult = Result.GUPPING.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.GUPPING.getScore();
                        resultList.add(computerResult);
                    }
                } else if (normalCard.contains("1") && normalCard.contains("10")) { // 장삥
                    if (i == 0) {
                        myResult = Result.JANGPPING.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.JANGPPING.getScore();
                        resultList.add(computerResult);
                    }
                } else if (normalCard.contains("10") && normalCard.contains("4")) { // 장사
                    if (i == 0) {
                        myResult = Result.JANGSA.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.JANGSA.getScore();
                        resultList.add(computerResult);
                    }
                } else if (normalCard.contains("4") && normalCard.contains("6")) { // 세륙
                    if (i == 0) {
                        myResult = Result.SELYUG.getScore();
                        resultList.add(myResult);
                    } else {
                        computerResult = Result.SELYUG.getScore();
                        resultList.add(computerResult);
                    }
                } else {
                    int ggt = (Integer.parseInt(normalCard.get(0))+Integer.parseInt(normalCard.get(1)))%10;
                    switch (ggt) {
                        case 9:
                            if (i == 0) {
                                myResult = Result.NINEKKEUS.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.NINEKKEUS.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case 8:
                            if (i == 0) {
                                myResult = Result.EIGHTKKEUS.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.EIGHTKKEUS.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case 7:
                            if (i == 0) {
                                myResult = Result.SEVENKKEUS.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.SEVENKKEUS.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case 6:
                            if (i == 0) {
                                myResult = Result.SIXKKEUS.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.SIXKKEUS.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case 5:
                            if (i == 0) {
                                myResult = Result.FIVEKKEUS.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.FIVEKKEUS.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case 4:
                            if (i == 0) {
                                myResult = Result.FOURKKEUS.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.FOURKKEUS.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case 3:
                            if (i == 0) {
                                myResult = Result.THREEKKEUS.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.THREEKKEUS.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case 2:
                            if (i == 0) {
                                myResult = Result.TWOKKEUS.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.TWOKKEUS.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case 1:
                            if (i == 0) {
                                myResult = Result.ONEKKEUS.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.ONEKKEUS.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        case 0:
                            if (i == 0) {
                                myResult = Result.ZEROKKEUS.getScore();
                                resultList.add(myResult);
                            } else {
                                computerResult = Result.ZEROKKEUS.getScore();
                                resultList.add(computerResult);
                            }
                            break;
                        default:
                            System.out.println("Error");
                    }
                }
            }
        }

        return resultList;
    }

    @Override
    public String result() {
        return null;
    }
}