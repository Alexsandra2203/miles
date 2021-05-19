public class Main {
    public static void main(String[] args) {
       double price = 40000.85; // стоимость билета с копейками
       int pricetiket = (int) price; // отсекаем цифры после запятой
       int bonus = 20;
       int bonusmiles = pricetiket / bonus;
       System.out.println(" Бонусных миль: "+bonusmiles );

    }
}

