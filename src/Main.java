public class Main {

    public static void main(String[] args) {
        Boolean sun = true;
        int onAccount = 100;
        int sumTicket = 5_000;

        int bonus;
        if (sumTicket <= 1_000) {
            bonus = 0;
            
        }else {
            bonus = sumTicket / 100;
            
        }
         int total = onAccount + sumTicket + bonus;
            System.out.println("Всего на счете:" + total);
            System.out.println("Всего бонусов:" + bonus);
    }

}
