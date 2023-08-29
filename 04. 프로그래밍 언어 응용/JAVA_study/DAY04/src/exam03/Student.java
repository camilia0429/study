package exam03;

public class Student {
    static int id;
    String name;
    String subject;
/*public Student() {
    // 객체 생성 이후 처리할 작업
    // 멤버 변수의 초기화
    id = 1000;
    name = "학생1";
    subject = "과목1";
}*/
public Student(int id, String name, String subject) {
    this.id = id;
    this.name = name;
    this.subject = subject;
}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
    public static void staticMethod() {
        System.out.println("정적 메서드!");
    }
    public void instanceMethod() {
        id = 1000;
        staticMethod();
    }

    void showInfo() {
        System.out.println("id = "+id+", name = "+name+", subject = "+subject);
    }
}
