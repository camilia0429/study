package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
//        s1.year = 2023;
//        s1.month = 7;
//        s1.day = 13;

        s1.setYear(2023);
        s1.setMonth(2);
        s1.setDay(31);

        int day = s1.getDay();
        System.out.println(day);

        System.out.println(s1); // s1.toString
    }//main
}
