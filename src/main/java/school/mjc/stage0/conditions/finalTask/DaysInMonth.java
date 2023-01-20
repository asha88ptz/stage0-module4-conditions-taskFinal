package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("invalid date");
            return;
        }

        int amount;
        switch (month) {
            case 2:
                boolean isLeap = ((year % 4 == 0) && (year % 100) != 0) || (year % 400 == 0);
                amount = isLeap ? 29 : 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                amount = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                amount = 30;
                break;
            default:
                System.out.println("invalid date");
                return;

        }
        System.out.println(amount);
    }
}
