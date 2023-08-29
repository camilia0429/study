package exam02;

public class practice {
    public static void main(String[] args) {
//        1
        int a = 20;
        double b = 3.0;
        int result1 = (int)(a+b);
        System.out.println(result1);

//        2

       for(int i = 1; i <=40; i++) {
           int roomNo = i % 10;
           System.out.println("학생"+i+", 방번호"+roomNo);
       }

//        3
        String floor ="5층";
        switch(floor) {
            case "1층" :
                System.out.println("약국입니다");
                break;
            case "2층" :
                System.out.println("정형외과입니다");
                break;
            case "3층" :
                System.out.println("피부과입니다");
                break;
            case "4층" :
                System.out.println("치과입니다");
                break;
            case "5층" :
                System.out.println("헬스클럽입니다");
                break;
            default :
                System.out.println("없는층입니다");
        }

//        4
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                if(i % 2 == 0) {
                    continue;
                } else {
                    System.out.println(i+"X"+j+"="+(i*j));
                }
            }
        }

//        5
        for(int i=2; i <10; i++){
            for(int j = 1; j < 10; j++) {
                if(j >= i) {
                    System.out.println(i+"X"+j+"="+(i*j));
                }
            }
        }





    }
}
