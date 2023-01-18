public class Main {
    public static void main(String[] args) {
        int inintialAccount = 100;
        int addend = 800;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        if (addend < 1000) {
            bonus = 0;
        }
        int finalAccount = inintialAccount + addend + bonus;

        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Бонус: " + bonus);
    }
}