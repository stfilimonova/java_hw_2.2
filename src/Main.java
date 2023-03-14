public class Main {
    public static void main(String[] args) {

        double account = 150;
        double refill = 1200;
        int bonus;

        if (refill > 1000) {
            bonus = (int) (refill / 100);
            refill = refill + bonus;
        } else {
            bonus = 0;
        }

        System.out.println("Количество бонусов за пополнение: " + bonus);
        System.out.println("Итоговый счет: " + (account + refill));
    }
}