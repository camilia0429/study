package exam01;

public class Student {
    int id;
    String name;
    String subject;

    public Student() {  // 기본생성자. 컴파일러가 자동 추가
        // 객체 생성 이후 진행 될 작업
        // 멤버 변수의 초기화 작업
        id = 1000;
        name = "이름1";
        subject = "과목1";
    }

    public Student(int _id, String _name, String _subject) {
        id = _id;
        name = _name;
        subject = _subject;
    }


    void study() {
        System.out.printf("ID = %d, name = %s, subject - %s%n",id,name,subject);
    }
}
