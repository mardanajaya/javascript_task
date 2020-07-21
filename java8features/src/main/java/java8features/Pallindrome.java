package java8features;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Pallindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string elements by a space : ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        Object[] objects = PallindromeInterface.findPallindrome(arr);
        
        Consumer<Object> consumer = System.out::println;
        Arrays.stream(objects).forEach(consumer::accept);
    }
}