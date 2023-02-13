public class Main {
    public static void main(String[] args) {
        int price = 13589; //стоимость билета
        int miliForPrice = 20; // 1 бонус за 20р стоимости
        int bonus = price / miliForPrice;
        System.out.println("Вам начислено " + bonus + " бонусных миль");
    }
}