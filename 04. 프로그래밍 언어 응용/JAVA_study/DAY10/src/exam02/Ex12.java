package exam02;

public class Ex12 {
    public static void main(String[] args) {
        // trim(), strip(), stripLeading() : 왼쪽 공백제거, stripTrailing() : 오른쪽 공백 제거

        String str = "        abc        ";
        System.out.println(str.trim());

//        isEmpty() : 비어있는 상태('')
//        isBlank() : 공백을 포함한 비어있는 상태('','     ') str.trim().isEmpty()와 같은 형태
        String str2 = "     ";
        System.out.println("isEmpty() : "+str2.isEmpty());
        System.out.println("isBlank() : "+str2.isBlank());
    }
}
