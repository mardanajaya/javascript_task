package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Enter size of list : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            list.add(s);
        }

        MyInterface myInterface = (strings)  -> {
            return list
                    .stream()
                    .filter(value -> value.charAt(0) == 'a' && value.length() == 3)
                    .collect(Collectors.toList());
        };

        System.out.println(myInterface.getMyA(list));
    }
}
