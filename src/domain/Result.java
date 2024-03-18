package domain;

public enum Result {
    SAMPAL(2000, "삼팔광땡"),
    ILPAL(1200, "일팔광땡"),
    ILSAM(1100, "일삼광땡"),
    TENGWANG(500, "장땡"),
    NINEGWANG(190, "9땡"),
    EIGHTGWANG(180, "8땡"),
    SEVENGWANG(170, "7땡"),
    SIXGWANG(160, "6땡"),
    FIVEGWANG(150, "5땡"),
    FOURGWANG(140, "4땡"),
    THREEGWANG(130, "3땡"),
    TWOGWANG(120, "2땡"),
    ONEGWANG(110, "1땡"),
    ALLI(16, "알리"),
    DOKSA(15, "독사"),
    GUPPING(14, "구삥"),
    JANGPPING(13, "장삥"),
    JANGSA(12, "장사"),
    SELYUG(11, "세륙"),
    NINEKKEUS(9, "9끗"),
    EIGHTKKEUS(8, "8끗"),
    SEVENKKEUS(7, "7끗"),
    SIXKKEUS(6, "6끗"),
    FIVEKKEUS(5, "5끗"),
    FOURKKEUS(4, "4끗"),
    THREEKKEUS(3, "3끗"),
    TWOKKEUS(2, "2끗"),
    ONEKKEUS(1, "1끗"),
    ZEROKKEUS(0, "망통"),
    AMHAENG(1300, "암행어사"),
    MUNGSA(300, "멍텅구리구사"),
    TTAENGJABI(200, "땡잡이"),
    PATO(20, "사구파토")
    ;

    private final int score;
    private final String result;

    Result(int score, String result) {
        this.score = score;
        this.result = result;
    }

    public int getScore() {
        return score;
    }

    public String getResult() {
        return result;
    }
}