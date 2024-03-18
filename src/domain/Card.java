package domain;

public class Card {
    // field
    int month = 10; // 월
    boolean unique; // 스페셜 구분 카드

    // 생성자
    public Card(int month, boolean unique) {
        this.month = month;
        this.unique = unique;
    }

    // 메서드
    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    @Override
    public String toString() {
        return "Card{" +
                "month=" + month +
                ", unique=" + unique +
                '}';
    }


    public int getMonth() {
        return month;
    }
}