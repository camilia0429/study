package exam02;

public class Schedule2 {
    private int year;
    private int month;
    private int day;

    public Schedule2() {
        this(2023,6,27);
        // this 위로는 코드가 존재할 수 X => 오류발생
    }
    public Schedule2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void printThis() {
        System.out.println(this);
        //this.getDay();
        //getDay();


    }

    @Override
    public String toString() {
        return "Schedule2{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

}
