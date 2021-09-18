public class Main {

    public static void main(String[] args) {
        Boolean sun = true;
        int onAccount = 100;
        int sumTicket = 5_000;


        if (sumTicket >= 1_000) {
            int bonus = (sumTicket / 100) + onAccount +sumTicket;
            System.out.println("Всего с бонусами:" + bonus);
        }else {
            int bonus = 0;
            int total = onAccount + sumTicket;
            System.out.println("Всего на счете:" + total);
        }

    }

}




















