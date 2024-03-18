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

        boolean isSkill = false;
        int myScore = resultList.get(0);
        int computerScore = resultList.get(1);
        String resultTxt = "";

        if (isSampal(myScore)) {
            resultTxt = "승리";
        } else if (isSampal(computerScore)) {
            resultTxt = "패배";
        } else {
            // 암행어사
            if (isAmHaeng(myScore)) {
                if (isAmHaeng(myScore) && isGwang(computerScore)) {
                    resultTxt = "승리";
                    isSkill = true;
                } else {
                    myScore = 1;
                }
            }
            if (isAmHaeng(computerScore)) {
                if (isAmHaeng(computerScore) && isGwang(myScore)) {
                    resultTxt = "패배";
                    isSkill = true;
                } else {
                    computerScore = 1;
                }
            }
            // 땡잡이
            if (isTtaengJabi(myScore)) {
                if (isTtaengJabi(myScore) && isTtaeng(computerScore)) {
                    resultTxt = "승리";
                    isSkill = true;
                } else {
                    myScore = 0;
                }
            }
            if (isTtaengJabi(computerScore)) {
                if (isTtaengJabi(computerScore) && isTtaeng(myScore)) {
                    resultTxt = "패배";
                    isSkill = true;
                } else {
                    computerScore = 0;
                }
            }
            // 멍텅구리구사 / 구사 파토
            if((myScore == 300 || myScore == 20) || (computerScore == 300 || computerScore == 20)) {
                if (isMungsa(computerScore, myScore) || isPato(computerScore , myScore)) {
                    resultTxt = "재경기";
                    isSkill = true;
                } else {
                    resultTxt = "패배";
                    isSkill = true;
                }
            }

            // 점수 비교
            if (!isSkill) {
                if (myScore > computerScore) {
                    resultTxt = "승리";
                } else if (myScore == computerScore) {
                    resultTxt = "재경기";
                    // start();
                } else {
                    resultTxt = "패배";
                }
            }
        }
        return resultTxt;
    }

    private static boolean isSampal(int score) {
        return score == 2000;
    }
    private static boolean isGwang(int score) {
        return score == 1100 || score == 1200; // 1.3광땡, 1.8광땡
    }
    private static boolean isAmHaeng(int score) {
        return score == 1300; // 암행어사
    }
    private static boolean isPato(int target, int me) {
        return (me == 20 && target < 20) || (target == 20 && me < 20); // 파토
    }
    private static boolean isMungsa(int target, int me) {
        return (me == 300 && target < 300) || (target == 300 && me < 300); // 멍사
    }
    private static boolean isTtaeng(int score) {
        return (score >= 110 && score <= 190); // 땡
    }
    private static boolean isTtaengJabi(int score) {
        return score == 200; // 땡잡이
    }
}

    List<String> drawCard = new ArrayList<>();
    List<String> pickMyCardResult = new ArrayList<>();
    List<String> pickComputerCardResult = new ArrayList<>();
    List<Integer> resultNumList = new ArrayList<>();
    List<String> resultStringList = new ArrayList<>();
    // 카드 만들기
    @Override
    public List<Card> makeCard() {
        List<Card> deck = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (i == 2 || i == 5 || i == 6) {
                Card card = new Card(i, false);
                deck.add(card);
            } else {
                Card card = new Card(i, true);
                deck.add(card);
            }
        }
        return deck;
    }

    // 카드 뽑기
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