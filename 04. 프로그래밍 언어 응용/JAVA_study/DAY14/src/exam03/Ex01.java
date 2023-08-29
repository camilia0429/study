package exam03;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
//        1. 내용출력
        String[] fruits = {"Apple","Orange","Mango","Melon"};
//        Arrays.stream(fruits).forEach(System.out::print);
        Arrays.stream(fruits).map(String::toUpperCase).forEach(System.out::println);

//        1. 내용출력
        List<String> fruits2 = Arrays.asList("Apple","Orange","Mango","Melon");
        fruits2.stream().forEach(System.out::println);
    }//main
}
