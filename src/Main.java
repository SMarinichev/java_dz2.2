public class Main {
    public static void main(String[] args) {

        int count = 200;
        int refillCount = 2100;


        int bonus = refillCount > 1000 ? refillCount / 100 : 0;

        int totalCount = count + refillCount + bonus;


        System.out.println("Количество бонусных рублей");
        System.out.println(bonus);
        System.out.println("Итоговый баланс");
        System.out.println(totalCount);




    }
}