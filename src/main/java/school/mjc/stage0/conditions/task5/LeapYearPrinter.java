package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
//        int remainder= year % 400 == 0 || year % 100 == 0 || year % 4 == 0 ? 1 : 0;
        int remainder = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)?1:0;

        switch (remainder) {
            case 1:
                System.out.println("leap");
                break;
            case 0:
                System.out.println("not leap");
                break;
            default:
                System.out.println();
                break;
        }
    }
}

