package exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new LinkedList<>(names);
//        ArrayList<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

//        System.out.println(names);

//        for(int i = 0; i < names.size(); i++) {
//            String name = names.get(i);
//            System.out.println(name);
//        }

        for(int i = names.size()-1; i >= 0; i--) {
            String name = names.remove(i);
            System.out.println(name);
        }

//         for(int i = 0; i < names.size(); i++) {
//             names.remove(i);
//         }

    }
}
