package Lesson5;
public class newtask1 {
    public static void main(String[] args) {

        int month = 3;
        int day = 1;
        boolean isEquelToB = (month < 6 && month > 3) || (month == 3 && day >= 20) || (month == 6 && day <= 20);
        System.out.println(isEquelToB);

        int month1 = 5;
        int day1 = 12;
        boolean isEquelToB1 = (month1 < 6 && month1 > 3) || (month1 == 3 && day1 >= 20) || (month1 == 6 && day1 <= 20);
        System.out.println(isEquelToB1);

    }
}
